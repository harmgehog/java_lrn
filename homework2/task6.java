package homework2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class task6 {
    static FileHandler fh;

    static {
        try {
            fh = new FileHandler("/src/log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //К калькулятору из предыдущего дз добавить логирование.
    public static void main(String[] args) throws IOException {
        calc();
        }

    static void calc() throws IOException {
        System.out.println("Простой калькулятор! \nВведите первое число: ");
        double a = intChk();
        System.out.println("Введите второе число: ");
        double b = intChk();
        while (b == 0) {
            log("На ноль делить нельзя!: ");
            b = intChk();
        }
        System.out.println("Введите операцию(+-*/): ");
        String op = new Scanner(System.in).nextLine();
        while (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            log("Некорректный ввод!: ");
            op = new Scanner(System.in).nextLine();
        }
        switch (op) {
            case "+" -> log(a + op + b + " = " + (a + b));
            case "-" -> log(a + op + b + " = " + (a - b));
            case "*" -> log(a + op + b + " = " + (a * b));
            case "/" -> log(a + op + b + " = " + (a / b));
            default -> log("Что-то пошло не так!");
        }
    }
    static void log(String s) throws IOException {
        System.out.println(s);
        Logger logger = Logger.getLogger(task6.class.getName());
        logger.addHandler(fh); fh.setFormatter(new SimpleFormatter());
        logger.info(s);
    }
    public static int intChk() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            log("Некорректный ввод!: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
