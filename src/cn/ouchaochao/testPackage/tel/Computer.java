package cn.ouchaochao.testPackage.tel;

public class Computer implements INet, Iphoto {
    public static final int Temp = 30;

    @Override
    public void network() {
        System.out.println("Computer network");
    }

    @Override
    public void connection() {
        INet.super.connection();
//        INet.super.
    }

    @Override
    public void photo() {
        System.out.println("Computer photo");
    }
}
