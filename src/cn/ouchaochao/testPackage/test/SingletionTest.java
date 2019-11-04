package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.singleton.SingleOne;
import cn.ouchaochao.testPackage.singleton.SingleTwo;

public class SingletionTest {
    public static void main(String[] args) {
        SingleOne one = SingleOne.getInstance();
        SingleOne two = SingleOne.getInstance();
        System.out.println((one == two));
        System.out.println("======================");
        SingleTwo three = SingleTwo.getInstance();
        SingleTwo four = SingleTwo.getInstance();
        System.out.println((three == four));
    }
}
