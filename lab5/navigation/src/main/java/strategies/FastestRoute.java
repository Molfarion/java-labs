package strategies;

public class FastestRoute implements RouteStrategy {
    @Override
    public String calculateRoute(String startPoint, String endPoint) {
        return "Calculating the fastest route from " + startPoint + " to " + endPoint;
    }
}