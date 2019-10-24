package cn.ouchaochao.testPackage.polyAnimal;

public class Cat extends Animal {
    private double weight;

    public Cat() {

    }


    public Cat(String name, int month, double weight) {
        super(name, month);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("running");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    public static void say() {
        System.out.println("Cat say");
    }

    public void playBall(){
        System.out.println("play ball");
    }
}
