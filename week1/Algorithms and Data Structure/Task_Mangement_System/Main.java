package Task_Mangement_System;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        Task t1 = new Task("T001", "Design Database", "Pending");
        Task t2 = new Task("T002", "Develop API", "In Progress");
        Task t3 = new Task("T003", "Test Application", "Completed");

        
        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        
        System.out.println("\nSearch Task T002:");
        Task searchResult = taskList.searchTask("T002");
        System.out.println(searchResult != null ? searchResult : "Task not found");

        
        System.out.println("\nDelete Task T002:");
        taskList.deleteTask("T002");
        taskList.traverseTasks();
    }
}
