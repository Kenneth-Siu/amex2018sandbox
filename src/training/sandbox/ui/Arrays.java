package training.sandbox.ui;

public class Arrays {
    public static void imALittleArray() {
        System.out.println("I'm a little array, short and stout.");
    }

    public static void sort(Object[] a) {
        Object sevenUp = a[3];
        Object sprite = a[1];
        a[3] = sprite;
        a[1] = sevenUp;
    }
}
