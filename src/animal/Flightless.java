package animal;

import java.util.Objects;

public final class Flightless extends Bird{

    private String movingType;

    public Flightless(String name, int age, String environment, String movingType) {
        super(name, age, environment);
        if (movingType != null){
        this.movingType = movingType;
        } else {
            movingType = " Ходят";
        }
    }

    public String getMovingType() {
        return movingType;
    }

    public void setMovingType(String movingType) {
        if (movingType != null){
            this.movingType = movingType;
        } else {
            movingType = " Ходят";
        }
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающие охотятся");
    }

    public void eat() {
        System.out.println("Нелетающие едят");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающие спят");
    }

    @Override
    public void move() {
        System.out.println("Нелетающие перемещаются");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movingType, that.movingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movingType);
    }

    @Override
    public String toString() {
        return "Нелетающие. " + super.toString() + " " +
                "тип передвижения: " + movingType;
    }
}
