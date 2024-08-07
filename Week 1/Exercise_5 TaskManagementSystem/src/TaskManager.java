import java.util.LinkedList;

public class TaskManager {

    Node head;
    Node tail;
    Node temp;
    Node prev;

    TaskManager(Node head) {
        this.head = head;
        this.tail = head;
    }

    void addTask(Task task){
        temp = new Node(task);
        tail.next = temp;
        tail = tail.next;
    }

    Task searchTask(int id){
        temp = head;
        while (temp != null){
            if(temp.task.getTaskId() == id)
                return temp.task;
            temp = temp.next;
        }
        return null;
    }

    void deleteTask(int id){
        temp = head;
        prev = null;
        while(temp != null){
            if(temp.task.getTaskId() == id){
                if(prev == null)
                    head = temp.next;
                else
                    prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    void traverse(){
        System.out.printf("%-20s %-20s %s\n","Task Id","Task Name","Status");
        temp = head;
        while(temp != null){
            Task currTask = temp.task;
            System.out.printf("%-20s %-20s %s\n",currTask.getTaskId(),currTask.getTaskName(),currTask.getStatus());
            temp = temp.next;
        }
    }


}
