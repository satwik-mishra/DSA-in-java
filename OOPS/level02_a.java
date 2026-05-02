package OOPS;
class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void displaydetails()
    {
        System.out.println("Name of Employee : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Salary of Employee : "+salary);
        System.out.println("------------------------------------------");
    }
}
public class level02_a {
    public static void main(String[] args) {
        Employee e1=new Employee(123, "Satwik", 100000);
        Employee e2=new Employee(124, "Anwesha", 100000);
        e1.displaydetails();
        e2.displaydetails();
    }
}
