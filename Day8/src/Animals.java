public class Animals {
    String name;
    int height;
    String color;

    private String makeSound() {
        String s = "Roar! Roar!";
        return s;
    }

    String getSound() {
        return makeSound();
    }
}
