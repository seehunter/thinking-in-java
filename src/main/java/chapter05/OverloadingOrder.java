package chapter05;

public class OverloadingOrder {
    static void f(String str, int i) {
        System.out.println("String: " + str + ". int: " + i);
    }

    static void f(int i, String str) {
        System.out.println("int: " + i + ". String: " + str);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "int first");
    }
}
