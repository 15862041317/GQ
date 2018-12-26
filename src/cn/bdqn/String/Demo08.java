package cn.bdqn.String;
/*
* 判断一个字符串是不是对称字符串
* */

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        pandan(sc.next());
    }
    public static void pandan(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        if(stringBuilder.reverse().toString().equals(string)){
            System.out.println("这是一个对称字符串");
        }else {
            System.out.println("这不是一个对称字符串");
        }

    }
}
