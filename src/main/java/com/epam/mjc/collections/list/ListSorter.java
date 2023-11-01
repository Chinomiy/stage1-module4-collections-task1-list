package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {

    public void sort(List<String> sourceList) {
        Comparator<String> comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int resultA = (int) (5 * (Math.pow(Integer.parseInt(a), 2) + 3));
        int resultB = (int) (5 * (Math.pow(Integer.parseInt(b), 2) + 3));

        return resultA - resultB;
    }
}
