package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.animal.Animals;

public class objTest {
    public static void main(String[] args) {
        Animals one = new Animals("花花", 2);
        Animals two = new Animals("花花", 2);

        /*
        equals测试：
        继承Object中的equals方法时，比较的是两个引用是否指向同一个对象
        子类可以通过重写equals方法的形式，改变比较的内容
         */
        System.out.println("One equals two: " + one.equals(two));
        System.out.println("One equals two: " + (one == two));
        System.out.println("======================================");
        /*
        toString测试:
        输出对象名时，默认会直接调用类中的toString
        继承Object中的toString方法时，输出对象的字符串表示形式：类型信息+@+地址信息(Java 8)
         */
        System.out.println(one.toString());
        System.out.println(one);
    }
}
