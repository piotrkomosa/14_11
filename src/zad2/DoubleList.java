package zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleList {

    public static void main(String[] args) {
        showNumbersAndSum(printNumber());
    }
    static List<Integer> printNumber() {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Podaj liczby:");
        Integer input = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            if (input >= 0)
                numbers.add(input);
        } while (input >= 0);
        System.out.println("Liczby musza byc większe od 0");
        return numbers;
    }
    private static void showNumbersAndSum(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
        sum(numbers);
        System.out.println();
    }
    private static void sum(List<Integer> numbers) {
        int sum = 0;
        System.out.println("Suma liczb to:");
        for (int i = 0; i < numbers.size(); i++) {
            if (i == (numbers.size() - 1)) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + "+");
            }
            sum += numbers.get(i);
        }
        System.out.println("=" + sum);
        minMax(numbers);
    }
    private static void minMax(List<Integer> numbers) {
        int min = numbers.get(0);
        int max = 0;
        for (int i : numbers) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : numbers) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Wartość Max to:" + max);
        System.out.println("Wartość Min to:" + min);
    }
}


