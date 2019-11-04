package cn.ouchaochao.testPackage.singleton;

//饿汉式：在类加载时就创建实例
public class SingleOne {
    // 创建类中私有构造
    private SingleOne() {

    }

    //创建该类型的私有静态实例
    private static SingleOne instance = new SingleOne();

    //创建共有静态方法返回静态实例对象
    public static SingleOne getInstance() {
        return instance;
    }
}
