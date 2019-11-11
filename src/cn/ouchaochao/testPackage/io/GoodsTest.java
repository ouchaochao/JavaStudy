package cn.ouchaochao.testPackage.io;

import java.io.*;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods = new Goods("g1", "computer", 3000);
        try {
            FileOutputStream fos = new FileOutputStream("imooc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("imooc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //write
            oos.writeObject(goods);
            oos.writeBoolean(true);
            oos.flush();

            //read
            try {
                Goods goods1 = (Goods) ois.readObject();
                System.out.println(goods1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(ois.readBoolean());
            fos.close();
            oos.close();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
