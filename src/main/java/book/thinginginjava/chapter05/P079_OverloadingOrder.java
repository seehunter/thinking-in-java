package book.thinginginjava.chapter05;

// Overloading based on the order of the arguments.

public class P079_OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "int first");
    }
}

/*
String: String first, int: 11
int: 99, String: int first
 */
