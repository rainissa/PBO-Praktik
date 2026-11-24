import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        HashSet<String> countriesSet = new HashSet<String>();
        // Collections.sort(countriesSet);   

        ArrayList<String> countriesList = new ArrayList<String>();
        countriesList.add("Japan");
        countriesList.add("Brazil");
        Collections.sort(countriesList);
        System.out.println(countriesList);   
    }
}
