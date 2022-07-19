import jdk.internal.icu.text.UnicodeSet;

import java.util.*;
import java.util.concurrent.Callable;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> indexA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите index ListA : ");
            indexA.add(scanner.next());
        }
        System.out.println("ListA: " + indexA);

        ArrayList<String> indexB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите index ListB : ");
            indexB.add(scanner.next());
        }
        System.out.println("ListB: " + indexB);

        ArrayList<String> indexC = new ArrayList<>();
        indexC.add(indexA.get(0));
        indexC.add(indexB.get(4));
        indexC.add(indexA.get(1));
        indexC.add(indexB.get(3));
        indexC.add(indexA.get(2));
        indexC.add(indexB.get(2));
        indexC.add(indexA.get(3));
        indexC.add(indexB.get(1));
        indexC.add(indexA.get(4));
        indexC.add(indexB.get(0));
        System.out.println("ListC: " + indexC);

        indexC.sort(Comparator.comparing(String::length));
        System.out.println("ListC: " + indexC);
        }
    }