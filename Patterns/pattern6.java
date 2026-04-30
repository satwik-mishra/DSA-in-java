package Patterns;

public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int rows=1;rows<=5;rows++)
        {
            // printing spaces 
            for(int spaces=1;spaces<=n-rows;spaces++)
            {
                System.out.print(" ");
            }
            // printing stars
            for(int stars=1;stars<=rows*2-1;stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
 