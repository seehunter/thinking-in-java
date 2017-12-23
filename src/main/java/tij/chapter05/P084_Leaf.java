package book.thinkinginjava.chapter05;

// Simple use of the "this" keyword

public class P084_Leaf {
    int i = 0;

    P084_Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        P084_Leaf l = new P084_Leaf();
        l.increment().increment().increment().print();
    }
}

/*
i = 3
 */