
import java.util.*;

public class LongSubstringwithK {
    public static int maxCount(String s,int k){
        HashMap<Character,Integer>freq=new HashMap<>();
        int left=0;
        int dist=0;//Number of unique values
        int ans=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            if(freq.get(ch)==1)dist++;
            while(dist>k){
                char leftChar=s.charAt(left);
                freq.put(leftChar,freq.get(leftChar)-1);
                left++;
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                    dist--;
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="eceba";
        int k=2;
        System.out.println(maxCount(s,k));
        
    }
}
