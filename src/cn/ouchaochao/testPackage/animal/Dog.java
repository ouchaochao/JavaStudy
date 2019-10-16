package cn.ouchaochao.testPackage.animal;

public class Dog extends Animals{
    public String sex;
    public Dog(){

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep(){
        System.out.println(this.getName() + " is sleeping");
    }

    /*
    重载
    1、同一个类中；
    2、方法名相同，参数列表不同（参数顺序、个数、类型）
    3、方法的返回值、访问修饰符任意
    4、与方法的参数名无关

    重写
    1、有继承关系的子类中
    2、方法名相同、参数列表相同，方法返回值相同
    3、访问修饰符，访问范围必须大于等于父类
    4、与方法的参数名无关
     */
    public void eat(){
        System.out.println(this.getName() + " is not eating");
    }
}
