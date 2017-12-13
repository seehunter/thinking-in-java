package book.thinginginjava.chapter05;

// Demonstration of a simple constructor

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

public class P076_SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

/*
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
 */