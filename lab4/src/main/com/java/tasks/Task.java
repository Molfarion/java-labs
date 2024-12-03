package src.main.com.java.tasks;

public abstract class Task {
    private String name;
    private String taskType;

    public Task(String name, String taskType) {
        this.name = name;
        this.taskType = taskType;
    }

    public String getName() {
        return name;
    }

    public String getTaskType() {
        return taskType;
    }

    public abstract void execute();
}

