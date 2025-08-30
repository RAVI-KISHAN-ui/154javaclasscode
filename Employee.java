import java.util.Scanner;

public class Employee {
    String name;
    int salary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextInt();

        sc.close();
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getDetails();      
        emp.displayDetails();  
    }
}
