package com.quietjun.sessioncoolie.model;

public class MyService {
    private static MyService service = new MyService();

    public static MyService getService() {
        return service;
    }

    private MyService() {
    }

    public int add(int a, int b) {
        return a + b;
    }

}
