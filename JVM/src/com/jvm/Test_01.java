package com.jvm;

import java.util.ArrayList;
import java.util.List;

public class Test_01 {
    public static void main(String[] args) {
        List<Demo> demosList = new ArrayList<>();
        while (true){
            demosList.add(new Demo());//不断消耗内存
        }
    }
}
