import java.util.*; 
abstract class Employee { 
String name; 
double salary; 
Employee(String a, double b) { 
this.name = a; 
this.salary = b; 
} 
abstract void calculateSalary(); 
} 
class FullTimeEmp extends Employee { 
FullTimeEmp(String a, double b) { 
super(a, b); 
    } 
    @Override
    void calculateSalary() { 
        System.out.println("Employee Type: Full Time"); 
        System.out.println("Name: " + name); 
        System.out.println("Monthly Salary: " + salary); 
    } 
} 
class PartTimeEmployee extends Employee { 
    PartTimeEmployee(String a, double b) { 
        super(a, b); 
    } 
    @Override
    void calculateSalary() { 
        System.out.println("Employee Type: Part Time"); 
        System.out.println("Name: " + name); 
        System.out.println("Salary: " + salary); 
    } 
} 
public class Solution { 
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("1 - Full Time Employee"); 
        System.out.println("2 - Part Time Employee"); 
        System.out.print("Enter choice: "); 
        int choice = sc.nextInt(); 
        sc.nextLine(); 
        System.out.print("Enter Employee Name: "); 
        String name = sc.nextLine(); 
        System.out.print("Enter Salary: "); 
        double salary = sc.nextDouble(); 
        if (choice == 1) { 
            FullTimeEmp emp = new FullTimeEmp(name, salary); 
            emp.calculateSalary(); 
        }  
        else if (choice == 2) { 
            PartTimeEmployee emp = new PartTimeEmployee(name, salary); 
            emp.calculateSalary(); 
        }  
        else { 
            System.out.println("Invalid choice"); 
        } 
        }
    } 
}