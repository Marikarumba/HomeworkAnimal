package animal;

import java.util.Objects;

public abstract class Mammals extends Animal{

    private String environment;
    private final int speed;

    public Mammals(String name, int age, String environment, int speed) {
        super(name, age);

        if (environment != null) {
            this.environment = environment;
        } else {
            environment = "default";
        }

        this.speed = Math.abs(speed);
    }

    public String getEnvironment() {
        return environment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setEnvironment(String environment) {
        if (environment != null) {
            this.environment = environment;
        } else {
            environment = "default";
        }
    }

    public void walk(){
        System.out.printf("%s walks with a speed %s in the %s", super.getName(), speed, environment);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(environment, mammals.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, speed);
    }

    @Override
    public String toString() {
        return "Млекопитающие: " + super.toString() +
                ", среда обитания: " + environment +
                ", скорость: " + speed;
    }
}
