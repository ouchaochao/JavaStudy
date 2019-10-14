package cn.ouchaochao.testPackage.school;

/**
 * 专业类
 */
public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;

    public Subject() {

    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectLife(subjectLife);
        this.setSubjectNo(subjectNo);
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectLife(int subjectLife) {
        if (subjectLife < 1)
            return;
        this.subjectLife = subjectLife;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    /**
     * 专业介绍方法
     * @return 专业介绍相关信息
     */
    public String info() {
        String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n专业年限：" + this.getSubjectLife();
        return str;
    }
}
