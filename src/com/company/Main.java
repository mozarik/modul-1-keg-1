package com.company;

import org.jetbrains.annotations.TestOnly;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        usingGeneric();
        Generic<String, Integer> p1 = new Generic<>("zein", 2);
        System.out.println(p1.toString());

        GenericArray ok = new GenericArray();
        System.out.println("========================");
        ok.printList();
    }

    public static void usingGeneric() {
        Generic<String, String> test = new Generic<>("aKey", "aValue");
        ArrayList<String> pop = new ArrayList<>();
        String a = test.toString();
        pop.add(a);

        System.out.println("Using Enhanced for loop");
        System.out.println("-----------------------");
        for (String str : pop) {
            System.out.println(str);
        }
    }
}
