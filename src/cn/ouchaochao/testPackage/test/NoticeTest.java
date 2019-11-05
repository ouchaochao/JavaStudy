package cn.ouchaochao.testPackage.test;

import cn.ouchaochao.testPackage.setDemo.Notice;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "Welcome imooc1", "admin1", new Date());
        Notice notice2 = new Notice(2, "Welcome imooc2", "admin2", new Date());
        Notice notice3 = new Notice(3, "Welcome imooc3", "admin3", new Date());
        Notice notice4 = new Notice(4, "Welcome imooc4", "admin4", new Date());

        // add notice
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);
        pPrint(noticeList);

        // 在第一条公告后面添加一条新公告
        noticeList.add(1, notice4);
        pPrint(noticeList);

        // 删除3的公告
        noticeList.remove(3);
        pPrint(noticeList);

        //将第二条公告改为:Welcome imooc 886
        notice4.setTitle("Welcome imooc 886");
        pPrint(noticeList);

    }

    public static void pPrint(ArrayList noticeList) {
        System.out.println("=====================");
        System.out.println("The notice:");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
        }
    }
}
