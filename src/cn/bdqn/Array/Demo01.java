package cn.bdqn.Array;
/*
* 创建一个学生数组,存储三个学生对象并遍历
*
* */

public class Demo01 {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        Student s1=new Student("刘翔","50");
        Student s2=new Student("姚明","48");
        Student s3=new Student("李宁","49");
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            Student student= students[i];
            System.out.println(student.getName()+"\t"+student.getAge());
        }
    }
}
