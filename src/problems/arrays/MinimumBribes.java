package problems.arrays;

public class MinimumBribes {

//    static void minimumBribes(int[] q) {
//        int bribes=0;
//        boolean isChaotic=false;
//
//        for(int i=0;i<q.length;i++){
//            int bribe = q[i]-(i+1);
//            if(bribe>2){
//                isChaotic=true;
//                 break;
//            }else{
//                if(bribe>0){
//                    bribes+= bribe;
//                }else{
//                  int expectedValue = i+1;
//                  int currentValue = q[i];
//
//                    System.out.println("expectedValue = "+expectedValue+"\n" +
//                            "currentValue = "+currentValue);
//                }
//            }
//        }
//
//        if(isChaotic){
//            System.out.println("Too chaotic");
//        }else{
//            System.out.println(bribes);
//        }
//    }

    static void minimumBribes(int[] q) {
        int bribes=0;
        boolean isChaotic=false;

        for(int i=0;i<q.length;i++){
            int bribe = q[i]-(i+1);
            if(bribe>2){
                isChaotic=true;
                 break;
            }else{
                if(bribe>0){
                    bribes+=bribe;
                }
            }
        }

        if(isChaotic){
            System.out.println("Too chaotic");
        }else{
            System.out.println(bribes);
        }
    }

    public static void main(String[] args) {
        int[] queue = {1,2,5,3,7,8,6,4};
        minimumBribes(queue);
    }
}
