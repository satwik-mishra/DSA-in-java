package Collection_Framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class arraylists_01 {
    public static void main(String[] args) {
        // CREATING AN ARRAY LIST 
        ArrayList<Integer> arr1=new ArrayList<>();
        // ADDING ELEMENTS TO IT USING ADD() METHOD
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        // PRINTING THE ARRAY LIST
        System.out.println(arr1);
        System.out.println("---------------------------------------");
        // REMOVING ELEMENTS FROM "arr1" --> It asks for index position and not the element
        arr1.remove(0);
        System.out.println(arr1);
        System.out.println("---------------------------------------");
        // ADD ALL() METHOD 
        ArrayList<Integer>arr2=new ArrayList<>();
        arr2.add(100);
        arr2.add(200);
        arr2.add(300);
        arr1.addAll(arr2); // this adds all elements of arr2 in arr1
        System.out.println(arr1);
        System.out.println("---------------------------------------");
        // REMOVING ALL() METHOD
        arr2.removeAll(arr2);
        System.out.println(arr2);
        System.out.println("---------------------------------------");
        // CHECKING SIZE OF A LIST
        System.out.println("size of arr1 is : "+arr1.size());
        System.out.println("size of arr2 is : "+arr2.size());
        // CLEAR() = this removes all elements of the list
        System.out.println("Printing List 2 : "+arr2);
        arr2.clear();
        System.out.println("size of arr2 after clearing : "+arr2.size());
        // ITERATOR() = it is a method which is a standard way through which we can traverse through any of the collections
        // We need ARRAYLIST'S iterator to traverse through ARRAYLIST
        // We need LINKED LIST'S iterator to traverse through LINKEDLIST
        // We need STACK'S iterator to traverse through STACK
        // We need VECTOR'S iterator to traverse through VECTOR
        Iterator<Integer> iterator = arr1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element : "+iterator.next());
        }
        ArrayList<Integer>arr3=new ArrayList<>();
        arr3.add(10);
        arr3.add(20);
        arr3.add(30);
        // GET --> fetch by index position
        System.out.println(arr3.get(0));
        System.out.println(arr3.get(1));
        System.out.println(arr3.get(2));
        // SET --> set by index position 
        System.out.println("BEFORE SET : "+arr3);
        arr3.set(0, 100);
        System.out.println("AFTER SET : "+arr3);
        // TO ARRAY = to convert an arraylist/LinkedList/Stack/Vector to an array
        System.out.println("=================================");
        Object [] arr =arr3.toArray(); 
        for(Object obj:arr)
        {
            System.out.println(obj);
        }
        // CONTAINS()
        System.out.println("=================================");
        System.out.println(arr3.contains(100));

        // Printing entire List :
        arr1.add(70);
        arr1.add(60);
        arr1.add(50);
        System.out.println("ArrayList 1 : "+arr1);
        // SORT()
        Collections.sort(arr1);
        System.out.println("SORTED ARRAYLIST 1(ascending) :"+arr1);
        Collections.sort(arr1,Collections.reverseOrder());
        System.out.println("SORTED ARRAYLIST 1 (descending) : "+arr1);
        // clone()
        //ArrayList<Integer> newlist=(ArrayList<Integer>)arr1.clone();
        //System.out.println("Clone of arr1 : " + newlist);
        // ensureCapacity()
        ArrayList<Integer> newlist2=new ArrayList<>();
        newlist2.ensureCapacity(100);  // minimum capacity of the newlist2 will be 100 
        // isEmpty()
        //System.out.println("IS newlist empty? : "+newlist.isEmpty());
        System.out.println("Is newlist2 empty? : "+newlist2.isEmpty());
        // indexOf()
        System.out.println("Index of 40 : "+arr1.indexOf(40));
       }
}
