import java.io.Console;
import java.util.Scanner;

public class ThreeDPrintedStatues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(print(sc));
        System.out.println((1+ (int) Math.ceil(Math.log(Integer.parseInt(sc.nextLine()))/Math.log(2))));
    }
    public static int print(Scanner sc){
        int status=Integer.parseInt(sc.nextLine());
        return (1+ (int) Math.ceil(Math.log(status)/Math.log(2)));
    }
}
