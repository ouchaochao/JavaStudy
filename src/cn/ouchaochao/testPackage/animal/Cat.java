package cn.ouchaochao.testPackage.animal;

/**
 * 宠物猫类
 */
public class Cat {
    //成员属性
    private String name;
    private int month;
    private double weight;
    private String species;
    public static int price;

    //成员方法
    public void run() {
        System.out.println("running");
    }

    public void eat() {
        System.out.println("eating fish");
    }

    //构造方法：和new做搭档
    public Cat() {
//        System.out.println("无参构造方法");
    }

    public Cat(String name) {
        this.name = name;
        System.out.println("有参构造方法");
    }

    //封装 get set方法
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}
