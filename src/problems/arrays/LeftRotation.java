package problems.arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int counter=1;
        int firstElement=-99999;

        do{
            firstElement=a[0];
            for(int i=1;i<a.length;i++){
                int prevIndex = i-1;
                a[prevIndex]=a[i];
            }
            a[a.length-1]=firstElement;
            counter++;
        }while (counter<=d);
        return a;
    }


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int d=4;

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
    }

}
