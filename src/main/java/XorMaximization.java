import java.math.BigInteger;
import java.util.Scanner;

public class XorMaximization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        maxXOr(sc);
        for (int i = 0; i < size; i++) {

        }
        //wrong(sc);
    }
   private static void maxXOr(Scanner sc){

       int l = Integer.parseInt(sc.nextLine());
       int r = Integer.parseInt(sc.nextLine());
       int maxXor = 0;
       for (int i = l; i < r; i++) {
           int temp;
           temp = i ^ (i + 1);
           if (temp > maxXor) {
               maxXor = temp;
           }
       }
       System.out.println(maxXor);
       sc.close();

   }
   private static void wrong(Scanner in) {
        BigInteger l = in.nextBigInteger();
        BigInteger r = in.nextBigInteger();
        int i = l.intValue();
        int last = r.intValue();
        int j = last;
        BigInteger max = BigInteger.valueOf(i).xor(BigInteger.valueOf(j));
        for(i=l.intValue();i<last;i++){
            for(j=last;j>i;j--){
                if(max.compareTo(BigInteger.valueOf(i).xor(BigInteger.valueOf(j))) ==-1){
                    max = BigInteger.valueOf(i).xor(BigInteger.valueOf(j));
                }
            }

        }
        System.out.println(max);
    }
}
