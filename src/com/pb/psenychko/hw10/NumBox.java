package com.pb.psenychko.hw10;

import java.util.List;

import java.util.*;

public class NumBox<T extends Number> {

    private int leng;
    private List<T> list;

    public void add(T num) {
        if (list.size() < leng)
            list.add(num);
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int length() {
        return list.toArray().length;
    }

    public NumBox(int size) {
        this.leng = size;
        list = new ArrayList<>(size);
    }

    public double average() {
            double sum = 0;
        for (T n : list) {
            sum += n.doubleValue();
        }
        return sum / list.size();
    }

    public double sum() {
        double sum = 0;
        for (T n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public T max() {
        T maxValue = list.get(0);
        for (T t : list) {
            if (t.doubleValue() > maxValue.doubleValue())
                maxValue = t;
        }
        return maxValue;
    }

    public T get(int index) {
        T t = this.list.get(index);
        return t;
    }

}