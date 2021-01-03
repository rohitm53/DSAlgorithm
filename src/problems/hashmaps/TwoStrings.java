package problems.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        String mainStr;
        String childStr;
        Map<Character,Character > hmStr = new HashMap<>();

        if(s1.length()>=s2.length()){
            mainStr=s1;
            childStr=s2;
        }else{
            mainStr=s2;
            childStr=s1;
        }

        for(int i=0;i<mainStr.length();i++){
            hmStr.put(mainStr.charAt(i),mainStr.charAt(i));
        }

        for(int i=0;i<childStr.length();i++){

            if(hmStr.containsKey(childStr.charAt(i))){
                return "YES";
            }

        }

        return "NO";

    }

    public static void main(String[] args) {

        String s1="hello";
        String s2="world";

        System.out.println(twoStrings(s1,s2));

    }
}
