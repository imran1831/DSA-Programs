import java.util.Arrays;
public class runningSum {
    public static int[] sum(int[] nums) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = sum(nums);

        System.out.println(Arrays.toString(result));
    }
}

