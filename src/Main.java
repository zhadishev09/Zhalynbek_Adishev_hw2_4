import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка А: ");
            String stringA = scanner.nextLine();
            listA.add(stringA);
        }

        System.out.println("Список А: " + listA);

        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка Б: ");
            String stringB = scanner.nextLine();
            listB.add(stringB);
        }
        System.out.println("Список Б: " + listB);


        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4-i));
        }

        System.out.println("Список С: " + listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список С: " + listC);
    }
}