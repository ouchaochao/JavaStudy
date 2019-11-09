package cn.ouchaochao.testPackage.queue;

public class Queue {
    private int n;
    boolean flag = false;

    public synchronized int getN() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cost: " + n);
        flag = false;
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produce: " + n);
        this.n = n;
        flag = true;
        notifyAll();

    }
}
