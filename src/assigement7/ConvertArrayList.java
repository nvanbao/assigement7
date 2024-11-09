
package assigement7;
import java.util.ArrayList;
public class ConvertArrayList {  

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);      
        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array);
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
