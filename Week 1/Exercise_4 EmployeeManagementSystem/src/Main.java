public class Main {

    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager(15);

        Employee employee1 = new Employee(100,"Vikram","HR",1000000.0);
        Employee employee2 = new Employee(101,"Isma","Security Analyst",1200000.0);
        Employee employee3 = new Employee(102,"Lokesh","Content Creater",800000.0);

        em.add(employee1);
        em.add(employee2);
        em.add(employee3);
        em.traverse();

        System.out.println(em.search(100));

        em.delete(102);
        em.traverse();

        em.delete(100);
        em.traverse();
    }
}