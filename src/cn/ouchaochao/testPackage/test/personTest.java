package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.people.Person;

public class personTest {
    public static void main(String[] args) {
        Person Li = new Person();
        Li.age = 12;

//        //方式一：获取内部类对象实例，new 外部类.new 内部类
//        Person.Heart myHeart = new Person().new Heart();
//        System.out.println(myHeart.beat());
//
//        //方式二：获取内部类对象实例，外部类对象.new 内部类
//        myHeart = Li.new Heart();
//        System.out.println(myHeart.beat());
//
//        //方式三：获取内部类对象实例，外部类对象.获取方法
//        myHeart = Li.getHeart();
//        System.out.println(myHeart.beat());


        //获取静态内部类对象实例
//        Person.Heart myHeart = new Person.Heart();
//        System.out.println(myHeart.beat());

        System.out.println(Li.newGetHeart());
    }

}
