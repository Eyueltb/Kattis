import java.util.Scanner;
/**
 * Input
 * Input begins with an integer 1≤n≤20 on a line by itself, indicating the number of test cases that follow.
 * Each of the following n lines contain a test case consisting of a single integer −10≤x≤10.
 *
 * Output
 * For each x, print either ‘x is odd’ or ‘x is even’ depending on whether x is odd or even.
 *
 * Sample Input 1   Sample Output 1
 * 3
 * 10
 * 9
 * -5
 * 10 is even
 * 9 is odd
 * -5 is odd
 */
public class Oddities {
    public static void main(String[] args) {
        //System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int  firstLine=sc.nextInt();
        int [] inputs=new int[firstLine];
        //Accept Input
        oddities(sc, firstLine, inputs);
        odditiesStream(sc, firstLine, inputs);
    }
    private static String odditiesStream(Scanner sc, int firstLine, int[] inputs) {
        for(int i = 0; i< firstLine; i++)
            inputs[i]= sc.nextInt();
        for(int input: inputs)
          return (inputs[input]%2==0)? inputs[input]+" is even": inputs[input]+" is odd";
        return null;
    }

    private static void oddities(Scanner sc, int firstLine, int[] inputs) {
        for(int i = 0; i< firstLine; i++)
            inputs[i]= sc.nextInt();
        //display output
        for(int i = 0; i< inputs.length; i++)
        {
            System.out.println((inputs[i]%2==0)? inputs[i]+" is even": inputs[i]+" is odd");
        }
    }
}
