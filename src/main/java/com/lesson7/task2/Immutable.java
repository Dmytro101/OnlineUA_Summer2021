package com.lesson7.task2;

public final class Immutable {
    private final String name;
    private final int age;
    private final Year year;

    public Immutable(String name, int age, Year year) {
        this.name = name;
        this.age = age;
        Year cloneYear = new Year(year.getValue());
        this.year = cloneYear;
    }

    public String getName() {
        return name;
    }

    public Immutable setName(String name) {
        return new Immutable(name, this.age, this.year);
    }

    public int getAge() {
        return age;
    }

    public Immutable setAge(int age) {
        return new Immutable(this.name, age, this.year);
    }

    public Year getYear() {
        Year cloneYear = new Year(this.year.getValue());
        return cloneYear;
    }

    public Immutable setYear(Year year) {
        return new Immutable(this.name, this.age, year);
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                '}';
    }
}
