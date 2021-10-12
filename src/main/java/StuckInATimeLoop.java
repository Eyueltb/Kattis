import java.util.Scanner;

/**
 * Input
 * Input consists of a single integer N (1≤N≤100).
 *
 * Output
 * Output the entire wizard’s spell by counting from 1 to N, giving one number and “Abracadabra” per line.
 *
 * Sample Input
 * 5
 * Sample Output
 * 1 Abracadabra
 * 2 Abracadabra
 * 3 Abracadabra
 * 4 Abracadabra
 * 5 Abracadabra
 */
public class StuckInATimeLoop {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int  input=sc.nextInt();
        for(int i=1;i<=input;i++)
            System.out.println(i+" Abracadabra");
    }
}
