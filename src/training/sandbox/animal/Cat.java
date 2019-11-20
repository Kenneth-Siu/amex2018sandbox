package training.sandbox.animal;

public class Cat extends Animal {

    { System.out.println("Meow"); }
    static { System.out.println("Cat"); }

    public Cat() {
        System.out.println("I am a cat.");
    }
}
