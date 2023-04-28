package homework4;

public class task2 {
    //    Реализуйте очередь с помощью LinkedList со следующими методами: enqueue()
    //    - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди
    //    и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        LinkMethods myList = new LinkMethods(20, 0, 50);
        System.out.println("Выводим список: \n" + myList.getL());

        myList.enqueue(17);
        System.out.println("Поместить в конец элемент '17'\n" + myList.getL());

        int deleteFirst = myList.dequeue();
        System.out.printf("Возврат и удаление первого элемента %d:\n", deleteFirst);
        System.out.println(myList.getL());

        int first = myList.first();
        System.out.printf("Возврат первого элемента без удаления %d:\n", first);
        System.out.println(myList.getL());

    }
}