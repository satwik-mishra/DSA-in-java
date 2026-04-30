package Patterns;
// inverted right angled triangle
public class pattern5 {
    public static void main(String[] args) {
        int n=5; 
        for(int rows=1;rows<=n;rows++)
        {
            for(int columns=1;columns<=n-rows+1;columns++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
