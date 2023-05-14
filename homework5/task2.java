package homework5;

import java.util.*;

public class task2 {
    /* Дан список Имя Фамилия.
    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */
    public static void main(String[] args) {
        String[] list = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<String, Integer> map = new TreeMap<>(); // сортировка имен по алфавиту
        for (String name : list) {
            if (map.containsKey(name.split(" ")[0]))
                map.put(name.split(" ")[0], map.get(name.split(" ")[0]) + 1);
            else map.put(name.split(" ")[0], 1);
        }

        Map<Integer, String> rslt = new TreeMap<>(Collections.reverseOrder()); // убывание по количеству
        for (Map.Entry<String, Integer> el : map.entrySet()) {
            if (rslt.containsKey(el.getValue())) rslt.put(el.getValue(), rslt.get(el.getValue()) + ", " + el.getKey());
            else rslt.put(el.getValue(), el.getKey());
        }

        for (Map.Entry<Integer, String> item : rslt.entrySet()) {
            System.out.println(item.getValue().toString() + " - " + item.getKey());
        }
    }
}