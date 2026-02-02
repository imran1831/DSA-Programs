import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(nums.length);

        for (int num : nums) {
            if (!seen.add(num)) { // already exists → duplicate
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate? " + result);
    }
}
