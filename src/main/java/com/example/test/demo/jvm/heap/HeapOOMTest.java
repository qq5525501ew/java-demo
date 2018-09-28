package com.example.test.demo.jvm.heap;

import java.util.LinkedList;
import java.util.List;

/**
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOMTest {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        while (true) {
            list.add(new Student());
        }
    }

    static class Student {

    }
}