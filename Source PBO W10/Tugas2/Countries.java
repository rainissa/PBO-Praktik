import java.util.*;

public class Countries {
    public static void main(String[] args){
        HashSet<String> countries = new HashSet<String>();
        System.out.println(countries.add("Indonesia"));
        System.out.println(countries.add("Japan"));
        System.out.println(countries.add("Brazil"));
        System.out.println(countries.add("Canada"));
        System.out.println(countries.add("Germany"));
        System.out.println(countries.add("Japan"));

        System.out.println("Jumlah negara: " + countries.size());
        System.out.println(countries);
    }
}