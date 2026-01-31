public class MergedArray {
    public static int[] mergingArray(int[] nums1,int[] nums2,int m,int n){
        
            for(int i=0;i<m;i++){
                nums1[m++]=nums2[i];
                
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3; //Denotes the elements to be Added
        int n=3; //Denotes the elements to be removed
        System.out.println(mergingArray(nums1,nums2,m,n));

    }
}
