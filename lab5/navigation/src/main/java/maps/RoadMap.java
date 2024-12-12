package maps;

public class RoadMap implements MapType {
    private int zoomLevel;

    public RoadMap() {
        this.zoomLevel = 1;
    }

    @Override
    public void displayMap() {
        System.out.println("Displaying Road Map.");
    }

    @Override
    public String getMapType() {
        return "Road Map";
    }

    @Override
    public void zoomIn() {
        if (zoomLevel < 15) {
            zoomLevel++;
            System.out.println("Zooming in on Road Map. Zoom level: " + zoomLevel);
        } else {
            System.out.println("Max zoom level reached for Road Map.");
        }
    }

    @Override
    public void zoomOut() {
        if (zoomLevel > 1) {
            zoomLevel--;
            System.out.println("Zooming out on Road Map. Zoom level: " + zoomLevel);
        } else {
            System.out.println("Min zoom level reached for Road Map.");
        }
    }

    @Override
    public int getZoomLevel() {
        return zoomLevel;
    }
}

