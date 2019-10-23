package cn.ouchaochao.testPackage.polyAnimal;

public class Dog extends Animal {
    private String sex;

    public Dog() {

    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        setSex(sex);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}
