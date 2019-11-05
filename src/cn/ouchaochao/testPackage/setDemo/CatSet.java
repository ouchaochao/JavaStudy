package cn.ouchaochao.testPackage.setDemo;

import java.util.Objects;

public class CatSet {
    private String name;
    private int month;
    private String species;

    public CatSet(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "CatSet{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //判断对象是否相等，相等则返回true，不用继续比较属性了
        if (this == o) return true;
        //判断o是否是Cat类的对象
        if (!(o instanceof CatSet)) return false;
        CatSet catSet = (CatSet) o;
        return month == catSet.month &&
                name.equals(catSet.name) &&
                species.equals(catSet.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, month, species);
    }
}
