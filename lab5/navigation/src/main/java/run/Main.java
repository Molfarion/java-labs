package run;
import maps.MapType;
import maps.SatelliteMap;
import maps.TerrainMap;
import strategies.EconomicalRoute;
import strategies.FastestRoute;
import strategies.RouteStrategy;
import systems.BusNavigation;
import systems.CarNavigation;
import systems.NavigationSystem;

public class Main {
    public static void main(String[] args) {
        MapType satelliteMap = new SatelliteMap();
        MapType schematicMap = new TerrainMap();

        RouteStrategy fastestRoute = new FastestRoute();
        RouteStrategy economicalRoute = new EconomicalRoute();

        NavigationSystem carNav = new CarNavigation(satelliteMap, fastestRoute, 90);
        carNav.navigate("Point A", "Point B");

        NavigationSystem busNav = new BusNavigation(schematicMap, economicalRoute,50);
        busNav.navigate("Point C", "Point D");
    }
}