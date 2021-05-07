package com.hare.tests_string;

import java.util.Arrays;

/*
字符串
String
1.判断两个字符是否内容相等

2.取值
2.1 取字符串长度
2.2 取特定位置字符
2.3 取特定字符位置
2.4 取最后一个字符位置

3.判断
3.1 判断以指定字符结束
3.2 判断字符长度是否为'0'
3.3 判断包含指定字符串
3.4 判断忽略大小写字符

4.转换
4.1 数组转字符串
4.2 数组转字符串
4.3 截取数组指定下标后几个字符
4.4 截取指数组定下标后几个字符
4.5 字符串转数组

5.重点
5.1 去首尾空格
5.2 替换字符串
5.3 切割字符串
5.4 截取字符串
5.4.1 截取字符串
5.5 小转大字母
5.5.1 大转小字母
 */
public class Out {
    public static void main(String[] args) {
        //1.判断两个字符是否内容相等
        System.out.println(new S().getS().equals("Hello Hare ! "));//true

        //2.1 取字符串长度
        System.out.println(new S().getS().length());//13

        //2.2 取特定位置字符
        System.out.println(new S().getS().charAt(0));//H

        //2.3 取特定字符位置
        System.out.println(new S().getS().indexOf("H"));//0

        //2.4 取最后一个字符位置
        System.out.println(new S().getS().lastIndexOf("H"));//6

        //3.1 判断以指定字符结束
        System.out.println(new S().getS().endsWith(" "));//true

        //3.2 判断字符长度是否为'0'
        System.out.println(new S().getS().isEmpty());//false

        //3.3 判断包含指定字符串
        System.out.println(new S().getS().contains("Hello"));//true

        //3.4 判断忽略大小写字符
        System.out.println(new S().getS().equalsIgnoreCase("Hello hare ! "));//true

        //4.1 数组转字符串
        System.out.println(new String(new A().getA()));//Hello Hare !

        //4.2 数组转字符串value
        System.out.println(String.valueOf(new A().getA()));//Hello Hare !

        //4.3 截取数组指定下标后几个字符
        System.out.println(new String(new A().getA(),6,6));//Hare ! 第二个从往后6个,不是总索引

        //4.4 截取指数组定下标后几个字符 value
        System.out.println(String.valueOf(new A().getA(),6,6));//Hare !

        //4.5 字符串转数组
        //定义一个接收数组
        char[] strs = new S().getS().toCharArray();
        System.out.println(strs);//Hello Hare !
        //判断一下是不是数组
        System.out.println(strs.getClass().isArray());//true

        //5.1 去首尾空格
        System.out.println(new S().getS().trim());//Hello Hare !

        //5.2 替换字符串
        System.out.println(new S().getS().replace("Hello","Nice"));//Nice Hare !

        //5.3 切割字符串
        System.out.println(Arrays.toString(new S().getS().split(" ")));//[Hello, Hare, !]

        //5.4 截取字符串
        System.out.println(new S().getS().substring(6));//Hare !

        //5.4.1 截取字符串
        System.out.println(new S().getS().substring(6,13));//Hare !

        //5.5 小转大字母
        System.out.println(new S().getS().toUpperCase());//HELLO HARE !

        //5.5.1 大转小字母
        System.out.println(new S().getS().toLowerCase());//hello hare !
    }
}
