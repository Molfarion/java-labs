package src.main.com.java.tasks;

public class DevelopmentTask extends Task {
    public DevelopmentTask(String name) {
        super(name, "development");
    }

    @Override
    public void execute() {
        System.out.println("Executing development task: " + getName());
    }
}
