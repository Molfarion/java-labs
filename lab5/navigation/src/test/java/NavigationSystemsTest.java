import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import maps.MapType;
import systems.BikeNavigation;
import systems.CarNavigation;
import strategies.RouteStrategy;
class NavigationSystemTest {

    private MapType mockMapType;
    private RouteStrategy mockRouteStrategy;
    private CarNavigation carNavigation;
    private BikeNavigation bikeNavigation;

    @BeforeEach
    void setUp() {
        mockMapType = mock(MapType.class);
        mockRouteStrategy = mock(RouteStrategy.class);

        carNavigation = new CarNavigation(mockMapType, mockRouteStrategy);
        bikeNavigation = new BikeNavigation(mockMapType, mockRouteStrategy);
    }

    @Test
    void testCarNavigation() {
        String startPoint = "Point A";
        String endPoint = "Point B";

        carNavigation.navigate(startPoint, endPoint);

        verify(mockMapType, times(1)).displayMap();
        verify(mockRouteStrategy, times(1)).calculateRoute(startPoint, endPoint);
    }

    @Test
    void testBikeNavigation() {
        String startPoint = "Location X";
        String endPoint = "Location Y";

        bikeNavigation.navigate(startPoint, endPoint);

        verify(mockMapType, times(1)).displayMap();
        verify(mockRouteStrategy, times(1)).calculateRoute(startPoint, endPoint);
    }

    @Test
    void testCarNavigationWithDifferentRoutes() {
        RouteStrategy fastestRoute = mock(RouteStrategy.class);
        carNavigation = new CarNavigation(mockMapType, fastestRoute);

        String startPoint = "Start";
        String endPoint = "End";

        carNavigation.navigate(startPoint, endPoint);

        verify(mockMapType, times(1)).displayMap();
        verify(fastestRoute, times(1)).calculateRoute(startPoint, endPoint);
    }

    @Test
    void testBikeNavigationWithDifferentMap() {
        MapType satelliteMap = mock(MapType.class);
        bikeNavigation = new BikeNavigation(satelliteMap, mockRouteStrategy);

        String startPoint = "Origin";
        String endPoint = "Destination";

        bikeNavigation.navigate(startPoint, endPoint);

        verify(satelliteMap, times(1)).displayMap();
        verify(mockRouteStrategy, times(1)).calculateRoute(startPoint, endPoint);
    }
}
