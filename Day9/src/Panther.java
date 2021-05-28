public class Panther extends Canine{
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Purr! Purr!");
    }
    @Override
    void walkOn() {
        super.walkOn();
        System.out.println("Wolf: Purr! Purr! Purr!");
        System.out.println("Translation: 4 legs");
    }
}