package src.main.com.java.projects;

import src.main.com.java.tasks.Task;

public abstract class Project {
    private String projectName;

    public Project(String projectName) {
        if (projectName == null || projectName.isEmpty()) {
            throw new IllegalArgumentException("Project name cannot be null or empty");
        }
        this.projectName = projectName;
    }

    public String getName() {
        return projectName;
    }

    public abstract Task createTask(String taskType, String taskName);
}

