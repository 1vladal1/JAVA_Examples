package tests.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by vlad
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(0);
        linkedHashSet.add(4);
        linkedHashSet.add(8);
        linkedHashSet.add(6);

        System.out.println("linkedHashSet: " + linkedHashSet);

        Set<Integer> hashSet = new HashSet<Integer>(linkedHashSet);
        System.out.println("hashSet: " + hashSet);

        Set<Integer> treeSet = new TreeSet<Integer>(linkedHashSet);
        System.out.println("treeSet: " + treeSet);

    }
}
