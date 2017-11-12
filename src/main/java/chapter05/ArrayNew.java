package chapter05;

// Creating arrays with new

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        int[] arr;
        Random random = new Random(47);
        arr = new int[random.nextInt(20)];
        System.out.println("length of arr = " + arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
