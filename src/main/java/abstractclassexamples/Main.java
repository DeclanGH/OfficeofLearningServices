package abstractclassexamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Declan", 29);
        Fish fish = new Fish("Declan's pet", 5, "clown fish");

        human.makeSound();
        fish.makeSound();
        System.out.println();

        human.move();
        fish.move();
        System.out.println();

        human.eat();
        fish.eat();
        System.out.println();

        human.respire();
        fish.respire();
        System.out.println();

        human.sleep();
        fish.sleep();
        System.out.println();

        List<Human> humanList = new ArrayList<>();
        Stack<Human> humanStack = new Stack<>();
        Queue<Human> humanQueue = new LinkedList<>();
    }
}
