import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import maps.MapType;
import maps.RoadMap;
import maps.SatelliteMap;
import maps.TerrainMap;

class MapTypeTest {

    private MapType satelliteMap;
    private MapType roadMap;
    private MapType terrainMap;

    @BeforeEach
    void setUp() {
        satelliteMap = new SatelliteMap();
        roadMap = new RoadMap();
        terrainMap = new TerrainMap();
    }

    @Test
    void testMapDisplay() {
        assertMapTypeDisplay(satelliteMap, "Satellite Map");
        assertMapTypeDisplay(roadMap, "Road Map");
        assertMapTypeDisplay(terrainMap, "Terrain Map");
    }

    private void assertMapTypeDisplay(MapType map, String expected) {
        assertEquals(expected, map.getMapType());
    }

    @Test
    void testZoomInAndOut() {
        testZoomBehavior(satelliteMap, 1, 10);
        testZoomBehavior(roadMap, 1, 15);
        testZoomBehavior(terrainMap, 1, 20);
    }

    private void testZoomBehavior(MapType map, int minZoom, int maxZoom) {
        for (int i = 0; i < maxZoom; i++) {
            map.zoomIn();
        }
        assertEquals(maxZoom, map.getZoomLevel());
        map.zoomIn();
        assertEquals(maxZoom, map.getZoomLevel()); 

        for (int i = 0; i < maxZoom; i++) {
            map.zoomOut();
        }
        assertEquals(minZoom, map.getZoomLevel());
        map.zoomOut();
        assertEquals(minZoom, map.getZoomLevel());
    }

    @Test
    void testMapTypeConsistency() {
        assertNotEquals(satelliteMap.getMapType(), roadMap.getMapType(), "Satellite Map should not be equal to Road Map");
        assertNotEquals(satelliteMap.getMapType(), terrainMap.getMapType(), "Satellite Map should not be equal to Terrain Map");
        assertNotEquals(roadMap.getMapType(), terrainMap.getMapType(), "Road Map should not be equal to Terrain Map");

        assertEquals(satelliteMap.getMapType(), satelliteMap.getMapType(), "The same map should return the same type");
    }
}