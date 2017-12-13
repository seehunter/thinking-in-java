package book.thinginginjava.chapter05;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // ... remove peel
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class P085_PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

/*
Yummy
 */