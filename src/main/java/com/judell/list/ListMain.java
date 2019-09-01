package com.judell.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println("List size before add: " + list.size());
        list.add("test");
        System.out.println("List size after add: " + list.size());
    }
}
