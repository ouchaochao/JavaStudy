package cn.ouchaochao.testPackage.school;

/**
 * 专业类
 */
public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    private Student[] myStudent;
    private int studentNum;

    public Subject() {

    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectLife(subjectLife);
        this.setSubjectNo(subjectNo);
    }

    public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudent) {
        this.setSubjectName(subjectName);
        this.setSubjectLife(subjectLife);
        this.setMyStudent(myStudent);
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

    public Student[] getMyStudent() {
        if (myStudent == null)
            this.myStudent = new Student[200];
        return myStudent;
    }

    public void setMyStudent(Student[] myStudent) {
        this.myStudent = myStudent;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * 专业介绍方法
     *
     * @return 专业介绍相关信息
     */
    public String info() {
        String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n专业年限：" + this.getSubjectLife();
        return str;
    }

    public void addStudent(Student stu ){
        /*
        将学生保存到数组中
        学生个数保存到studentNum
         */
        for(int i=0;i<this.getMyStudent().length;i++){
            if (this.getMyStudent()[i] == null){
                this.getMyStudent()[i] = stu;
                this.studentNum = i+1;
                return;
            }
        }

    }
}
