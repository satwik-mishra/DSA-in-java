package OOPS;
class calculator
{
    int a;
    int b;
    int add(int a,int b)
    {
        return a+b;
    }
    int subtract(int a,int b)
    {
        return a-b;
    }
    double multiply(int a,int b)
    {
        return a*b;
    }
    double divide(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Division by 0 not allowed");
            return 0;

        }
        else
            return a/b;
    }
}
public class level03_a {
    public static void main(String[] args) {
        calculator c1=new calculator();
        System.out.println("Addition: " + c1.add(10, 5));
        System.out.println("Subtraction: " + c1.subtract(10, 5));
        System.out.println("Multiplication: " + c1.multiply(10, 5));
        System.out.println("Division: " + c1.divide(10, 3));
    }
}
