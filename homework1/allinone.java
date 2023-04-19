package homework1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class allinone {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите НОМЕР ЗАДАЧИ или 0 для завершения программы: ");
            switch (intChk()) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                case 7 -> task7();
                default -> System.exit(0);
            }
        }
    }

    public static int intChk() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Некорректный ввод!: ");
            sc.next();
        }
        return sc.nextInt();
    }

    static void task1() {
        System.out.println(" 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)");
        System.out.println("Введите число: ");
        int num = intChk();
        int result = num * (num + 1) / 2;
        System.out.println("сумма чисел от 1 до n равна: " + result);
    }

    static void task2() {
        System.out.println("2. Вычислить n! (произведение чисел от 1 до n)");
        System.out.println("Введите число: ");
        int num = intChk();
        int result = 1;
        for (int i = 1; i <= num; i++) result *= i;
        System.out.println("n! равен " + result);
    }

    public static boolean isPrime(final int n) {return IntStream.rangeClosed(2, n/2).noneMatch(i -> n % i == 0);}

    static void task3() {
        System.out.println("3. Вывести все простые числа от 1 до 1000 ");
        for (int i = 2; i < 1001; i++) {if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    static void task4() {
        System.out.println("4. Реализовать простой калькулятор: ");
        System.out.println("Введите первое число: "); double a = intChk();
        System.out.println("Введите второе число: "); double b = intChk();
        while (b == 0) {System.out.println("На ноль делить нельзя!: "); b = intChk();}
        System.out.println("Введите операцию(+-*/): ");
        String op = new Scanner(System.in).nextLine();
        while (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            System.out.println("Некорректный ввод!: ");
            op = new Scanner(System.in).nextLine();
        }
        switch (op) {
            case "+" -> System.out.println(a + op + b + " = " + (a + b));
            case "-" -> System.out.println(a + op + b + " = " + (a - b));
            case "*" -> System.out.println(a + op + b + " = " + (a * b));
            case "/" -> System.out.println(a + op + b + " = " + (a / b));
            default -> System.out.println("Что-то пошло не так!");
        }
    }

    static void task5() {
        System.out.println("5. (Не обязательное) +Задано уравнение вида q + w = e. Где q, w, e целые не отрицательные числа. Некоторые " +
                "цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного " +
                "равенства. Предложить хотя бы одно решение или сообщить, что его нет. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число, заменив вторую цифру на знак: ");
        int q = Integer.parseInt(String.valueOf(sc.nextLine().charAt(0))) * 10;
        System.out.println("Введите второе число, заменив первую цифру на знак: ");
        int w = Integer.parseInt(String.valueOf(sc.nextLine().charAt(1)));
        System.out.println("Введите сумму искомых чисел: ");
        int e = intChk();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 99; j+=10) {
                if ((q + i + j + w) == e) {
                    System.out.println((q + i) + " + " + (j + w) + " = " + e);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Решений нет");
        }
    }

    static void task6() {
        System.out.println("6. (Не обязательное) Вводится массив (сначала количество элементов, потом сами " +
                "элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом " +
                "выведите числа, которые суммировались. " +
                "Sample Input: 4   1 2 3 4 (на отдельных строках) Sample Output: 4 1 3 (на отдельных строках)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int l = Integer.parseInt(sc.nextLine());
        int[] arr = new int[l];
        int sum_nums = 0;
        for (int i = 0; i < l; i++) {
            System.out.printf("Введите элемент %d%n: ", i + 1);
            arr[i] = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) sum_nums += arr[i];
        }
        System.out.println(sum_nums);
        for (int i = 0; i < l; i += 2) System.out.println(arr[i]);
    }

    static void task7() {
        System.out.println("7. (Не обязательное) Дан список. Выведите те его элементы, которые встречаются в " +
                "списке только один раз. Элементы нужно выводить в том порядке, в котором они " +
                "встречаются в списке. Вводится список чисел. Все числа списка находятся на одной строке. " +
                "Sample Input: 6 1 2 2 3 3 3 " +
                "Sample Output: 6 1 (на отдельных строках)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите все числа отдной строкой через пробел: ");
        String[] arr = sc.nextLine().split(" ");
        System.out.print("Уникальные элементы: ");
        for (String i : arr) {
            int counter = 0;
            for (String j : arr) if (j.equals(i)) counter++;
            if (counter == 1) System.out.printf("%s ", i);
        }
    }
}