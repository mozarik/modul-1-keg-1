package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class GenericArray {

    ArrayList<Generic<Integer, String>> list = new ArrayList<>();
    Generic<Integer, String> p1 = new Generic<>(1, "zen");
    Generic<Integer, String> p2 = new Generic<>(2, "zen2");
    Generic<Integer, String> p3 = new Generic<>(3, "zen3");


    public <K, V> void insertItem(Generic<K, V> item) {
//        String x = p1.toString();
//        String y = p2.toString();
//        String z = p3.toString();
//        list.add(x);
//        list.add(y);
//        list.add(z);
    }

    public int getTotalItem() {
        return list.size();
    }

    public void printList() {
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (Generic<Integer, String> str : list) {
            System.out.println(str);
        }

    }
}

