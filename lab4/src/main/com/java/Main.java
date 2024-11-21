package src.main.com.java;

public class Main {
    public static void main(String[] args) {
        Project project = new SoftwareProject("AI Development Project");

        Task task1 = project.createTask("development", "Implement AI algorithm");
        Task task2 = project.createTask("testing", "Test AI performance");
        Task task3 = project.createTask("documentation", "Write project documentation");

        System.out.println("Project: " + project.getName());
        task1.execute();
        task2.execute();
        task3.execute();
    }
}
