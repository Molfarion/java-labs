package src.main.com.java;

public abstract class Project {
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getName() {
        return projectName;
    }

    public abstract Task createTask(String taskType, String taskName);
}
