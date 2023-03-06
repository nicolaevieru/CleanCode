package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public List<int[]> getThem(List<int[]> theList) {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
