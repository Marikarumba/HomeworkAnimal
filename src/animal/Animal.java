package animal;

import java.util.Objects;

public abstract class Animal {

    private String name;

    private int age;

    public Animal(String name, int age) {

        if (name != null) {
            this.name = name;
        }else {
            this.name = "default";
        }

        if (age>0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }else {
            this.name = "default";
        }
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Кличка: " + name +
                ", возраст: " + age;
    }
}
