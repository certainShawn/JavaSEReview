package com.ChinaSoftware.JavaSE;

public class ArrayMax {

    public static int arraymax(int x[])
    {
        int maxValue=0;
        for(int i=0;i<x.length;i++)
        {
            if(maxValue<x[i])
            {
                maxValue=x[i];
            }
        }

        return maxValue;
    }
    public static void main(String args[])
    {
        int array1[]={1,2,3,4,5,6,7,8,9,10,32,98,99,101,38,41};
        System.out.println(arraymax(array1));
    }

}