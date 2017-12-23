package tij.chapter05;

// Using finalize() to detect an object that hasn't been properly cleaned up.

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        this.checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
            // Normally, you'll also do this:
            // super.finalize(); // Call the base class version
        }
    }
}

public class P089_TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to cleanup:
        new Book(true);
        // Force garbage collection & finalization
        System.gc();
    }
}

/*
Error: checked out
 */