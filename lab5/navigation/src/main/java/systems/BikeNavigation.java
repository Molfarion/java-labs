package systems;
import maps.MapType;
import strategies.RouteStrategy;
public class BikeNavigation extends NavigationSystem {
    private RouteStrategy routeStrategy;

    public BikeNavigation(MapType mapType, RouteStrategy routeStrategy) {
        super(mapType);
        this.routeStrategy = routeStrategy;
    }

    @Override
    public void navigate(String startPoint, String endPoint) {
        System.out.println("Bike Navigation:");
        mapType.displayMap();
        routeStrategy.calculateRoute(startPoint, endPoint);
    }
}