package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.school.Subject;
import cn.ouchaochao.testPackage.school.Student;

public class SchoolTest {
    public static void main(String[] args) {
        Subject sub1 = new Subject("计算机", "J0001", 4);
        System.out.println(sub1.info());

        Student stu1 = new Student("Leo", "S0001", "男", 19);
        System.out.println("=======================");
        System.out.println(stu1.introduction());
        System.out.println("=======================");
        System.out.println(stu1.introduction("计算机", 4));
        System.out.println("=======================");
        System.out.println(stu1.introduction(sub1));
    }
}
