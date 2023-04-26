package homework4;

public class task1 {
//    Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
//    который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

    public static void main(String[] args) {
        LinkMethods myL = new LinkMethods(20, 0, 50);
        System.out.println(myL.getL() + "\nПеревернутый список:\n" + myL.reverse(myL.getL()));
    }
}