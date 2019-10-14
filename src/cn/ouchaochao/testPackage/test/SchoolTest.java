package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.school.Subject;
import cn.ouchaochao.testPackage.school.Student;

public class SchoolTest {
    public static void main(String[] args) {
        //测试Subject
        Subject sub1 = new Subject("计算机", "J0001", 4);
        System.out.println(sub1.info());

        //测试Student的三种方法
        Student stu1 = new Student("Lily", "S0001", "女", 21);
        System.out.println("=======================");
        System.out.println(stu1.introduction("计算机", 4));
        Student stu2 = new Student("Lily", "S0001", "女", 21);
        System.out.println("=======================");
        System.out.println(stu2.introduction(sub1));
        Student stu3 = new Student("Leo", "S0001", "男", 19, sub1);
        System.out.println("=======================");
        System.out.println(stu3.introduction());

        //测试指定专业中有多少学生
        System.out.println("=======================");
        sub1.addStudent(stu1);
        sub1.addStudent(stu2);
        sub1.addStudent(stu3);
        System.out.println("共有学生：" + sub1.getStudentNum());
    }
}
