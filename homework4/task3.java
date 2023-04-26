package homework4;


import java.util.LinkedList;

public class task3 {
    // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    public static void main(String[] args) {
        LinkMethods myL = new LinkMethods(20, 0, 50);
        System.out.println(myL.getL() + "\nСумма всех элементов:\n" + myL.sumList(myL.getL()));
    }
}