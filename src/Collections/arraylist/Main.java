package Collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    //Создайте ArrayList, хранящий список цветов.
    // Заполните список с консоли(до “#stop”) и потом распечатайте список способами:
    //через индексы
    //iterator
    //foreach
    //через System.out.print()
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String color = scanner.next();
            if(!color.equals("#stop")) {
                colors.add(color);
            } else {
                break;
            }
        }

        System.out.println("Список через индексы: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("Список через iterator: ");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Список через foreach: ");
        System.out.println("Enter array length: ");
        int size = scanner.nextInt();
        System.out.println("Insert array elements:");
                for (int i = 0; i < size; i++) {
                    colors.add(scanner.next());
                }
        System.out.println("Result: ");
        for(String element: colors) {
            System.out.println(element);
        }
    }
}
