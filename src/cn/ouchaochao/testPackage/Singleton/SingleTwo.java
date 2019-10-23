package cn.ouchaochao.testPackage.Singleton;

//懒汉式：类内实例对象创建时并不直接初始化，直到第一次调用get方法时才完成初始化操作
public class SingleTwo {
    //创建构造方法
    private SingleTwo() {

    }

    //创建静态的该类实例对象
    private static SingleTwo instance = null;

    //创建开放的静态方法提供实例对象
    public static SingleTwo getInstance() {
        if (instance == null)
            instance = new SingleTwo();
        return instance;
    }
}
