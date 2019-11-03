package cn.ouchaochao.testPackage.people;

public abstract class anonymousPerson {
    private String name;

    public anonymousPerson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sex();
}
