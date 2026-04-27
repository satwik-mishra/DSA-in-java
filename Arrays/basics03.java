package Arrays;

import java.util.Scanner;

// Linear search
public class basics03 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a target");
        int target=ob.nextInt();
        boolean flag=false;
        int arr[]={1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(target+" is present in index "+i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(target+" is not present in the array");
        }

        ob.close();
    }
}
