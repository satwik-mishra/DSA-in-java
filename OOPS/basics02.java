package OOPS;
class rectange
{
    double length;
    double width;
    double area()
    {
        return length*width;
    }
    double perimeter()
    {
        return 2*(length+width);
    }
}
public class basics02 {
    public static void main(String[] args) {
        rectange r1=new rectange();
        r1.length=12.2;
        r1.width=2.4;
        System.out.println("Area of rectange : "+r1.area());
        System.out.println("Perimeter of rectange : "+r1.perimeter());
    }
}
