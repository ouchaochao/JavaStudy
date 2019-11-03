package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.people.Man;
import cn.ouchaochao.testPackage.people.Woman;
import cn.ouchaochao.testPackage.people.anonymousPerson;

public class anonymoudPersonTest {
    /**
     * 根据传入不同人的类型电泳对应的Sex方法
     * 方案1：
     */
//    public void getSex(Man man) {
//        man.sex();
//    }
//
//    public void getSex(Woman woman) {
//        woman.sex();
//    }

    /**
     * 方案2：
     */
    public void getSex(anonymousPerson person){
        person.sex();
    }

    public static void main(String[] args) {
        anonymoudPersonTest test = new anonymoudPersonTest();
        Man one = new Man();
        Woman two = new Woman();
        test.getSex(one);
        test.getSex(two);

        /**
         * 方案3：匿名内部类
         * 1、匿名内部类没有类型名称、实例对象名称
         * 2、编译后的文件命名：外部类$数字.class
         * 3、无法使用private、public、protected、abstract、static修饰
         * 4、无法编写构造方法，可以添加构造代码块
         * 5、不能出现静态成员
         * 6、匿名内部类可以实现接口也可以继承父类，但不可兼得
         */
        test.getSex(new anonymousPerson() {
            @Override
            public void sex() {
                System.out.println("man");
            }
        });
    }
}
