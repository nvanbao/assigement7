
package assigement7;
import java.util.ArrayList;
public class searcharray {
     public static void main(String[] args) {
         ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");
        if (keywords.contains("Python")) {
            System.out.println("Python is in the list.");
        } else {
            System.out.println("Python is not in the list.");
        }
    }
}
