package homework2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    static Scanner sc = new Scanner(System.in);

    //    На первой строке записывается натуральное число n - количество строчек в книге.
    //    Затем вводится n строк - строки книги. потом вводится натуральное число m - количество
    //    продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 -
    //    продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт,
    //    на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
    //    название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые
    //    нужно выполнить замену, не встречаются изначально в тексте.
    //    Выходные данные
    //    Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания
    //    не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы,
    //    то и замена тоже должна начинаться с большой буквы!
    //    Sample Input:
    //            2
    //    Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте
    //    измельчённый арахис на мороженое.
    //            Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
    //            3
    //    арахис - колбаса
    //    клубника - вишня
    //    сгущенка - молоко
    //    Sample Output:
    //    Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте
    //    измельчённый колбаса на мороженое.
    //    Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
    public static void main(String[] args) {
        int n = sc.nextInt(); sc.nextLine();
        String[] recipe = new String[n];
        for (int i = 0; i < n; i++) recipe[i] = sc.nextLine();

        int m = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < m * 2; i += 2) {
            String[] w = sc.nextLine().split(" - ");
            for (String el : recipe) {
                el = el.replaceAll(w[0], w[1]);
                el = el.replaceAll(w[0].substring(0, 1).toUpperCase() + w[0].substring(1),
                        w[1].substring(0, 1).toUpperCase() + w[1].substring(1));
            }
        }
        for (String el : recipe) System.out.println(el);
    }
}