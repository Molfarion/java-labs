package strategies;

public class EconomicalRoute implements RouteStrategy {
    @Override
    public String calculateRoute(String startPoint, String endPoint) {
        return "Calculating the most economical route from " + startPoint + " to " + endPoint;
    }
}
