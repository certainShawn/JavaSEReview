package com.ChinaSoftware.JavaTest.ClassCastTest;

public class ClassCastTest {
    public static void main(String args[])
    {
        Animal animal=new Animal();
        if(animal instanceof Dog)//通过·instanof 判断animal是可以强转为Dog 如果是基本类型，则向下转型会丢失精度
        {
            Dog dog=(Dog) animal;
            dog.eat();
        }
        else
        {
            System.out.println("Not all the animals are dogs");
        }
    }   
}