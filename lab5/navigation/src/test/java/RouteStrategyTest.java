import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import strategies.EconomicalRoute;
import strategies.FastestRoute;
import strategies.RouteStrategy;
import strategies.ShortestRoute;
class RouteStrategyTest {

    private RouteStrategy fastestRoute;
    private RouteStrategy shortestRoute;
    private RouteStrategy economicalRoute;

    @BeforeEach
    void setUp() {
        fastestRoute = new FastestRoute();
        shortestRoute = new ShortestRoute();
        economicalRoute = new EconomicalRoute();
    }

    @Test
    void testFastestRoute() {
        String result = fastestRoute.calculateRoute("A", "B", 120);
        assertTrue(result.contains("Calculating the fastest route"));
        assertTrue(fastestRoute.estimateTime() > 0);
        assertTrue(fastestRoute.calculateDistance() > 0);
        System.out.println(fastestRoute.getSummary());
    }

    @Test
    void testShortestRoute() {
        String result = shortestRoute.calculateRoute("X", "Y", 90);
        assertTrue(result.contains("Calculating the shortest route"));
        assertTrue(shortestRoute.estimateTime() > 0);
        assertTrue(shortestRoute.calculateDistance() > 0);
        System.out.println(shortestRoute.getSummary());
    }

    @Test
    void testEconomicalRoute() {
        String result = economicalRoute.calculateRoute("Start", "End", 50.0);
        assertTrue(result.contains("Calculating the most economical route"));
        assertTrue(economicalRoute.estimateTime() > 0);
        assertTrue(economicalRoute.calculateDistance() > 0);
        System.out.println(economicalRoute.getSummary());
    }
}
