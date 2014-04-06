package tests.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vlad
 */
public class TestList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(5);
        System.out.println("arrayList: " + arrayList);
        List<Integer> linkedList = new LinkedList<Integer>(arrayList);
        System.out.println("linkedList: " + linkedList);
    }
}
