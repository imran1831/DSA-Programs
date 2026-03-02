import java.util.*;
public class Anagram {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        if(s.length()<p.length())return list;
        int l=0;
        HashMap<Character,Integer>hp1=new HashMap<>();
        HashMap<Character,Integer>hp2=new HashMap<>();
        for(int i=0;i<p.length();i++) hp2.put(p.charAt(i),hp2.getOrDefault(p.charAt(i),0)+1);
        for(int r=0;r<s.length();r++){
            hp1.put(s.charAt(r),hp1.getOrDefault(s.charAt(r),0)+1);
            while(r-l+1>p.length()){
                hp1.put(s.charAt(l),hp1.getOrDefault(s.charAt(l),0)-1);
                if(hp1.get(s.charAt(l))==0) hp1.remove(s.charAt(l));
                l++;
            }
            if(hp1.equals(hp2)) list.add(l);
        }
        return list;
    }
    public static void main(String[] args) {
        String s="cbaebabacd";
        String t="abc";
        System.out.println(findAnagrams(s,t));
    }
}
