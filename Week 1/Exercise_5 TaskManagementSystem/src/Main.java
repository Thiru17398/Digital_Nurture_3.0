public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(100,"Coding","Pending");
        Task task2 = new Task(101,"Designing","Completed");
        Task task3 = new Task(102,"Resource Gathering","Completed");

        Node head = new Node(task1);
        TaskManager taskManager = new TaskManager(head);

        taskManager.addTask(task2);
        taskManager.addTask(task3);

        taskManager.traverse();

        taskManager.deleteTask(101);
        taskManager.traverse();

        System.out.println(taskManager.searchTask(100));


    }
}