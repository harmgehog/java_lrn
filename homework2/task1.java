package homework2;

public class task1 {
    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
        System.out.println(findJewelsInStones("aB", "aaaAbbbB"));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder rslt = new StringBuilder();
        for (char i : jewels.toCharArray()){
            rslt.append(i); int cnt = 0;
            for (char j : stones.toCharArray()) if (i == j) cnt++;
            rslt.append(cnt);
        }
        return rslt.toString();
    }
}
