package algorithms.sort;

import java.util.*;

/**
 * Created by vlad on 17.03.14.
 */
public class Test {
    final static long N_ELEMENTS = 1000;
    static Random rand = new Random();
    //static Sort sort = new Sort();
    static long startTime, endTime;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        System.out.println("Creating array. Size: " + N_ELEMENTS);
        for (int i = 0; i < N_ELEMENTS; i++) {
            list.add(rand.nextInt(Integer.MAX_VALUE));
        }
        list2.addAll(list);
        System.out.println("Start array sorting...");
        //startTime = System.currentTimeMillis();
        //sort.bubbleSort(list2);
        //endTime = System.currentTimeMillis();
        //System.out.println("Bubble Sort time: " + (endTime - startTime) / 1000.0d + " с");

        //list2.clear();
        //list2.addAll(list);
        startTime = System.currentTimeMillis();
        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer integer2) {
                return integer - integer2;
            }
        });
        endTime = System.currentTimeMillis();
        System.out.println("Sort time: " + (endTime - startTime) / 1000.0d + " с");
        //System.out.println(list);

        System.out.println("DONE");

    }


}
