package com.epam.git;

public class AdditionOperation {
    public int add(int a, int b) {
        System.out.println("This is add method");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("This is add method for 3 params");
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        System.out.println("This is add method for 4 params");
        return a + b + c + d;
    }
}
