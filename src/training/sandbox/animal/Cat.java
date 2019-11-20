package training.sandbox.animal;

public class Cat extends Animal {

    public String name;

    { System.out.println("Meow"); }
    static { System.out.println("Cat"); }

    public Cat() {
        this(4);
    }

    public Cat(int age) {
        super(age);
        System.out.println("I am a cat.");
    }
}
