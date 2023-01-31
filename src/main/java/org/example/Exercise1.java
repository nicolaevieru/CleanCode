package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    List<int[]> theList = Arrays.asList(new int[]{234, 355, 4}, new int[]{4, 10, 20}, new int[]{4, 20, 30});

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
