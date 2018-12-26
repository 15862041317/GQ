package cn.bdqn.String;
/*
* String 的转换功能
*
* */

public class Demo04 {
    public static void main(String[] args) {
        String string="sad456qwe";
        char[] a= string.toCharArray();
        for(char b:a){
            System.out.print(b+"\t");
        }
        System.out.println("\n"+string.toLowerCase());
        System.out.println(string.toUpperCase());
    }
}
