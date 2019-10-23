package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.polyAnimal.Animal;
import cn.ouchaochao.testPackage.polyAnimal.Cat;
import cn.ouchaochao.testPackage.polyAnimal.Dog;

public class polyTest {
    public static void main(String[] args) {
        /*
        向上转型、隐式转型、自动转型
        父类引用指向子类实例，可以调用子类重写父类方法以及父类派生的方法，无法调用子类特有方法
        小类转型为大类
         */
        Animal one = new Animal();
        Animal two = new Cat();
        Animal three = new Dog();

        one.eat();
        two.eat();
        three.eat();

        /*
        向下转型、强制类型转换
        子类引用指向父类对象，此处必须进行强转，可以调用子类特有的方法
        必须满足转换条件才能转换
        instanceof : 返回true/false
         */
        if (two instanceof Cat) {
            Cat temp = (Cat) two;
            temp.eat();
            temp.run();
            System.out.println("trans cat ok!");
        }
        if (two instanceof Dog) {
            Dog temp = (Dog) two;
            temp.eat();
            System.out.println("trans dog ok!");
        }
        if (two instanceof Animal) {
            System.out.println("Animal");
        }
        if (two instanceof Object) {
            System.out.println("Object");
        }

        Animal five = new Cat();
        five.say();
        Cat cat = (Cat) five;
        cat.say();


    }
}
