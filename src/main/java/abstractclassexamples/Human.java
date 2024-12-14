package abstractclassexamples;

public class Human extends Animal {

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("talk, sing, scream, hum...");
    }

    @Override
    public void move() {
        System.out.println("walk, jog, run, swim, climb...");
    }
}
