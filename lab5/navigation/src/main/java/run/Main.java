package run;

import maps.MapType;
import maps.SatelliteMap;
import maps.TerrainMap;
import strategies.EconomicalRoute;
import strategies.FastestRoute;
import strategies.RouteStrategy;
import strategies.ShortestRoute;
import systems.BusNavigation;
import systems.CarNavigation;
import systems.NavigationSystem;

public class Main {

    public static void main(String[] args) {
        runNavigationScenario(new SatelliteMap(), new FastestRoute(), 90, "Scenario 1: Car Navigation with Fastest Route and Satellite Map", "Point A", "Point B");
        
        runNavigationScenario(new TerrainMap(), new EconomicalRoute(), 50, "Scenario 2: Bus Navigation with Economical Route and Terrain Map", "Point C", "Point D");

        runNavigationScenario(new TerrainMap(), new EconomicalRoute(), 80, "Scenario 3: Car Navigation with Economical Route and Terrain Map", "Point E", "Point F");

        runNavigationScenario(new SatelliteMap(), new FastestRoute(), 40, "Scenario 4: Bus Navigation with Fastest Route and Satellite Map", "Point G", "Point H");

        runNavigationScenario(new TerrainMap(), new ShortestRoute(), 60, "Scenario 5: Car Navigation with Shortest Route and Terrain Map", "Point I", "Point J");

        runNavigationScenario(new TerrainMap(), new ShortestRoute(), 30, "Scenario 6: Bus Navigation with Shortest Route and Terrain Map", "Point K", "Point L");
    }

    private static void runNavigationScenario(MapType map, RouteStrategy routeStrategy, double speed, String scenarioDescription, String startPoint, String endPoint) {
        System.out.println("-".repeat(30));
        System.out.println(scenarioDescription);
        NavigationSystem navigationSystem;

        switch (routeStrategy.getClass().getSimpleName()) {
            case "FastestRoute":
                navigationSystem = new CarNavigation(map, routeStrategy, speed); 
                break;
            case "EconomicalRoute":
                navigationSystem = new BusNavigation(map, routeStrategy, speed); 
                break;
            case "ShortestRoute":
                navigationSystem = new CarNavigation(map, routeStrategy, speed); 
                break;
            default:
                navigationSystem = new BusNavigation(map, routeStrategy, speed); 
                break;
        }

        navigationSystem.navigate(startPoint, endPoint);
        System.out.println("-".repeat(30));
        System.err.println();
    }
}
