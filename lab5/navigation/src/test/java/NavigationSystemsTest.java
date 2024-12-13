import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import maps.MapType;
import systems.BusNavigation;
import systems.CarNavigation;
import strategies.RouteStrategy;

class NavigationSystemTest {

    @Test
    void testCarNavigation() {
        MapType mockMapType = mock(MapType.class);
        RouteStrategy mockRouteStrategy = mock(RouteStrategy.class);
        double speed = 80.0;
        String startPoint = "Point A";
        String endPoint = "Point B";

        CarNavigation carNavigation = new CarNavigation(mockMapType, mockRouteStrategy, speed); 

        when(mockRouteStrategy.calculateRoute(startPoint, endPoint, speed))
            .thenReturn("Calculating the fastest route from Point A to Point B. Estimated time: 1.25 hours.");

        carNavigation.navigate(startPoint, endPoint);

        verify(mockMapType, times(1)).displayMap();
        verify(mockRouteStrategy, times(1)).calculateRoute(startPoint, endPoint, speed); 
    }

    @Test
    void testCarNavigationWithDifferentRoutes() {
        MapType mockMapType = mock(MapType.class);
        RouteStrategy fastestRoute = mock(RouteStrategy.class);
        double speed = 80.0;
        String startPoint = "Start";
        String endPoint = "End";

        CarNavigation carNavigation = new CarNavigation(mockMapType, fastestRoute, speed);

        when(fastestRoute.calculateRoute(startPoint, endPoint, speed))
            .thenReturn("Calculating the fastest route from Start to End. Estimated time: 1.50 hours.");

        carNavigation.navigate(startPoint, endPoint);

        verify(mockMapType, times(1)).displayMap();
        verify(fastestRoute, times(1)).calculateRoute(startPoint, endPoint, speed); 
    }

    @Test
    void testBusNavigation() {
        MapType mockMapType = mock(MapType.class);
        RouteStrategy fastestRoute = mock(RouteStrategy.class);
        double speed = 60.0;
        String startPoint = "Station A";
        String endPoint = "Station B";

        BusNavigation busNavigation = new BusNavigation(mockMapType, fastestRoute, speed);

        when(fastestRoute.calculateRoute(startPoint, endPoint, speed))
            .thenReturn("Calculating the fastest route from Station A to Station B. Estimated time: 2.00 hours.");

        busNavigation.navigate(startPoint, endPoint);

        verify(mockMapType, times(1)).displayMap();
        verify(fastestRoute, times(1)).calculateRoute(startPoint, endPoint, speed); 
    }
}
