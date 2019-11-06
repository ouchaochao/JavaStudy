package cn.ouchaochao.testPackage.setDemo;

import java.util.*;

public class DictDemo {
    public static void main(String[] args) {
        Map<String, String> animal = new HashMap<>();
        Scanner console = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            System.out.println("请输入key值（单词）：");
            String key = console.next();
            System.out.println("请输入value值（注释）：");
            String value = console.next();
            animal.put(key, value);
            i++;
        }

        //打印输出value的值（直接使用迭代器）
        System.out.println("*****************************************");
        System.out.println("使用迭代器输出所有的value：");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("*****************************************");
        //打印输出key和value的值
        //通过entrySet方法
        System.out.println("通过entrySet方法得到key－value：");
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + '-' + entry.getValue());
        }
        System.out.println();
        System.out.println("*****************************************");

        //通过单词找到注释并输出
        //使用keySet方法
        System.out.println("请输入要查找的单词：");
        String strSearch = console.next();
        //1.取得keySet
        Set<String> keySet = animal.keySet();
        //2.遍历keySet
        for (String key : keySet) {
            if (strSearch.equals(key)) {
                System.out.println("find out " + key + '-' + animal.get(key));
                break;
            }
        }

    }
}
