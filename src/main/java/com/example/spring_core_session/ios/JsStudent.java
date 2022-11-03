package com.example.spring_core_session.ios;

public class JsStudent implements Teacher {
    @Override
    public void code() {
        System.out.println("JsCode");
    }

    @Override
    public void speed() {
        System.out.println(20);
    }
}
