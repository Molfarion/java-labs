package systems;
import maps.MapType;
import strategies.RouteStrategy;
public class CarNavigation extends NavigationSystem {
    private RouteStrategy routeStrategy; 

    public CarNavigation(MapType mapType, RouteStrategy routeStrategy) {
        super(mapType);
        this.routeStrategy = routeStrategy;
    }

    @Override
    public void navigate(String startPoint, String endPoint) {
        System.out.println("Car Navigation:");
        mapType.displayMap(); 
        routeStrategy.calculateRoute(startPoint, endPoint); 
    }
}
