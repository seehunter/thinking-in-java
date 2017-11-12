package chapter05;

// Creating an array of non-primitive objects

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] arr = new Integer[random.nextInt(20)];
        System.out.println("length of arr = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(500); // Autoboxing
        }
        System.out.println(Arrays.toString(arr));
    }
}
