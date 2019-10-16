package cn.ouchaochao.testPackage.animal;

public class Mouse extends Animals {
    private double weight;

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类构造代码块");
    }

    public Mouse() {
        System.out.println("子类无参构造方法");
    }

    /**
     * 子类构造默认调用父类无参构造
     * 可以通过super()调用父类的允许被访问的其它构造方法
     * super()必须放在子类构造方法有效代码第一行
     * @param name
     */
    public Mouse(String name) {
        super(name);
        System.out.println("子类有参构造方法");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName() + " is running!");
    }
}
