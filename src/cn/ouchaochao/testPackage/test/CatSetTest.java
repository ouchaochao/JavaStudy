package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.polyAnimal.Cat;
import cn.ouchaochao.testPackage.setDemo.CatSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatSetTest {
    public static void main(String[] args) {
        // 定义宠物猫对象
        CatSet huahua = new CatSet("花花", 12, "英国短毛猫");
        CatSet fanfan = new CatSet("凡凡", 3, "中华田园猫");

        // 将宠物猫对象放入HashSet中
        Set<CatSet> set = new HashSet<CatSet>();
        set.add(huahua);
        set.add(fanfan);

        // 显示宠物猫信息
        Iterator<CatSet> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 再添加一个与花花属性一样的猫
        CatSet huahua1 = new CatSet("花花", 12, "英国短毛猫");
        set.add(huahua1);
        System.out.println("============================================");
        System.out.println("添加重复数据后的宠物猫信息：");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 重新插入一个新宠物猫
        CatSet huahua2 = new CatSet("花花二代", 2, "英国短毛猫");
        set.add(huahua2);
        System.out.println("============================================");
        System.out.println("添加花花二代后的宠物猫信息：");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 在集合中查找花花的信息并输出
        System.out.println("============================================");
        if (set.contains(huahua)) {
            System.out.println("find out huahua: " + huahua);
        } else {
            System.out.println("No find huahua");
        }

        // 在集合中使用名字查找花花的信息
        System.out.println("============================================");
        System.out.println("通过名字查找花花信息");
        boolean flag = false;
        CatSet c = null;
        it = set.iterator();
        while (it.hasNext()) {
            c = it.next();
            if (c.getName().equals("花花")) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("find out huahua: " + c);
        } else {
            System.out.println("not find");
        }

        // 删除花花二代的信息并重新输出
        for (CatSet catSet : set) {
            if ("花花二代".equals(catSet.getName())) {
                set.remove(catSet);
                break;
            }
        }
        System.out.println("============================================");
        System.out.println("删除花花二代后的数据");
        for (CatSet catSet : set) {
            System.out.println(catSet);
        }

        //删除集合中的所有宠物猫信息
        System.out.println("============================================");
        boolean flag1 = set.removeAll(set);
        if (set.isEmpty()) {
            System.out.println("Cat gone");
        } else {
            System.out.println("Cat still here");
        }

    }
}
