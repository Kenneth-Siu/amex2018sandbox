package training.sandbox.animal;

public interface Solitary {
    default void Wander() {
        System.out.println("I wander lonely as a cloud.");
    }
}
