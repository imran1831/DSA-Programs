import java.util.Arrays;

public class ZeroesToEnd {
    public static int[] move_Zero(int a[]){
        int i=0;
        int temp;
        for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
            
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={1,5,0,9,0,3,2,0,1};
        System.out.println(Arrays.toString(move_Zero(arr)));
    }
}
