package cn.ouchaochao.testPackage.io;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("imooc.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("imooc1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            int n = 0;
            char[] cbuf = new char[10];

//            while ((n = isr.read()) != -1) {
//                System.out.println((char) n);
//            }
//
//            while ((n = isr.read(cbuf)) != -1) {
//                String s = new String(cbuf, 0, n);
//                System.out.println(s);
//            }
            while ((n = br.read(cbuf)) != -1) {
                bw.write(cbuf, 0, n);
                bw.flush();
            }
            fis.close();
            fos.close();
            isr.close();
            osw.close();
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
