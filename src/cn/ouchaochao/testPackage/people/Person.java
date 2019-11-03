package cn.ouchaochao.testPackage.people;

public class Person {
    public int age;

    public Heart getHeart() {
        new Heart().temp = 222;
        return new Heart();
    }

    /**
     * 成员内部类
     * 1、内部类在外部使用时，无法直接实例化，需要借由外部类信息才能完成实例化
     * 2、内部类访问修饰符，可以任意，但是访问范围会受到影响
     * 3、内部类可以直接访问外部类的成员；如果出现同名属性，则优先访问内部类属性
     * 4、可以使用 外部类.this.成员 的方式，访问外部类中同名的信息
     * 5、外部类访问内部类信息，需要通过内部类实例，无法直接访问
     * 6、内部类编译后.class文件命名：外部类$内部类.class
     * 7、
     */
//    public class Heart {
//        int temp;
//        int age = 13;
//
//        public String beat() {
//
//            return Person.this.age + " beating";
//        }
//    }

    /**
     * 静态内部类
     * 1、静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
     * 2、静态内部类对象实例时，可以不依赖于外部类对象
     * 3、可以通过外部类.内部类.静态成员的方式访问内部类中的静态成员
     * 4、当内部类于外部类属性同名时。默认调用内部类成员
     * 如需访问外部类的静态属性，可以通过 外部类.属性 的方式
     * 如需访问外部类的非静态属性，可以通过 new 外部类().属性 的方式
     */
    public static class Heart {
        int temp;
        int age = 13;

        public String beat() {

            return new Person().age + " beating";
        }
    }

    /**
     * 方法内部类
     * 1、定义在方法内部，作用范围也在方法内
     * 2、和方法内部成员使用规则一样，class前面不可以添加public、private、protected、static
     * 3、类中不能包含静态成员
     * 4、类中可以包含final、abstract修饰的成员
     * @return
     */
    public String newGetHeart() {
        class Heart{
            public int age = 13;
            int temp = 22;

            public void say(){
                System.out.println("Hello");
            }

            public String eat(){
                return "eating";
            }

        }
        return new Heart().eat();
    }


}
