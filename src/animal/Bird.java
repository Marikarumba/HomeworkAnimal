package animal;


import java.util.Objects;

public abstract class Bird extends Animal{

    private String environment;

    public Bird(String name, int age, String environment) {
        super(name, age);
        if (environment != null) {
            this.environment = environment;
        } else {
            environment = "default";
        }
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public abstract void hunt();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird biurd = (Bird) o;
        return Objects.equals(environment, biurd.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Птица: " + super.toString() +
                ", среда обитания: " + environment;
    }
}
