package src.main.com.java.projects;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import src.main.com.java.tasks.*;

public class SoftwareProject extends Project {
    public SoftwareProject(String projectName) {
        super(projectName);
    }

    @Override
    public Task createTask(String taskType, String taskName) {
        if (taskType == null || taskName == null) {
            throw new IllegalArgumentException("Task type and task name must not be null.");
        }

        Map<String, Function<String, Task>> taskMap = new HashMap<>();
        taskMap.put("development", DevelopmentTask::new);
        taskMap.put("testing", TestingTask::new);
        taskMap.put("documentation", DocumentationTask::new);

        if (!taskMap.containsKey(taskType)) {
            throw new IllegalArgumentException("Unknown task type: " + taskType);
        }

        Function<String, Task> taskCreator = taskMap.get(taskType);
        return taskCreator.apply(taskName);
    }
}
