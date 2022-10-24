package animal;

import java.util.Objects;

public final class Predator extends Mammals {

    private final String foodType;

    public Predator(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed);
        if (foodType == null) {
            this.foodType = "meat";
        } else {
            this.foodType = foodType;
        }
    }

    public void hunt(){
        System.out.printf("%s hunts on %s", super.getName(), foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(foodType, predator.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Хищники. " + super.toString() + " " +
                "тип пищи: " + foodType;
    }
    public void eat() {
        System.out.println("Хищники едят мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Хищники спят");
    }

    @Override
    public void move() {
        System.out.println("Хищники перемещаются");
    }
}
