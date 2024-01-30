package com.blog;

import java.util.Comparator;

public class AName implements Comparator<A> {
    @Override
    public int compare(A o1, A o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
