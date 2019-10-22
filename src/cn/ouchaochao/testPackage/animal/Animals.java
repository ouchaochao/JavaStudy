package cn.ouchaochao.testPackage.animal;

public class Animals {
    private String name;
    private String species;
    private int month;

    /*
    final class：该类没有子类
    final 方法：该方法不允许被子类重写，但是可以正常被子类继承使用，不能修饰构造方法
    final 方法内局部变量：只要在具体被使用之前进行赋值即可，一旦赋值不允许被修改
          类中成员属性：赋值过程：定义直接初始化 || 构造方法 || 构造代码块
    修饰变量表示不允许修改：
        基本数据类型：初始赋值后不允许被修改
        引用数据类型：初始化之后不能再指向另一个对象，但对象的内容是可变的
    final可与static配合使用：全局不可修改的信息：如配置信息
     */
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

    public Animals(String name, int month) {
        setName(name);
        setMonth(month);
        System.out.println("父类有参构造方法");
    }

    public Animals(String name) {
        setName(name);
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

    //重写
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        Animals temp = (Animals) obj;
        if (this.getName().equals(temp.getName()) && this.getMonth() == temp.getMonth())
            return true;
        else
            return false;
    }

    //重载
    public boolean equals(Animals obj) {
        if (obj == null)
            return false;
        if (this.getName().equals(obj.getName()) && this.getMonth() == obj.getMonth())
            return true;
        else
            return false;
    }
    public String toString(){
        return this.getName();
    }
}
