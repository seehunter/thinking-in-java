package book.thinginginjava.chapter05;

// Calling constructors with "this"

public class g_Flower {
    int petalCount = 0;
    String s = "initial value";

    g_Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    g_Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    g_Flower(String s, int petals) {
        this(petals);
        //! this(s); //Can't call two!
        this.s = s;
        System.out.println("String & int args");
    }

    g_Flower() {
        this("hi", 47);
        System.out.println("Default constructor (no args)");
    }

    void printPetalCount() {
        //! this(11); //Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + ", s = " + s);
    }

    public static void main(String[] args) {
        g_Flower x = new g_Flower();
        x.printPetalCount();
    }
}

/*
Constructor w/ int arg only, petalCount = 47
String & int args
Default constructor (no args)
petalCount = 47, s = hi
 */