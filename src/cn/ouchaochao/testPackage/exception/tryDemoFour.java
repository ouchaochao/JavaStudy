package cn.ouchaochao.testPackage.exception;

import java.util.Scanner;

public class tryDemoFour {
    public static void main(String[] args) {

        try {
            testAge();
        } catch (HotelAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Checkin error!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        testAge2();
    }

    public static void testAge() throws HotelAgeException {
        System.out.println("Input age:");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18 || age > 80) {
            throw new HotelAgeException();
        } else {
            System.out.println("Welcome checkin!");
        }
    }

    /**
     * throw 抛出异常对象的处理方案
     * 1、通过try catch包含语句--自己抛出自己处理
     * 2、通过throws在方法声明出抛出异常类型--谁调用谁处理--调用者可以自己处理
     * 此时可以抛出与throw对象相同的类型或者其父类
     */
    public static void testAge2() {
        try {
            System.out.println("Input age:");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
            if (age < 18 || age > 80) {
                throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
            } else {
                System.out.println("Welcome checkin!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
