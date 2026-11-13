import java.util.*;
public class Main7{
    public static void main(String[] args){
        Set<String> products = new LinkedHashSet<>
        (Arrays.asList("Laptop","Mobile","Headphones","Smart Watch"));
        products.add("Laptop");
        System.out.println("All products: " + products);
        products.remove("Headphones");
        products.add("Tablet");
        System.out.println("Mobile exists: " + products.contains("Mobile"));
        System.out.println("Final list: " + products);
    }
}