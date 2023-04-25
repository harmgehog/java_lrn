package homework3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class task1 {
    private static final Random r = new Random();
    public static void main(String[] args) {
        /* Пусть дан произвольный список целых чисел, удалить из него четные числа */
        List<Integer> l = createList(10, 0,50);
        System.out.println(l);

        l.removeIf(x -> x%2==0);
        System.out.println(l);
    }
    public static List<Integer> createList(int len, int min, int max){
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < len; i++) l.add(r.nextInt(min, max+1));

        return l;
    }
}
