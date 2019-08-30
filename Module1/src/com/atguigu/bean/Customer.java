package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    public static void Customer() {
        //模板一：fori
        String[] arr = new String[]{"Tom","LiLei","HanMeiMei"};
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //变形：iter
        /*for (String s : arr) {
            System.out.println(s);
        }*/

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = getArrayList();

        for (Object o : list) {
            
        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //变形：list.forr,reserve order
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板五：ifn
        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn与xxx.null
        if (list == null) {

        }
        if (list != null) {

        }
    }

    public static ArrayList getArrayList() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Hello world,MJ!");
        Date date = new Date();
        Customer();
    }

}
