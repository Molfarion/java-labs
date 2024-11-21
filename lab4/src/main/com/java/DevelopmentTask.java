package src.main.com.java;

public class DevelopmentTask extends Task {
    public DevelopmentTask(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Executing development task: " + getName());
    }
}
