package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newList = new LinkedList<>();
        if (sourceList.isEmpty()) {
            return newList;
        }
        for (Integer item : sourceList) {
            if (item % 2 == 0) {
                newList.addLast(item);
            } else {
                newList.addFirst(item);
            }
        }
        return newList;
    }
}
