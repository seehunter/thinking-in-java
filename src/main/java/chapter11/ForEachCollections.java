package chapter11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, ("Take the long way home").split(" "));
        for (String str : cs) {
            System.out.println("'" + str + "'");
        }
    }
}
