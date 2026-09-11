import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}
public class stream2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ananya", "CSE", 240000),
            new Employee(2, "Arjun", "CSE", 400000),
            new Employee(3, "C", "IT", 800000),
            new Employee(4, "D", "Sales", 550000),
            new Employee(5, "T", "IT", 100000)
        );
        employees.stream().filter(e->e.salary>500000).forEach(System.out::println);

        Employee highest = employees.stream().max(Comparator.comparingDouble(e->e.salary)).orElse(null);
        System.out.println("Highest paid employee: " + highest);

        double avg = employees.stream().collect(Collectors.averagingDouble(e->e.salary));
        System.out.println("Average Salary: "+avg);

        Map<String,Long> count = employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
        System.out.println("Department wise count: "+count);

    }
}
