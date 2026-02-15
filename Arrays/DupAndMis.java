import java.util.*;
public class DupAndMis {
    public static int[] findErrorNums(int[] nums) {
        int rep = 0;
        int mis = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (hs.contains(num)) {
                rep = num;
            } else {
                hs.add(num);
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                mis = i;
                break;
            }
        }
        return new int[]{rep, mis};
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
