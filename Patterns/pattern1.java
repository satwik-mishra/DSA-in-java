package Patterns;

import java.util.Scanner;

// solid square pattern 
public class pattern1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a value of n");
        int n=ob.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        ob.close();
    }
}
