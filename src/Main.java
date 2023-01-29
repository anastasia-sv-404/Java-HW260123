import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ex1(10, 11);
        System.out.println();
        System.out.println();
        ex2(5, 11);
    }

    static void ex1(int countOfNumbers, int maxRandom) {
        System.out.println("Задание 1: дан произвольный список целых чисел, удалить из него четные числа.");
        List<Integer> list = getList(countOfNumbers, maxRandom);
        System.out.println("Исходный список - это: " + list);

        List<Integer> listNonOdd = removeOdd((ArrayList<Integer>) list);
        System.out.println("Список без содержания четных чисел - это: " + listNonOdd);
    }

    static void ex2(int countOfNumbers, int maxRandom) {
        System.out.println("Задание 2: Задан целочисленный список ArrayList. Найти минимальное, максимальное и " +
                "среднее арифметическое из этого списка.");
        List<Integer> listSecond = getList(countOfNumbers, maxRandom);
        System.out.println("Исходный список - это: " + listSecond);
        System.out.println("Минимальный элемент в списке - это: " + getMinElement((ArrayList<Integer>) listSecond));
        System.out.println("Максимальный элемент в списке - это: " + getMaxElement((ArrayList<Integer>) listSecond));
        System.out.printf("Среднее арифметическое для списка - это: " + getAverage((ArrayList<Integer>) listSecond));
    }


    static List<Integer> getList(int countOfNumbers, int maxRandom) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countOfNumbers; i++) {
            list.add(random.nextInt(maxRandom));
        }
        return list;
    }

    static List<Integer> removeOdd(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    static int getMinElement(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    static int getMaxElement(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    static double getAverage(ArrayList<Integer> list) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            count += 1;
            sum += list.get(i);
        }
        return sum * 1.0 / count;
    }
}