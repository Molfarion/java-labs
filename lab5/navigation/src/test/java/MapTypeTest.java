import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MapTypeTest {

    @Test
    void testSatelliteMapDisplay() {
        MapType satelliteMap = new SatelliteMap();
        
        assertDoesNotThrow(() -> satelliteMap.displayMap());

        assertEquals("Satellite Map", satelliteMap.getMapType());
    }

    @Test
    void testSchematicMapDisplay() {
        MapType schematicMap = new SchematicMap();
        
        assertDoesNotThrow(() -> schematicMap.displayMap());

        assertEquals("Schematic Map", schematicMap.getMapType());
    }

    @Test
    void testSatelliteMapZoomIn() {
        MapType satelliteMap = new SatelliteMap();
        
        assertEquals(1, satelliteMap.getZoomLevel());

        satelliteMap.zoomIn();
        assertEquals(2, satelliteMap.getZoomLevel());

        satelliteMap.zoomIn();
        assertEquals(3, satelliteMap.getZoomLevel());
    }

    @Test
    void testSatelliteMapZoomOut() {
        MapType satelliteMap = new SatelliteMap();
        
        assertEquals(1, satelliteMap.getZoomLevel());

        satelliteMap.zoomIn();
        assertEquals(2, satelliteMap.getZoomLevel());

        satelliteMap.zoomOut();
        assertEquals(1, satelliteMap.getZoomLevel());

        satelliteMap.zoomOut();
        assertEquals(1, satelliteMap.getZoomLevel());
    }

    @Test
    void testSchematicMapZoomIn() {
        MapType schematicMap = new SchematicMap();
        
        assertEquals(1, schematicMap.getZoomLevel());

        schematicMap.zoomIn();
        assertEquals(2, schematicMap.getZoomLevel());

        schematicMap.zoomIn();
        assertEquals(3, schematicMap.getZoomLevel());
    }

    @Test
    void testSchematicMapZoomOut() {
        MapType schematicMap = new SchematicMap();
        
        assertEquals(1, schematicMap.getZoomLevel());

        schematicMap.zoomIn();
        assertEquals(2, schematicMap.getZoomLevel());
        schematicMap.zoomOut();
        assertEquals(1, schematicMap.getZoomLevel());

        schematicMap.zoomOut();
        assertEquals(1, schematicMap.getZoomLevel());
    }

    @Test
    void testMapTypeConsistency() {
        MapType satelliteMap = new SatelliteMap();
        MapType schematicMap = new SchematicMap();
        
        assertNotEquals(satelliteMap.getMapType(), schematicMap.getMapType());
    }

    @Test
    void testNullMap() {
        MapType nullMap = null;

        assertThrows(NullPointerException.class, () -> {
            nullMap.displayMap();
        });
    }
}

