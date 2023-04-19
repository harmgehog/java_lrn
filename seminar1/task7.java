package seminar1;
/*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
 например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
  решение или сообщить, что его нет.
*/
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("q (0-любое):");
        int q = sc.nextInt();
        System.out.print("w(0-9):");
        int w = sc.nextInt();
        System.out.print("e(0-любое):");
        int e = sc.nextInt();
        System.out.printf("%d? + ?%d = %d \n", q, w, e);
        int a =0;
        if (e%10>=w) {a = e%10-w;} else {a = e%10+10-w;}
        if ((e - (q*10+a)>=w)) System.out.printf("%d%d + %d = %d \n", q, a,(e - (q*10+a)), e);
        else System.out.println("Нет решения");
    }
}