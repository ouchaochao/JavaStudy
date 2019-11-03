package cn.ouchaochao.testPackage.wrapper;

public class WrapperOne {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换成包装类
        //1、自动装箱
        int t1 = 2;
        Integer t2 = t1;
        //2、手动装箱
        Integer t3 = new Integer(t1);

        //拆箱：把包装类转换成基本数据类型
        //1、自动拆箱
        int t4 = t2;
        //2、手动拆箱
        int t5 = t2.intValue();

        //把基本数据类型转换为字符串
        String s2 = Integer.toString(t1);

        //字符串转换为基本数据类型
        //1、包装类的parse
        int s3 = Integer.parseInt(s2);
        //2、包装类的valueOf 先将字符串转换为包装类，再通过自动拆箱完成基本数据类型转换
        int s4 = Integer.valueOf(s2);
        System.out.println();
    }
}
