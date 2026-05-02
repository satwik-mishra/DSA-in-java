package OOPS;
class Book
{
    String title;
    String author;
    double price;
    Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displaydetails()
    {
        System.out.println("Ttile of the book : "+title);
        System.out.println("Author of the book : "+author);
        System.out.println("Price of the book + "+price);
        System.out.println("------------------------------------");
    }
}


class level02_b
{
    public static void main(String[] args) {
        Book b1=new Book("Web application hacker's handbook", "Dafydd Stuttard", 4000);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 699.50);
        b1.displaydetails();
        b2.displaydetails();
    }
}