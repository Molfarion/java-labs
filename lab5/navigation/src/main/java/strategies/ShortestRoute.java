package strategies;

public class ShortestRoute implements RouteStrategy {
    private double distance; 
    private final double speed;    

    public ShortestRoute() {
        this.distance = 0.0;
        this.speed = 50.0; 
    }

    @Override
    public String calculateRoute(String startPoint, String endPoint) {
        this.distance = Math.random() * 150 + 20; 
        return "Calculating the shortest route from " + startPoint + " to " + endPoint;
    }

    @Override
    public double estimateTime() {
        return distance / speed;
    }

    @Override
    public double calculateDistance() {
        return distance;
    }

    @Override
    public String getSummary() {
        return String.format("Shortest Route: %.2f km, Estimated Time: %.2f hours", calculateDistance(), estimateTime());
    }
}
