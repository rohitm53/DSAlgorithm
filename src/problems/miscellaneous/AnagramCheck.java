package problems.miscellaneous;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(checkAnagramByCharCountSingleArray(s1,s2));
    }

    //Time Complexity = O(n+m)
    public static boolean checkAnagramBySortin(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }else{

            char[] str1 = s1.toLowerCase().toCharArray();
            char[] str2 = s2.toLowerCase().toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            return Arrays.equals(str1,str2);
        }
    }

    // Time Complexity: O(nLogn)
    public static boolean checkAnagramByCharCount(String s1,String s2){

        int NO_OF_CHAR=256;
        int[] count1 = new int[NO_OF_CHAR];
        int[] count2 = new int[NO_OF_CHAR];

        Arrays.fill(count1,0);
        Arrays.fill(count2,0);

        if(s1.length()!=s2.length()){
            return false;
        }else{

            for(int i=0;i<s1.length() && i<s2.length();i++){
                count1[s1.charAt(i)]++;
                count2[s2.charAt(i)]++;
            }

            for(int i=0;i<NO_OF_CHAR;i++){
                if(count1[i]!=count2[i]){
                    return false;
                }
            }
        }
        return true;
    }


    // Time Complexity: O(n)
    public static boolean checkAnagramByCharCountSingleArray(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }else{
            int NO_OF_CHAR=256;
            int[] count = new int[NO_OF_CHAR];

            for(int i = 0; i < s1.length(); i++){
                count[s1.charAt(i)]++;
                count[s2.charAt(i) ]--;
            }

            for(int i = 0; i < NO_OF_CHAR; i++){
                if (count[i] != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
