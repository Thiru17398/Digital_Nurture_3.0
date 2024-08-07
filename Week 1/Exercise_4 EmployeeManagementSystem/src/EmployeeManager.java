public class EmployeeManager {
    Employee[] employees;
    public int capacity;
    public int size;

    EmployeeManager(int capacity){
        this.capacity = capacity;
        employees = new Employee[capacity];
        size = 0;
    }

    public void add(Employee employee){
        if(size == capacity - 1 ){
            System.out.println("Array is full !");
            return;
        }
        employees[size] = employee;
        size++;
    }

    public Employee search(int id){
        for(Employee employee : this.employees){
            if(employee.getId() == id)
                return employee;
        }
        return null;
    }

    public void traverse(){
        System.out.printf("%-20s %-20s %-20s %s\n","Employee Id","Employee Name","Position","Salary");
        for(int i = 0;i < size;i++){
            Employee employee = employees[i];
            System.out.printf("%-20s %-20s %-20s %s\n",employee.getId(),employee.getName(),employee.getPosition(),employee.getSalary());
        }
    }

    public void delete(int id){
        int j = 0;
        for(int i = 0;i < size;i++){
            int currId = employees[i].getId();
            if(currId != id)
                employees[j++] = employees[i];
        }
        while(j < capacity)
            employees[j++] = null;
        size--;
    }
}
