package OOPS;
class Mobile
{
    String brand;
    String model;
    double price;
    Mobile(String brand,String model,double price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void displaydetails()
    {
        System.out.println("Brand of mobile : "+brand);
        System.out.println("Model of mobile : "+model);
        System.out.println("Price of mobile : "+price);
        System.out.println("===================================");
    }
}
public class level02_c {
    public static void main(String[] args) {
        Mobile m1=new Mobile("Realme", "PX4", 16000);
        Mobile m2=new Mobile("APPLE", "iphone 17", 150000);
        m1.displaydetails();
        m2.displaydetails();
    }
}
