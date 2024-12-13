package strategies;

public class EconomicalRoute implements RouteStrategy {
    private double distance;   
    private final double fuelEfficiency; 
    private final double fuelPrice;  

    public EconomicalRoute() {
        this.distance = 0.0;
        this.fuelEfficiency = 5.0; 
        this.fuelPrice = 1.5;     
    }

    @Override
    public String calculateRoute(String startPoint, String endPoint, double speed) {
        this.distance = Math.random() * 100 + 30; 
        double time = this.distance / speed; 
        return "Calculating the most economical route from " + startPoint + " to " + endPoint + 
               ". Estimated time: " + String.format("%.2f", time) + " hours.";
    }

    @Override
    public double estimateTime() {
        double averageSpeed = 60.0; 
        return distance / averageSpeed;
    }

    @Override
    public double calculateDistance() {
        return distance;
    }

    public double calculateFuelCost() {
        return (distance / 100) * fuelEfficiency * fuelPrice;
    }

    @Override
    public String getSummary() {
        return String.format("Economical Route: %.2f km, Estimated Time: %.2f hours, Fuel Cost: %.2f",
                calculateDistance(), estimateTime(), calculateFuelCost());
    }
}
