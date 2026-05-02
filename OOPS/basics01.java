package OOPS;
class Student
{
    String name;
    int age;
    double marks;
     void displaydetails()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
        System.out.println("-----------------------");
    }
}
class basics01
{
    public static void main(String[] args) {
        // first student
        Student obj1=new Student();
        obj1.name="Rahul";
        obj1.age=20;
        obj1.marks=95;
        // second student
        Student obj2=new Student();
        obj2.name="Satwik";
        obj2.age=21;
        obj2.marks=98;
        obj1.displaydetails();
        obj2.displaydetails();
    }
}
