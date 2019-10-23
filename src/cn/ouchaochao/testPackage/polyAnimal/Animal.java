package cn.ouchaochao.testPackage.polyAnimal;

public class Animal {
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

    public void eat() {
        System.out.println("eatting");
    }

    public static void say() {
        System.out.println("Animal say");
    }
}
