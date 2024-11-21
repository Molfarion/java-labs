package src.main.com.java;

public class TestingTask extends Task {
    public TestingTask(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Executing testing task: " + getName());
    }
}
