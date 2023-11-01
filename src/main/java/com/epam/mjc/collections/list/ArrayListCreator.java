package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public static void main(String[] args) {
        System.out.println(2 % 3);
    }

    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newList = new ArrayList<>();
        if (sourceList.size() < 3) {
            return newList;
        }
        int index = 1;
        for (String item : sourceList) {
            if (index % 3 == 0) {
                newList.add(item);
                newList.add(item);
            }
            index++;
        }
        return newList;
    }
}
