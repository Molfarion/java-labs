import static org.junit.jupiter.api.Assertions.assertEquals;
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
        String result = fastestRoute.calculateRoute("A", "B");
        assertEquals("Calculating the fastest route from A to B", result);
    }

    @Test
    void testShortestRoute() {
        String result = shortestRoute.calculateRoute("X", "Y");
        assertEquals("Calculating the shortest route from X to Y", result);
    }

    @Test
    void testEconomicalRoute() {
        String result = economicalRoute.calculateRoute("Start", "End");
        assertEquals("Calculating the most economical route from Start to End", result);
    }
}
