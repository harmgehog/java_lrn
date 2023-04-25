package homework3;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        /* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее
         * арифметическое из этого списка. Collections.max()*/
        List<Integer> l = task1.createList(100, 0, 100);
        var avg = l.stream().mapToInt(e -> e).average();
        String rslt = l + "\nMax: " + Collections.max(l) +
                "\nMin: " + Collections.min(l) + "\nAvg: " + avg.getAsDouble();
        System.out.println(rslt);
    }
}
