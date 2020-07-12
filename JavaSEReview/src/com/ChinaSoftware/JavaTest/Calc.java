package com.ChinaSoftware.JavaTest;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
    // write your code here
    System.out.println("请输入一个数");
    Scanner scanner=new Scanner(System.in);
    int paramater1=scanner.nextInt();
    System.out.print("请输入另一个数");
    int paramater2=scanner.nextInt();
    scanner.close();
    System.out.println("输入的两个数字的和是："+(paramater1+paramater2));
    }
}
