package cn.ouchaochao.testPackage.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryDemoThree {
    public static void main(String[] args) {
        try {
            int result = test();
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {

        } catch (InputMismatchException e) {

        } catch (Exception e) {

        }
    }

    /**
     * 测试接受数据相处结果的方法
     * @return 两个接受数据的商
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("===Start===");
        System.out.println("First input:");
        int one = input.nextInt();
        System.out.println("Second input:");
        int two = input.nextInt();
        System.out.println("===End===");
        return one / two;
    }
}
