package chapter05;

// when the constructor is called to create a
// Window object, you'll see a message
class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window win1 = new Window(1); // before constructor

    House() {
        // show that we are in the constructor
        System.out.println("House()");
        win3 = new Window(33); // reinitialize win3
    }

    Window win2 = new Window(2); // after constructor

    void f() {
        System.out.println("f()");
    }

    Window win3 = new Window(3); // at end
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f(); // show that construction is done
    }
}
