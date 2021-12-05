package anagram;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(areAnagram("Batman","MaNbat"));
        System.out.println(countLetters("all"));
    }

    public static boolean areAnagram(String first,String second){
        first = first.replace(" ","");
        second=second.replace(" ","");
        first=first.toLowerCase();
        second=second.toLowerCase();
       char[] a =first.toCharArray();
       char[] b =second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result=Arrays.equals(a,b);
        return result;
    }
    public static HashMap<Character,Integer> countLetters(String string){
        if (string==null){
            return null;
        }
        HashMap<Character,Integer> hashMap=new HashMap<>();
        string.toLowerCase();
        string=string.replace(" ","");
        char[] stringAray =string.toCharArray();
        Arrays.sort(stringAray);

        for (char c : stringAray) {
            if (hashMap.containsKey(c)){
                hashMap.replace(c,hashMap.get(c)+1);
            }
            else {
                hashMap.put(c,1);
            }

        }
        if (hashMap.isEmpty()){
            return null;
        }
        return hashMap;
    }
}
