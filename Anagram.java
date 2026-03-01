import java.util.List;

public class Anagram {
    public List<Integer> findAnagrams(String s, String p) {
        int l=0;
        List<Integer>list=new List<>();
        for(int r=0;r<s.length();r++){
            String win+=s.charAt(r);
            while(win==p.length()&&win.contains(p)){
                win-=s.charAt(r-l+1);
            }
        }
    }
    public static void main(String[] args) {
        String s="cbaebabacd";
        String t="abc";
        System.out.println(anagram(s,t));
    }
}
