package problems.miscellaneous;

public class LongestPalindrom {

    int resultLength;
    int resultStart;

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";

        int len = s.length();

        LongestPalindrom ob = new LongestPalindrom();
        for(int start=0;start<len;start++){
            ob.expandRange(s,start,start);
            ob.expandRange(s,start,start+1);

        }

        System.out.println(s.substring(ob.resultStart, ob.resultStart+ob.resultLength));
    }

    private void expandRange(String str, int begin, int end) {

        while (begin>=0 && end<str.length() && str.charAt(begin)==str.charAt(end)){
            begin--;
            end++;
        }

        /*
        * begin value will becomes -1 in best case and end value will exceeds the length of string
        * thats why we need the formula (end-begin-1)
        * */
        int len = end-begin-1;

        if(resultLength<len){
            resultLength=len;
            resultStart=begin+1;
        }

    }


    private static void printAllSubstrings(String str){
        for (int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++) {
                System.out.println(str.substring(i, j+1));
            }
        }
    }

}
