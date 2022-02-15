package com.wzc.javase.about.collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(100);
        list.add("1");
        list.add(0,"a");

        Student s1 = new Student("zhangshan",10);
        Student s2 = new Student("lisi",15);
        Student s3 = new Student("wangwu",12);
        TreeSet<Student> treeSet = new TreeSet<>(((o1, o2) -> o1.getAge()-o2.getAge()));
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.forEach(v-> System.out.println(v.getName()));
    }

}
