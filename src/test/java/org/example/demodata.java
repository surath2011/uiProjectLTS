package org.example;

public class demodata implements Comparable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public demodata(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public demodata(){

    }
    public int compareTo(demodata dd) {
        if(this.getAge()> dd.getAge()){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "demodata{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
