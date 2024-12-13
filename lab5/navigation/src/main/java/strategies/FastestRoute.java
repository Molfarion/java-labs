package strategies;

public class FastestRoute implements RouteStrategy {
    private double distance; 
    private final double speed;    

    public FastestRoute() {
        this.distance = 0.0;
        this.speed = 80.0; 
    }

    @Override
    public String calculateRoute(String startPoint, String endPoint) {
        this.distance = Math.random() * 200 + 50; 
        return "Calculating the fastest route from " + startPoint + " to " + endPoint;
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
        return String.format("Fastest Route: %.2f km, Estimated Time: %.2f hours", calculateDistance(), estimateTime());
    }
}
