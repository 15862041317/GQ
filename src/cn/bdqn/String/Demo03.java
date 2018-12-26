package cn.bdqn.String;
/*
* 将一个字符串的
* 大写字母个数,小写字母个数,数字个数
* 分别统计下来
* */

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        int uppercaseLetter=0;
        int lowerCaseLetters=0;
        int digital=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符");
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                uppercaseLetter++;
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                lowerCaseLetters++;
            }else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                digital++;
            }else {
                System.out.println("输入的"+str.charAt(i)+"不符合要求");
            }

        }
        System.out.println("大写字母:"+uppercaseLetter);
        System.out.println("小写字母:"+lowerCaseLetters);
        System.out.println("数字:"+digital);
    }
}
