package cn.bdqn.String;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入手机号码:");
        String string=sc.next();
        if(string.matches("1[3689][0-9]{9}")){
            System.out.println("输入正确");
        }else {
            System.out.println("输入错误");
        }

    }
}
