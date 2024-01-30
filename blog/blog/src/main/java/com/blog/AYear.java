package com.blog;

import java.util.Comparator;

public class AYear implements Comparator<A> {
    @Override
    public int compare(A o1, A o2) {
        return o1.getYear()-o2.getYear();
    }
}
