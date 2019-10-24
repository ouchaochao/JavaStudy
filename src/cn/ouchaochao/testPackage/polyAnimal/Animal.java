package cn.ouchaochao.testPackage.polyAnimal;


//抽象类：不允许实例化，可以通过向上转型，指向子类实例
public abstract class Animal {
    private String name;
    private int month;

    public Animal() {

    }

    public Animal(String name, int month) {
        setMonth(month);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //抽象方法：不允许包含方法体，子类需要重写抽象方法，否则子类也要变成抽象类
    //static、final、private不能与abstract并存
    public abstract void eat();

    public static void say() {
        System.out.println("Animal say");
    }
}
