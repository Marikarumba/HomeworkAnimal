package animal;

import java.util.Objects;

public final class Herbivores extends Mammals{

    private final String foodType;

    public Herbivores(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed);
        if (foodType == null) {
            this.foodType = "трава";
        } else {
            this.foodType = foodType;
        }
    }
    public void graze(){
        System.out.printf("%s grazes on %s", super.getName(), foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Травоядные. " + super.toString()+" " +
                "тип пищи: " + foodType;
    }
    @Override
    public void eat() {
        System.out.println("Травоядные едят траву");
    }

    @Override
    public void sleep() {
        System.out.println("Травоядные спят");
    }

    @Override
    public void move() {
        System.out.println("Травоядные перемещаются");
    }
}
