package cn.bdqn.String;
/*
* 把数组中的数据按照指定格式拼接成一个字符串
* 举例:int[] arr={1,2,3};
* 输出结果:[1,2,3]
* */

public class Demo06 {
    public static void main(String[] args) {
        int[] arr={1,2,3};

    }
    public static String tostring(int[] arr){
        String s1="[";
        for(int i=0;i<arr.length;i++){
            s1 = s1 + arr[i];
        }
        String s2="]";
        return s1;
    }

}
