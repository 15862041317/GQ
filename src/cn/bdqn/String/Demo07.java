package cn.bdqn.String;

import java.util.Scanner;

/*
* 将键盘输入的字符串翻转
* */

public class Demo07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串");
        System.out.println(Reverse(sc.next()));

    }
    public static String Reverse(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        String str= stringBuilder.reverse().toString();
        return str;
    }
}
