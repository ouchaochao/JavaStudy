package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.tel.*;

public class telTest {
    public static void main(String[] args) {

        SecondPhone phone = new SecondPhone();
        phone.game();
        System.out.println("================");
        Iphoto ip = new SecondPhone();
        ip.photo();
        ip = new Camera();
        ip.photo();
        System.out.println("================");
        System.out.println(INet.Temp);
        INet net = new Computer();
        System.out.println(net.Temp);
        System.out.println("================");
        net.connection();
        INet.stop();
    }
}
