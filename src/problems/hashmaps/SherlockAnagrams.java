package problems.hashmaps;

/*
*Two strings are anagrams of each other if the letters of one string can be
  rearranged to form the other string. Given a string, find the number of pairs of
  substrings of the string that are anagrams of each other.

* */

import java.util.*;

public class SherlockAnagrams {

    public static void main(String[] args) {

        characterCount("mom");
        printSubstring("mom");

        System.out.println(sherlockAndAnagrams("mom"));

    }

    public static int sherlockAndAnagrams(String str){
        int anagramCount=0;
        Map<String,Integer> hmSubStringCount = new HashMap<>();
        int len = str.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len+1;j++){
                String subString= str.substring(i,j);
                if(hmSubStringCount.containsKey(subString)){
                    int count = hmSubStringCount.get(subString);
                    count++;
                    hmSubStringCount.put(subString,count);
                }else{
                    hmSubStringCount.put(subString,1);
                }
            }
        }

        for(String key : hmSubStringCount.keySet()){

            if(key.length()==1 && hmSubStringCount.get(key)%2==0){
                int pairCount = hmSubStringCount.get(key)/2;
                anagramCount=anagramCount+pairCount;
            }

        }


        return anagramCount;
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
