package animal;

import java.util.Objects;

public final class Flying extends Bird{

    private String movingType;

    public Flying(String name, int age, String environment, String movingType) {
        super(name, age, environment);
        if (movingType != null){
            this.movingType = movingType;
        } else {
            movingType = " Летают";
        }
    }

    public String getMovingType() {
        return movingType;
    }

    public void setMovingType(String movingType) {
        if (movingType != null){
            this.movingType = movingType;
        } else {
            movingType = " Летают";
        }
    }

    @Override
    public void hunt() {
        System.out.println("летающие охотятся");
    }

    public void eat() {
        System.out.println("летающие едят");
    }

    @Override
    public void sleep() {
        System.out.println("летающие спят");
    }

    @Override
    public void move() {
        System.out.println("летающие перемещаются");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movingType, flying.movingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movingType);
    }

    @Override
    public String toString() {
        return "Летающие. " + super.toString() + " " +
                "тип передвижения: " + movingType;
    }
}

