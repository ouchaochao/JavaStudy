package cn.ouchaochao.testPackage.exception;

public class tryDemoFive {
    public static void main(String[] args) {

        try {
            testThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testOne() throws HotelAgeException {
        throw new HotelAgeException();
    }

    public static void testTwo() throws Exception {
        try {
            testOne();
        } catch (HotelAgeException e) {
            throw new Exception("testTwo exception", e);
        }
    }

    public static void testThree() throws Exception {
        try {
            testTwo();
        } catch (Exception e) {
            Exception e1 = new Exception("testThree exception");
            e1.initCause(e);
            throw e1;
        }
    }
}
