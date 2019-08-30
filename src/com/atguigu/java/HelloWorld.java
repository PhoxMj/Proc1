package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {
    private static final int INITIAL_SIZE = 10;
    private static int num;

    public static void main(String[] args) {

        //region Description
        System.out.println("Hello world,Jay!");
        //endregion

        ArrayList arrayList = new ArrayList();

        arrayList.add(0,123);

//        methd();
    }

    public static void methd() {
        num = 1;

        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
