package src.test.com.java.projects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.com.java.projects.*;


public class ProjectTest {

    @Test
    void testConstructorWithValidName() {
        String projectName = "New Software Project";
        SoftwareProject project = new SoftwareProject(projectName);
        assertNotNull(project);
        assertEquals(projectName, project.getName());
    }

    @Test
    void testConstructorWithNullName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new SoftwareProject(null); 
        });
        assertEquals("Project name cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCreationOfTaskWithInvalidTaskType() {
        Project project = new SoftwareProject("Oracle");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            project.createTask("unknown", "Some task name");
        });
        assertEquals("Unknown task type: unknown", exception.getMessage());
    }

}
