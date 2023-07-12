package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        double first = Double.valueOf(scanner.nextLine());
        System.out.println("Second number:");
        double second = Double.valueOf(scanner.nextLine());
        System.out.println("Select the operator you wish you use:");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        char a = scanner.next().charAt(0);
        calculate(first, second, a);
    }

    public static int calculate(double first, double second, char a) {
        double sum = 0;
        if (a == '+') {
            sum = first + second;
        }
        else if (a == '-') {
            sum = first - second;
        }
        else if (a == '*') {
            sum = first * second;
        }
        else if (a == '/') {
            sum = first / second;
        }

        System.out.println(sum);
        return 0;
    }
}