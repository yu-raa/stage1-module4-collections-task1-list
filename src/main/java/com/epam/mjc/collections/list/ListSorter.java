package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInteger = Integer.parseInt(a);
        int bInteger = Integer.parseInt(b);
        if (func(aInteger) != func(bInteger)) {
            return func(aInteger) - func(bInteger);
        }
        else {
            return aInteger - bInteger;
        }
    }

    private int func(int x) {
        return 5 * x * x + 3;
    }
}
