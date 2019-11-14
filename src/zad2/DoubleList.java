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
            numbers.add(input);
        } while (input >= 0);
        System.out.println("Liczby musza byc większe od 0");
        return numbers;
    }
    private static void  showNumbersAndSum(List<Integer> numbers) {


        for (int i = numbers.size()-1; i >= 0 ; i--) {
            System.out.println(numbers.get(i));

        }


        }

    }

       





//    private static void sum(List<Double> numbers) {
//        double sum = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            sum += numbers.get(i);
//        }
//    }


//    private static void add(int numberOfLines) {
//        System.out.println("podaj liczby:");
//        Scanner scanner = new Scanner(System.in);
//        List<Double> numbers = new ArrayList<>();
//       // double userInput;
//        double sum=0;
//        while(scanner.nextDouble()>0){
//            double userInput = scanner.nextDouble();
//            sum += userInput;
//
//        }
//        System.out.println("Suma to" + sum);
//
//    }



