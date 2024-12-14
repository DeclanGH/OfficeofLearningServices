package abstractclassexamples;

public abstract class Animal implements AnimalCharacteristics {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void respire() {
        System.out.println("taking in oxygen, taking out CO2");
    }

    @Override
    public void eat() {
        System.out.println("Munch, Munch...");
    }

    @Override
    public void sleep() {
        System.out.println("Reducing brain activity...");
    }

    public abstract void makeSound();

    public abstract void move();
}
