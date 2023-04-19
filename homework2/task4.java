package homework2;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class task4 {
    //Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
    //Требуется перехватить все возможные ошибки и вывести их в логгер.
    //После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
    public static void main(String[] args) throws SecurityException, IOException {
        Logger lg = Logger.getLogger(task1.class.getName());
        lg.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("./src/log.txt");
        lg.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        byte in = 0;
        System.out.print("Введите байт код: ");
        try{
            Scanner scan = new Scanner(System.in);
            in = scan.nextByte();
            scan.close();
        } catch(Exception e){
            lg.warning(e.getMessage());
            return;
        }

        try{
            File file = new File("./src/result.txt");
            FileWriter fr = new FileWriter(file, true);
            fr.write(String.valueOf(in)+"\n");
            System.out.println(String.valueOf(in));
            fr.close();
        } catch (Exception e) {
            lg.warning(e.getMessage());
        }
    }
}