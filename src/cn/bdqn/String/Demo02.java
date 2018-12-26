package cn.bdqn.String;
/*
* 遍历字符串
* */

public class Demo02 {
    public static void main(String[] args) {
        String str="asdwe";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println("-----------------");
        for(int i=0;i<5;i++){
            System.out.println(str.charAt(i));
        }
        System.out.println("-----------------");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
