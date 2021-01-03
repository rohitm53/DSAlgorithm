package problems.hashmaps;

/*
*Two strings are anagrams of each other if the letters of one string can be
  rearranged to form the other string. Given a string, find the number of pairs of
  substrings of the string that are anagrams of each other.

* */

import java.util.*;

public class SherlockAnagrams {

    public static void main(String[] args) {

        System.out.println(sherlockAndAnagrams("kkkk"));

    }

    public static int sherlockAndAnagrams(String str){
        int anagramCount=0;
        int len = str.length();
        ArrayList<String> arrSubString = new ArrayList<>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len+1;j++){
                String subString= str.substring(i,j);
                arrSubString.add(subString);
            }
        }

        len  = arrSubString.size();

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(isAnagram(arrSubString.get(i),arrSubString.get(j))){
                    anagramCount++;
                }
            }
        }

        System.out.println(arrSubString);

        return anagramCount;
    }

    public static boolean isAnagram(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }else{
            int[] count = new int[26];

            for(int i=0;i<s1.length();i++){
                count[s1.charAt(i)-'a']++;
                count[s2.charAt(i)-'a']--;
            }

            for(int i=0;i<26;i++){
                if(count[i]!=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSubstring(String str){
        ArrayList<String> arrStr = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                arrStr.add(str.substring(i,j));
            }
        }
        System.out.println(arrStr);
    }

    public static void characterCount(String str){

        Map<Character,Integer> hmCharCount = new HashMap<>();
        for(Character character : str.toCharArray()){

            if(hmCharCount.containsKey(character)){
                int count = hmCharCount.get(character);
                count++;
                hmCharCount.put(character,count);
            }else{
                hmCharCount.put(character,1);
            }
        }
        System.out.println(hmCharCount);
    }

}
