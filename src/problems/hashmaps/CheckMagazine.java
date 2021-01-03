package problems.hashmaps;

import java.util.HashMap;

public class CheckMagazine {

    public static void main(String[] args) {

        String[] magazine = {"two", "times" ,"three", "is", "not", "four"};
        String[] note = {"two" ,"times", "two", "is" ,"four"};

        checkMagazine(magazine,note);

    }

    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String,Integer> hmMagzine = new HashMap<>();
        boolean status=true;
        for(String str : magazine){

            if(hmMagzine.containsKey(str)){
                int count = hmMagzine.get(str);
                count++;
                hmMagzine.put(str,count);
            }else{
                hmMagzine.put(str,1);
            }
        }

        for(String str : note){
            if(hmMagzine.containsKey(str)){
                int count = hmMagzine.get(str);
                count--;
                if(count==0){
                    hmMagzine.remove(str);
                }else{
                    hmMagzine.put(str,count);
                }
            }else{
                status=false;
                break;
            }
        }
        System.out.println(status?"Yes":"No");

    }



}
