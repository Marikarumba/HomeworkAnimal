package animal;

import java.util.Objects;

public final class Amphibians extends Animal{

    private String environment;

    public Amphibians(String name, int age, String environment) {
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
        if (environment != null) {
            this.environment = environment;
        } else {
            environment = "default";
        }
    }

    @Override
    public void eat() {
        System.out.println("Земноводные едят");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводные спят");
    }

    @Override
    public void move() {
        System.out.println("Земноводные перемещаются");
    }

    public void hunt() {
        System.out.printf("%s hunts ", super.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(environment, that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment);
    }

    @Override
    public String toString() {
        return "Земноводные. " + super.toString() +
                ", среда обитания: " + environment;
    }
}
