package maps;

public class TerrainMap implements MapType {
    private int zoomLevel;

    public TerrainMap() {
        this.zoomLevel = 1;
    }

    @Override
    public void displayMap() {
        System.out.println("Displaying Terrain Map.");
    }

    @Override
    public String getMapType() {
        return "Terrain Map";
    }

    @Override
    public void zoomIn() {
        if (zoomLevel < 20) {
            zoomLevel++;
            System.out.println("Zooming in on Terrain Map. Zoom level: " + zoomLevel);
        } else {
            System.out.println("Max zoom level reached for Terrain Map.");
        }
    }

    @Override
    public void zoomOut() {
        if (zoomLevel > 1) {
            zoomLevel--;
            System.out.println("Zooming out on Terrain Map. Zoom level: " + zoomLevel);
        } else {
            System.out.println("Min zoom level reached for Terrain Map.");
        }
    }

    @Override
    public int getZoomLevel() {
        return zoomLevel;
    }
}

