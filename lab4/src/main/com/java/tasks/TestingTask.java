package src.main.com.java.tasks;

public class TestingTask extends Task {
    public TestingTask(String name) {
        super(name, "testing");
    }

    @Override
    public void execute() {
        System.out.println("Executing testing task: " + getName());
    }
}
