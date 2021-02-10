package problems.miscellaneous;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {

        System.out.println(longestSubstringLength("dvdf"));

    }

    private static int longestSubstringLength(String str) {

        int maxLen =0;
        int n = str.length();
        Map<Character,Integer> hmPositions = new HashMap<>();
        int left=0,right=0;

        while(right<n){

            char ch = str.charAt(right);

            if(!hmPositions.containsKey(ch)){
                hmPositions.put(ch,right);
            }else{

                int prevPos = hmPositions.get(ch);
                if(prevPos>=left && prevPos<=right){
                    left=prevPos+1;
                }
                hmPositions.put(ch,right);
            }
            maxLen = Math.max(maxLen,(right-left)+1);
            right++;

        }
        return maxLen;
    }



}
