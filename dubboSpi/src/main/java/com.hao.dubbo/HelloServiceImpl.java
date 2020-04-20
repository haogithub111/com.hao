package com.hao.dubbo;

public class HelloServiceImpl implements HelloService{

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public String hello(String name, String age) {
        return "Hello " + name + " age=" + age;
    }
}
