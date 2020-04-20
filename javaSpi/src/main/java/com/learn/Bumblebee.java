package com.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String put = map.put("aa", "name");
        System.out.println(put);

        String aa = "aa";
        int i = aa.hashCode();
        System.out.println("hashcode=" + i);


//        List<String> list = new ArrayList<String>();
//        list.add("aa");
//        int hashCode = System.identityHashCode(list);
//        System.out.println(hashCode);
//        list.add("bb");
//        System.out.println(System.identityHashCode(list));
//        list.remove("bb");
//        System.out.println(System.identityHashCode(list));
    }

}
