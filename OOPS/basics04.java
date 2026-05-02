package OOPS;
class Car
{
    String brand;
    int speed;
    void accelerate()
    {
        speed=speed+10;
    }
    void displaydetails()
    {
        System.out.println("Brand of car is : "+brand);
        System.out.println("Speed of car is : "+speed);
        System.out.println("------------------------");
    }
}
public class basics04 {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand="BMW";
        c.speed=275;
        c.displaydetails();
        c.accelerate();
        c.displaydetails();
    }
}
