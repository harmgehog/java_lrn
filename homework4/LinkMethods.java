package homework4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class LinkMethods {
    private final LinkedList<Integer> mylst;
    private static final Random r = new Random();
    LinkMethods(int len, int min, int max) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < len; i++) l.add(r.nextInt(min, max+1));
        this.mylst = l;
    }
    LinkedList<Integer> reverse(LinkedList<Integer> list){
        LinkedList<Integer> tmp = new LinkedList<>();
        for (Integer i: list) tmp.addFirst(i);

        return tmp;
    }
    static LinkedList<Integer> createList(int len, int min, int max){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < len; i++) list.add(r.nextInt(min, max+1));

        return list;
    }
    void enqueue(int value) {this.mylst.add(value);}
    int dequeue() {return mylst.removeFirst();}
    int first() {return mylst.getFirst();}
    LinkedList<Integer> getL() {return mylst;}

    int sumList(LinkedList<Integer> list){
        ListIterator<Integer> i = list.listIterator(list.size());
        int sum = 0;
        while (i.hasPrevious()) sum += i.previous();

        return sum;
    }
}
