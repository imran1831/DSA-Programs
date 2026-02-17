import java.util.*;
public class FruitsIntoBasket{
    public static int totalFruit(int[] fruits) {
        int l = 0;
        int maxWin = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < fruits.length; r++) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }
            maxWin = Math.max(maxWin, r - l + 1);
        }
        return maxWin;
    }
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        int result = totalFruit(fruits);
        System.out.println("Maximum fruits collected: " + result);
    }
}
