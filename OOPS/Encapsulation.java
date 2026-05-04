package OOPS;
class Student
{
    private String name;
    private int age;
    // public getter for name
    public String getName()
    {
        return name;
    }
    // public setter for name
    public void setName(String name)
    {
        this.name=name;
    }
    // public getter for age 
    public int getAge()
    {
        return age;
    }
    // public setter for age()
    public void setAge(int age)
    {
        if(age>18 && age<110)
        this.age=age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setAge(20);
        s1.setName("satwik");
        System.out.println("Name of student is : "+s1.getName());
        System.out.println("Age of student is : "+s1.getAge());
    }
}
