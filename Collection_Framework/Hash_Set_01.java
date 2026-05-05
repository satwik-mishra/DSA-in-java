package Collection_Framework;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_Set_01 {
    public static void main(String[] args) {
        // CREATING A SET
        Set <Integer> set1=new HashSet<>();
        Set <Integer> set2=new HashSet<>();
        // INSERTING ELEMENTS IN A SET
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
        System.out.println(set1); // ordering is not preserved
        // retainAll = intersection of 2 sets
        //set1.retainAll(set2);
        //System.out.println(set1);
        // containsAll = does set 1 contains all elements of set 2 ?
        System.out.println("Set 1 : "+set1);
        System.out.println("Set 2 : "+set2);
        System.out.println(set1.containsAll(set2)); // returns TRUE/FALSE
        //  LINKED HASHED SET  --> order is preserved
        Set <Integer> linkedhashedset1 = new LinkedHashSet<>();
        linkedhashedset1.add(50);
        linkedhashedset1.add(40);
        linkedhashedset1.add(30);
        linkedhashedset1.add(20);
        linkedhashedset1.add(10);
        System.out.println(linkedhashedset1);
        // TREE SET --> prints output in sorted format  
        TreeSet < Integer> treeset1 = new TreeSet<>();
        treeset1.add(40);
        treeset1.add(30);
        treeset1.add(20);
        treeset1.add(10);
        System.out.println(treeset1);
    }
}
