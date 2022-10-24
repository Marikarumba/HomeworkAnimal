import animal.*;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores(
                "Газель",
                2,
                null,
                30,
                "трава");

        System.out.println(gazelle.toString());

        Herbivores zhiraf = new Herbivores(
                "Жираф",
                -7,
                "саванна",
                20,
                "листья");

        System.out.println(zhiraf.toString());
        zhiraf.graze();
        System.out.println(" ");


        Herbivores hours = new Herbivores(
                "Лошадь",
                3,
                null,
                50,
                null);

        System.out.println(hours.toString());

        Predator hyena = new Predator(
                "hyena",
                5,
                null,
                20,
                null);

        System.out.println(hyena.toString());
        hyena.eat();
        hyena.hunt();
        System.out.println(" ");

        Predator tiger = new Predator(
                "Тигр",
                3,
                null,
                30,
                "gazelle");
        System.out.println(tiger.toString());

        Predator bear = new Predator(
                "Медведь",
                30,
                null,
                5,
                null);
        System.out.println(bear.toString());


        Amphibians frog = new Amphibians(
                "Лягушка",
                1,
                null);
        System.out.println(frog.toString());
        frog.eat();

        Amphibians snake = new Amphibians(
                "уж пресноводный",
                1,
                null);
        System.out.println(snake.toString());

        Flightless peacock = new Flightless(
                "Павлин",
                3,
                null,
                null);
        System.out.println(peacock.toString());

        Flightless penguin = new Flightless(
                "Пингвин",
                3,
                null,
                null);
        System.out.println(penguin.toString());

        Flightless birdDodo = new Flightless(
                "Птица Додо",
                3,
                null,
                null);
        System.out.println(birdDodo.toString());

        Flying gull = new Flying(
                "чайка",
                3,
                null,
                null);
        System.out.println(gull.toString());

        Flying albatross = new Flying(
                "альбатрос",
                3,
                null,
                null);
        System.out.println(albatross.toString());

        Flying falcon = new Flying(
                "сокол",
                3,
                null,
                null);
        System.out.println(falcon.toString());
        falcon.hunt();
    }


}

