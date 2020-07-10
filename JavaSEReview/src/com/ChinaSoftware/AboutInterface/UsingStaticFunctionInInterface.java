package com.ChinaSoftware.AboutInterface;

public interface UsingStaticFunctionInInterface 
{
    //不能通过接口实现类的对象调用接口中的静态方法
    //通过接口名称直接调用静态方法
    public static String name (String name) 
    {
        return name;  
    }
    public default int age()
    {
      int age =18;
      return age;
    }
}
