package com.codecool.hashmap;


public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        for (int i = 1; i <=17; i++) {
            hashMap.add("key" + i, i);
        }
        System.out.println(hashMap);
        System.out.println(hashMap.getValue("key14"));
        hashMap.remove("key14");
        System.out.println(hashMap.getValue("key14"));
        hashMap.clearAll();
        System.out.println(hashMap);
    }
}

