package cn.ouchaochao.testPackage.tel;

//接口访问修饰符：默认public
public interface INet {
    /*
    接口中抽象方法可以不写abstract关键字
    访问修饰符默认public
    当类实现接口时，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类
     */
    void network();

    //接口中可以包含常量，默认public static final
    int Temp = 20;

    /*
    default：默认方法 可以带方法体
    可以在实现类中重写，并可以通过接口的引用调用
     */
    default void connection(){
        System.out.println("connection");
    }

    /*
    static：可以带方法体
    不可以在实现类中重写，可以通过接口名调用
     */
    static void stop(){
        System.out.println("Static");
    }
}
