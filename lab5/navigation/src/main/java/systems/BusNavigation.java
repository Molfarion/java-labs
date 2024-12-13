package systems;

import maps.MapType;
import strategies.RouteStrategy;

public class BusNavigation extends NavigationSystem {
    private final RouteStrategy routeStrategy;
    private final double speed;

    public BusNavigation(MapType mapType, RouteStrategy routeStrategy, double speed) {
        super(mapType);
        this.routeStrategy = routeStrategy;
        this.speed = speed; 
    }

    @Override
    public void navigate(String startPoint, String endPoint) {
        System.out.println("Bus Navigation:"); 
        mapType.displayMap();
        String routeInfo = routeStrategy.calculateRoute(startPoint, endPoint, speed);
        System.out.println(routeInfo);
        String info = routeStrategy.getSummary();
        System.out.println(info);
    }
}
