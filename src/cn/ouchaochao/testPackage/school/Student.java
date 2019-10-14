package cn.ouchaochao.testPackage.school;

public class Student {
    private String studentName;
    private String studentNo;
    private String studentSex;
    private int studentAge;

    public Student() {

    }

    public Student(String studentName, String studentNo, String studentSex, int studentAge) {
        this.setStudentAge(studentAge);
        this.setStudentName(studentName);
        this.setStudentNo(studentNo);
        this.setStudentSex(studentSex);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        if (studentSex == "男" || studentSex == "女")
            this.studentSex = studentSex;
        else
            this.studentSex = "男";
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if (studentAge < 10 || studentAge > 100)
            this.setStudentAge(18);
        else
            this.studentAge = studentAge;
    }

    public String introduction() {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别：" +
                this.getStudentSex() + "\n年龄：" + this.getStudentAge();
        return str;
    }

    /**
     * @param subjectName 课程名
     * @param subjectLife 学制
     * @return
     */
    public String introduction(String subjectName, int subjectLife) {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别：" +
                this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n课程名：" + subjectName + "\n学制"
                + subjectLife;
        return str;
    }

    public String introduction(Subject mySubject) {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别：" +
                this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n课程名：" + mySubject.getSubjectName() +
                "\n学制：" + mySubject.getSubjectLife();
        return str;
    }
}
