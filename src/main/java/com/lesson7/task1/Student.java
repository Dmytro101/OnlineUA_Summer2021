package com.lesson7.task1;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public int hashCode() {
        return (31 * age +
                ((name == null) ? 0 : name.hashCode()) +
                ((group == null) ? 0 : group.hashCode()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Student) {
            Student temp = (Student) obj;
            return (this.name.equals(temp.name) &&
                    this.age == temp.age &&
                    this.group.equals(temp.group));
        }
        return false;
    }

    public static void main(String[] args) {
        Student student = new Student("Jack", 20, "11");
        System.out.println(student.hashCode());
    }
}