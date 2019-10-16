package cn.ouchaochao.testPackage.animal;

public class Animals {
    private String name;
    private String species;
    private int month;

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类构造代码块");
    }

    //不能被重新，不能继承，但是会影响子类的构造
    public Animals() {
        System.out.println("父类无参构造方法");
    }

    public Animals(String name) {
        System.out.println("父类有参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void eat() {
        System.out.println(this.getName() + " is eating.");
    }
}
