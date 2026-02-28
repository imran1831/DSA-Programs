import java.util.HashMap;
public class SmallestSubstring {
    public static String smallString(String s,String t){
        if(s.length()<t.length())return "";
        HashMap<Character,Integer>need=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>window=new HashMap<>();
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int formed=0;
        int required=need.size();
        int start=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c)&&window.get(c).intValue()==need.get(c).intValue()) formed++;
            while(formed==required){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }
                char leftChar=s.charAt(left);
                window.put(leftChar,window.get(leftChar)-1);
                if(need.containsKey(leftChar)&&need.get(leftChar)>window.get(leftChar))formed--;
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,minLen+start);
    }
    public static void main(String[] args) {
        String s="aaabcbbc";
        String t="abc";
        System.out.println(smallString(s,t));
    }
}
