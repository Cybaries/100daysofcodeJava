public class Wolf extends Canine {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Howl! Howl!");
    }
    @Override
    void walkOn() {
        super.walkOn();
        System.out.println("Wolf: Howl! Howl! Howl!");
        System.out.println("Translation: 4 legs");
    }

}
