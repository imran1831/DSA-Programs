public class MaxWaterContainer {

    public static int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxHeight=0;
        while(l<r){
            if(height[l]<=height[r]){
                maxHeight=Math.max(maxHeight,height[l]*(r-l));
                l++;
            }
            else{
                maxHeight=Math.max(maxHeight,height[r]*(r-l));
                r--;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("Maximum water that can be stored: " + result);
    }
}
