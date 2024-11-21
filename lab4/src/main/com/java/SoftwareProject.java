package src.main.com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SoftwareProject extends Project {
    public SoftwareProject(String projectName) {
        super(projectName);
        if (projectName == null) {
            throw new IllegalArgumentException("Project name cannot be null");
        }
    }

    @Override
    public Task createTask(String taskType, String taskName) {
        Map<String, Function<String, Task>> taskMap = new HashMap<>();
        taskMap.put("development", DevelopmentTask::new);
        taskMap.put("testing", TestingTask::new);
        taskMap.put("documentation", DocumentationTask::new);

        Function<String, Task> taskCreator = taskMap.get(taskType);

        if (taskCreator == null) {
            throw new IllegalArgumentException("Unknown task type: " + taskType);
        }

        return taskCreator.apply(taskName);
    }
}