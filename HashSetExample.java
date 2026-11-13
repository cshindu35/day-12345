import java.util.HashSet;
public class HashSetExample{
    public static void main(String[] args){
        //Creating a HashSet
        HashSet<String> names = new HashSet<>();
        //Adding elements
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        //Adding duplicate element
        names.add("John");
        //Displaying the set
        System.out.println("HashSet: " + names);
        //Removing an element
        names.remove("David");
        //Checking an element
        System.out.println("Contains Alice: " + names.contains("Alice"));
        //Checking size
        System.out.println("Size:"+ names.size());
        //Checking if set is empty
        System.out.println("Is Empty:" + names.isEmpty());
    }
    
}