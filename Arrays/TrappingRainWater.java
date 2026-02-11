public class TrappingRainWater {
    public static int trap(int[] height) {
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            if (lmax < rmax) {
                ans += lmax - height[l];
                l++;
            } else {
                ans += rmax - height[r];
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = trap(height);
        System.out.println("Total trapped rain water: " + result);
    }
}
