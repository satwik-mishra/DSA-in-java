package Patterns;
// solid rectangle pattern
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int rows=ob.nextInt();
        int columns=ob.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        ob.close();
    }
}
