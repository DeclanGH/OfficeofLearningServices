package abstractclassexamples;

public class Fish extends Animal {

    String type;

    public Fish(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println("burp, click, grind, groan...");
    }

    @Override
    public void move() {
        System.out.println("swim");
    }
}
