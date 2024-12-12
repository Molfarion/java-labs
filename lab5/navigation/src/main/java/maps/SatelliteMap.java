package maps;

public class SatelliteMap implements MapType {
    private int zoomLevel;

    public SatelliteMap() {
        this.zoomLevel = 1;
    }

    @Override
    public void displayMap() {
        System.out.println("Displaying Satellite Map.");
    }

    @Override
    public String getMapType() {
        return "Satellite Map";
    }

    @Override
    public void zoomIn() {
        if (zoomLevel < 10) {
            zoomLevel++;
            System.out.println("Zooming in on Satellite Map. Zoom level: " + zoomLevel);
        } else {
            System.out.println("Max zoom level reached for Satellite Map.");
        }
    }

    @Override
    public void zoomOut() {
        if (zoomLevel > 1) {
            zoomLevel--;
            System.out.println("Zooming out on Satellite Map. Zoom level: " + zoomLevel);
        } else {
            System.out.println("Min zoom level reached for Satellite Map.");
        }
    }

    @Override
    public int getZoomLevel() {
        return zoomLevel;
    }
}
