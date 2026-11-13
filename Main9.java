import java.util.LinkedHashMap;
public class Main9{
public static void main(String[] args){
    LinkedHashMap<Integer,String> books = new LinkedHashMap<>();
    LinkedHashMap<Integer,String> Issued = new LinkedHashMap<>();
    ArrayList<String> history = new ArrayList<>();
    allbooks.put(101,"Java");
    allbooks.put(102,"Python");
    allbooks.put(103,"C");
    allbooks.put(104,"C++");
    allbooks.put(105,"HTML");
    allbooks.put(106,"CSS");
    allbooks.put(107,"JavaScript");
    allbooks.put(108,"SQL");
    allbooks.put(109,"DBMS");
    allbooks.put(110,"Operating System");
    books.putAll(allbooks);
    System.out.println("Available Books:" + books);
    int Id = 101;
    String student = "John";
    if(books.containsKey(Id)){
        String name = books.remove(Id);
        issued.put(Id,student);
        history.add(name + "Issued to" + student);
        System.out.println(name + "issued successfully");

    }
    else{
        System.out.println("Book not available");
    }
    int returnid = 101;
    if(issued.containsKey(returnId)){
        String returnedBy = Issued.remove(returnId);
        String bookName = allBooks.get(returnId);
        books.put(returnId,"BookName");
        history.add("BookName returned");
        System.out.println("Book returned successfully");
        System.out.println("Available Books: " + books);
        System.out.println("Issued History:" + history);
    }
}
}




