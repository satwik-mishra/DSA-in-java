package Collection_Framework.ArrayList_practice;

import java.util.ArrayList;

public class basics01 {
    public static void main(String[] args) {
        //  Add 5 integers to an ArrayList and print them
        ArrayList <Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println("Numbers in the list are :");
        for(int num : list1)
        {
            System.out.println(num);
        }
        // Find size of the list 
        System.out.println("The size of List1 is : "+list1.size());
        // Get element at index 2 
        System.out.println("Element at index 2 is : "+list1.get(2));
        // Check if a number exists in the ArrayList
        System.out.println(list1.contains(2));
        // Remove all even numbers 
        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i)%2==0)
            {
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);
        // Reverse an ArrayList
        
    }
}
