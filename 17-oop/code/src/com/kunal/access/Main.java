package com.kunal.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Kunal");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>(23);
//        list.DEFAULT_CAPACITY;

        obj.getNum();// this is getter
        int n = obj.num;//we can access num here
    }
}
