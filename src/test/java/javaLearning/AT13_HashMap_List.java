package javaLearning;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AT13_HashMap_List {

    @Test
    public void mapList() {
        // Creating a List of Maps
        List<Map<String, String>> listOfMaps = new ArrayList<>();

        // Creating and adding maps to the list
        Map<String, String> map1 = new HashMap<>();
        map1.put("Name", "John");
        map1.put("Age", "30");
        listOfMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Name", "Alice");
        map2.put("Age", "25");
        listOfMaps.add(map2);
    }
}
