package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.animal.Dog;
import cn.ouchaochao.testPackage.animal.Mouse;

public class AnimalTest {
    public static void main(String[] args) {
        Mouse one = new Mouse();
        one.setName("Zhi zhi");
        one.eat();
        one.run();
        System.out.println("====================");
        Dog two = new Dog();
        two.setName("Wang");
        two.eat();
        two.sleep();
        System.out.println("==========注意调用顺序==========");
        Mouse three = new Mouse();
    }
}
