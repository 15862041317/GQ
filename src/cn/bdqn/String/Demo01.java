package cn.bdqn.String;

import java.util.Scanner;

public class Demo01 {
    /*
    * 模拟用户登录
    *      登录三次机会
    * */

    public static void main(String[] args) {
        String user="admin";
        String pass="admin";
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("请输入账号:");
            String users=sc.next();
            System.out.println("请输入密码:");
            String passs=sc.next();
            if(users.equalsIgnoreCase(user)&&passs.equalsIgnoreCase(pass)){
                System.out.println("登录成功!");
                break;
            }else {
                if(i==2){
                    System.out.println("对不起,您的账号已被锁定,请1小时后重新登录");
                }
                System.out.println("登录失败!"+"您还有"+(2-i)+"次机会,重写输入");
            }
        }


    }
}
