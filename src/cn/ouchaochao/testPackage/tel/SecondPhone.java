package cn.ouchaochao.testPackage.tel;

public class SecondPhone extends Phone implements Iphoto {
    public void call() {
        System.out.println("add call");
    }

    public void message() {
        System.out.println("add message");
    }

    public void game() {
        System.out.println("add game");
    }

    public void video() {
        System.out.println("add video");
    }

    public void music() {
        System.out.println("add music");
    }

    @Override
    public void photo() {
        System.out.println("Phone photo");
    }
}
