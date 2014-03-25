package algorithms.sort;

import java.util.List;

/**
 * Created by vlad on 17.03.14.
 */
public class Sort {
    public List<Integer> bubbleSort(List<Integer> array) {
        int tmp;
        for (int i = 0; i < array.size() - 1; i++)
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i) > array.get(j)) {
                    tmp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, tmp);
                }
            }
        return array;
    }

    public int[] quickSort(int[] array) {

        return array;
    }


}
