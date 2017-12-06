package book.thinginginjava.chapter05;

public class e_Leaf {
    int i = 0;

    e_Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        e_Leaf l = new e_Leaf();
        l.increment().increment().increment().print();
    }
}
