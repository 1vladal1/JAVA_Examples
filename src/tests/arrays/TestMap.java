package tests.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by vlad
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(7, "seven");
        linkedHashMap.put(1, "one");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(10, "ten");
        linkedHashMap.put(3, "three");
        System.out.println("linkedHashMap: " + linkedHashMap);

        Map<Integer, String> hashMap = new HashMap<Integer, String>(linkedHashMap);
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(linkedHashMap);
        System.out.println("hashMap: " + hashMap);
        System.out.println("treeMap: " + treeMap);
    }
}
