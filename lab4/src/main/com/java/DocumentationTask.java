package src.main.com.java;

public class DocumentationTask extends Task {
    public DocumentationTask(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Executing documentation task: " + getName());
    }
}
