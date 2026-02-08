import java.util.*;
public class MergedArray {
    public static int[] mergingArray(int[] nums1,int[] nums2,int m,int n){
        int i=m-1;
        int j=n-1;
        int k=nums1.length-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        return nums1;
        }
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3; //Denotes the elements to be Added
        int n=3; //Denotes the elements to be removed
        System.out.println(Arrays.toString(mergingArray(nums1,nums2,m,n)));
    }
    }
