package com.ChinaSoftware.WorkingPolymorphism;

public class PolymorphismKnowing
{
    public static void main(String args[]) {
        ExtendsClass uknown=new SubClass();//Polymorphism 多态！
        uknown.speaking();
        uknown.saying();

        ExtendsClass unknow=new SuppClass();//Polymorphism 多态！
        unknow.speaking();
        unknow.saying();
    }
}