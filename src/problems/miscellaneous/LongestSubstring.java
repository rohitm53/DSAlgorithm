package problems.miscellaneous;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {

        System.out.println(longestSubstringLength("abcbbcbb"));

    }


    public static int longestSubstringLength(String str){

        int aPointer=0;
        int bPointer=0;
        int max=0;
        String maxStr = "";

        HashSet<Character> hashSet = new HashSet<>();

        while (bPointer<str.length()){

            if(!hashSet.contains(str.charAt(bPointer))){
                hashSet.add(str.charAt(bPointer));
                bPointer++;
                max = Math.max(hashSet.size(),max);
                if(max<=hashSet.size()){
                    maxStr = hashSet.toString();
                }

            }else{
                hashSet.remove(str.charAt(aPointer));
                aPointer++;
            }
        }
        System.out.println(maxStr);
        return max;
    }


}
