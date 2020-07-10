package com.ChinaSoftware.JavaSE;

public class ArrayReverse
{
    public int[] ArrayReverses(int x[])
    {
        int medium=0;
        for(int i=0;i<=(x.length)/2;i++)
        {
            medium=x[i];
            x[i]=x[x.length-1-i];
            x[x.length-1-i]=medium;
        }
        return x;
    }
    public static void main(String args[])
    {
        int x[]={1,2,3,4,5,6,7,8,9,0};
        new ArrayReverse().ArrayReverses(x);
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
        System.out.println("");
    }
}