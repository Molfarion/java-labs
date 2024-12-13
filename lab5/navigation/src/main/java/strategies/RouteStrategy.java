package strategies;

public interface RouteStrategy {
    String calculateRoute(String startPoint, String endPoint);
    double estimateTime(); 
    double calculateDistance(); 
    String getSummary();
}
