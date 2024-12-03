package src.main.com.java.tasks;

public class DocumentationTask extends Task {
    public DocumentationTask(String name) {
        super(name, "documentation");
    }

    @Override
    public void execute() {
        System.out.println("Executing documentation task: " + getName());
    }
}
