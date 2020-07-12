package com.ChinaSoftware.AboutInterface;

public class TestClass implements UsingStaticFunctionInInterface
{
    public int age()
    {
        int age =28;
        System.out.println(age);
        return age;
    }
    public static void main(String args[])
    {
        //调用接口的静态方法
        UsingStaticFunctionInInterface.name("Shawn");
        System.out.println(new TestClass().age());
    }

}