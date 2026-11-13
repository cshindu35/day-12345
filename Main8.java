import java.util.Main8;
public class Main8{
    public static void main(String[] args){
        Main8<Integer, String> students = new Main8<>();
        students.put(101,"John");
        students.put(102,"Alice");
        students.put(103,"David");
        students.put(104,"Robert");
        System.out.println("All Records: " + students);
        System.out.println("ID 102 Name: " + students.get(102));
        students.put(103,"David");
        students.remove(105);
        System.out.println("ID 101 exists: " + students.containsKey(101));
        System.out.println("Name John exists: " + students.containsKey("John"));
        System.out.println("Student IDs: " + students.keySet());
        System.outprintln("Student Names: " + students.values());
    }
}