import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer , String> testMap = new HashMap<>();

        testMap.put(1 , "this is one");
        testMap.put(2 , "this is two");
        testMap.put(3 , "this is three");
        testMap.put(4 , "this is four");
        testMap.put(5 , "this is five");
        testMap.put(5 , "this is six");

        System.out.println(testMap.get(5));



    }

}
