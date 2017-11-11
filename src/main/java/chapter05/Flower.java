package chapter05;

// Calling constructors with "this"
public class Flower {
    int petalCount = 0;
    String str = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor int arg only, petalCount = " + petalCount);
    }

    Flower(String s) {
        str = s;
        System.out.println("Constructor String arg only, str = " + s);
    }

    Flower(String s, int petals) {
        this(petals);
        //! this(s)  // Can`t call two!
        this.str = s; // Another use of 'this'
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        //! this(11);  // Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + ", str = " + str);
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();
    }
}
