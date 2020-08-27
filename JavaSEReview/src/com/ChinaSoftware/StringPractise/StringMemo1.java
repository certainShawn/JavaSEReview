package com.ChinaSoftware.StringPractise;
/**
 * java.lang.String类代表字符串。
 * API当中说：Java程序中的所有字符串字面值（如“abc”）都作为此类的实例实现。
 * 其实就是说：程序当中所有的双引号字符串，都是String类的对象。（就算没有new，也照样是。）
 * 
 * 字符串的特点：
 * 1·字符串的内容用不可变（重点）
 * 2·正是因为字符串不可改变，所以字符串是可以共享使用的。
 * 3·字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。
 * 
 * 三种构造方法：
 * public String():创建一个空白字符串，不含有任何内容。
 * public String(char[] array):根据字符串数组的内容，来创建字符串。
 * public String(byte[] array):根据字节数组的内容，来创建对应的字符串。
 * 
 * 
 * String类的场用方法
 * public int length():获取字符串当中含有的字符个数，拿到字符串长度
 * public String concat(String str):将当前字符串和残术字符串拼接，成为新的字符串返回
 * public char charAt(int index):获取指定索引位置的单个字符(索引从0开始)
 * public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有，返回-1.
 * 
 */

public class StringMemo1 {
    
    
}