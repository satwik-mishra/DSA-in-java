package OOPS;
class circle
{
    double radius;
    double area()
    {
        return Math.PI*radius*radius;
    }
}
public class basics03 {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.radius=2.3;
        System.out.println("Area of circle : "+c1.area());
    }
}
