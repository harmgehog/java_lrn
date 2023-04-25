package homework3;

import java.util.*;

public class task3 {
    private static final Random r = new Random();

    public static void main(String[] args) {
        /* Заполнить список названиями планет Солнечной системы в произвольном порядке
         * с повторениями. Вывести название каждой планеты и количество его повторений в списке.*/
        SolarSystem();
    }

    static void SolarSystem() {
        String[] ps = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        List<String> plnts = new ArrayList<>();
        for (int i = 0; i < 10; i++) plnts.add(ps[r.nextInt(ps.length)]);
        for (String p : ps) {
            int ip = Collections.frequency(plnts, p);
            String end = ip % 10 > 1 && ip % 10 < 5 ? "а" : " ";
            System.out.println(p + " - встречается " + ip + " раз" + end);
        }
    }
}
