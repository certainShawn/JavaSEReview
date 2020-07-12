package com.ChinaSoftware.JavaTest;

public final class KEYWORDFinal//final修饰的类不能被继承
{
    //对于成员变量来说，如果使用final关键字，那么这个变量也不可改变
    //1.由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了
    //2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。
    private final String member="Hello world!";
    public final void unableRewrite()
    {
        //final修饰的方法是不能被覆盖重写的
        final int constant=20;//final 修饰的局部变量不能被修改
        //对基本类型来说变量当中的数据不可改变
        //对引用类型来说变量当中的地址值不可改变

    }
}