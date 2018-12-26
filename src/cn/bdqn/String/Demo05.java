package cn.bdqn.String;
/*
* 键盘输入一个字符串
* 将字符首字母转成大写
* 其余小写
* */

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符");
        String string=sc.next();
        String s1= string.substring(0,1).toUpperCase();
        String s2= string.substring(1).toLowerCase();
        string=s1+s2;
        System.out.println(string);
    }
}
