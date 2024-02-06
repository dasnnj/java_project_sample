package com.jay;

import java.util.ArrayList;
import java.util.List;

public class TestSequenceCollection {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList.removeFirst());
        System.out.println(integerList.reversed());
    }
}
