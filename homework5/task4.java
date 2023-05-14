package homework5;

public class task4 {
    private static final int[] col = new int[8+1];
    private static final int[] right = new int[(2 * 8) + 1];
    private static final int[] left = new int[(2 * 8) + 1];
    private static final int[] queen = new int[8 + 1];
    private static int cnt;

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) col[i] = 0;
        for (int i = 1; i <= (2 * 8); i++) right[i] = left[i] = 0;
        backtrack(1);
    }

    public static void backtrack(int i) {
        if (i > 8) showAnswer();
        else {
            for (int j = 1; j <= 8; j++) {
                if ((col[j] == 0) && (right[i + j] == 0) && (left[i - j + 8] == 0)) {
                    queen[i] = j;
                    col[j] = right[i + j] = left[i - j + 8] = 1;
                    backtrack(i + 1);
                    col[j] = right[i + j] = left[i - j + 8] = 0;
                }
            }
        }
    }

    protected static void showAnswer() {
        cnt++;
        System.out.println("\nВариант № " + cnt);
        for (int y = 1; y <= 8; y++) {
            for (int x = 1; x <= 8; x++) {
                if (queen[y] == x) System.out.print("Q ");
                else System.out.print("▦ ");
            }
            System.out.println();
        }
    }
}