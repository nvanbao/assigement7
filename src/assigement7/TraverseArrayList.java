package assigement7;

import java.util.ArrayList;

public class TraverseArrayList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("Ho Chi Minh");
        cities.add("Ha Noi");
        cities.add("Hai Phong");
        cities.add("An Giang");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
