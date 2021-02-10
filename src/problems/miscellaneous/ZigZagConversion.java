package problems.miscellaneous;

public class ZigZagConversion {

    public static void main(String[] args) {

        String str = "ABCD";
        int numRows = 1;

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        System.out.println(zigZagConversion.convert(str,numRows));

    }

    public String convert(String s, int numRows) {

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int numCol = n/2 + n%2+2;
        Character[][] characters = new Character[numRows][numCol];

        int i=0,j=0,k=0,charCount=0;

        while (k<numCol){
            i=0;
            while(i<numRows && charCount<n){
                characters[i][j]=s.charAt(charCount);
                charCount++;
                i++;
            }
            i-=2;
            j++;
            while(i>0 && j<numCol &&  charCount<n){
                characters[i][j]=s.charAt(charCount);
                charCount++;
                i--;
                j++;
            }

            k =j;
        }

        for(i=0;i<numRows;i++){
            for(j=0;j<numCol;j++){
                if(characters[i][j]!=null){
                    result.append(characters[i][j]);
                }
            }
        }

        return result.toString();

    }

}
