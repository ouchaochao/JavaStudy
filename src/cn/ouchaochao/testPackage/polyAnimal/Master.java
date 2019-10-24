package cn.ouchaochao.testPackage.polyAnimal;

public class Master {
    /*
    喂宠物
        喂猫：吃完玩线球
        喂狗：喂完睡觉
     */

    //方案1：编写方法，传入不同动物，调用各自的方法
//    public void feed(Cat cat) {
//        cat.eat();
//        cat.playBall();
//    }
//
//    public void feed(Dog dog) {
//        dog.eat();
//        dog.sleep();
//    }

    //方案2：编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
    public void feed(Animal obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            cat.eat();
            cat.playBall();
        } else {
            Dog dog = (Dog) obj;
            dog.eat();
            dog.sleep();
        }
    }

    /*
    饲养何种宠物
    时间多：养狗
    时间少：养猫
     */
    //方案1：
    public Dog hasManyTime() {
        System.out.println("many time: take dog");
        return new Dog();
    }

    public Cat haslittleTime() {
        System.out.println("little time: take cat");
        return new Cat();
    }

    //方案2
    public Animal raise(boolean isManyTime) {
        if (isManyTime) {
            System.out.println("many time: take dog");
            return new Dog();
        } else {
            System.out.println("little time: take cat");
            return new Cat();
        }
    }
}
