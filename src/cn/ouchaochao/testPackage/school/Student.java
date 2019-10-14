package cn.ouchaochao.testPackage.school;

public class Student {
    private String studentName;
    private String studentNo;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;

    public Student() {

    }

    public Student(String studentName, String studentNo, String studentSex, int studentAge) {
        this.setStudentAge(studentAge);
        this.setStudentName(studentName);
        this.setStudentNo(studentNo);
        this.setStudentSex(studentSex);
    }

    public Student(String studentName, String studentNo, String studentSex, int studentAge, Subject studentSubject) {
        this.setStudentAge(studentAge);
        this.setStudentName(studentName);
        this.setStudentNo(studentNo);
        this.setStudentSex(studentSex);
        this.setStudentSubject(studentSubject);
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

    /**
     * 没有实例化要先实例化
     *
     * @return 专业对象信息
     */
    public Subject getStudentSubject() {
        if (this.studentSubject == null)
            this.studentSubject = new Subject();
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }


    /**
     * 如何将两个类的信息进行结合？
     * 方案一：在方法中插入变量
     * 容易理解，但是参数列表长
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

    /**
     * 方案二：在方法中传入对象
     * 两个类关联性差
     * @param mySubject 所选专业对象
     * @return
     */
    public String introduction(Subject mySubject) {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别：" +
                this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n课程名：" + mySubject.getSubjectName() +
                "\n学制：" + mySubject.getSubjectLife();
        return str;
    }

    /**
     * 方案三：在学生类中新建专业的属性，然后通过本类的成员方法获取成员对象再获取成员信息
     * 专业成为学生的一个特征，关联性强
     *
     * 在方法中通过对象作为参数，传递的只是他的引用，可以通过引用获取对象的所有信息
     *
     * 使用subuject传参数过来
     *
     * @return
     */
    public String introduction() {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别：" +
                this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n课程名："
                + this.getStudentSubject().getSubjectName() + "\n学制：" + this.getStudentSubject().getSubjectLife();
        return str;
    }

}
