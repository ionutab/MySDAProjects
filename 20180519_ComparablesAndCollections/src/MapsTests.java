import java.util.HashMap;
import java.util.Map;

public class MapsTests {


    public static void testMaps(){

        System.out.println(" testing basic Map methods ");

        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        for(String k : map.keySet()){
            System.out.println(" key: " + k + " value: " + map.get(k));
        }

    }

}
