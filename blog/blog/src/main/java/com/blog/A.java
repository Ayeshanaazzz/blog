package com.blog;

public class A implements Comparable<A> {
    public A(String name, int rate, int year) {
        this.name = name;
        this.rate = rate;
        this.year = year;
    }

    private String  name;
    private int rate;
    private int year;

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(A o) {
        return this.year-o.year;
    }
}
