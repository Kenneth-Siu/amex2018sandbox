package training.sandbox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
}

class UI {
    static void sortZoo(String[] zoo) {
        Arrays.sort(zoo);
    }
    static void sortZoo(List<String> zoo) {
        Collections.sort(zoo);
    }
    static void display(String[] zoo) {
        for (String item : zoo) {
            System.out.println(item);
        }
    }
}




