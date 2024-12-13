package strategies;

public class ShortestRoute implements RouteStrategy {
    @Override
    public String calculateRoute(String startPoint, String endPoint) {
        return "Calculating the shortest route from " + startPoint + " to " + endPoint;
    }
}
