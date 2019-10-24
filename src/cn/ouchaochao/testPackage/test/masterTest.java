package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.polyAnimal.Animal;
import cn.ouchaochao.testPackage.polyAnimal.Cat;
import cn.ouchaochao.testPackage.polyAnimal.Dog;
import cn.ouchaochao.testPackage.polyAnimal.Master;

public class masterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Cat cat = new Cat();
        Dog dog = new Dog();
        master.feed(cat);
        master.feed(dog);

        Animal temp;
        boolean isManyTime = true;
        if (isManyTime) {
            temp = master.hasManyTime();
        } else {
            temp = master.haslittleTime();
        }
        System.out.println(temp);

        Animal temp2 = master.raise(isManyTime);
        System.out.println(temp2);

    }
}
