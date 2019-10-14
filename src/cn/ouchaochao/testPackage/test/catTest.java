package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.animal.Cat;

public class catTest {
    public static void main(String[] args){
        // 对象实例化
        Cat one; // 在内存的栈中声明对象，此时栈为null
        one = new Cat(); // 在内存的堆中实例化对象，并把堆的地址发送到栈中
        one.setName("Alice");

        Cat two = new Cat();
        two.setName("Tim");
        two.setSpecies("中华田园猫");
        two.setWeight(13);
        two.setMonth(1);
        Cat.price = 1000;
        System.out.println(Cat.price);

    }
}
