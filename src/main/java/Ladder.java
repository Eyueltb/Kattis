import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//enable to accept form keybord
        while(sc.hasNextInt())
        {
            long fLine=sc.nextInt();
            long degree=sc.nextInt();
            long hypothesis= (int)(Math.ceil(fLine/(Math.sin(Math.toRadians(degree)))));
            System.out.println(hypothesis);
        }
        sc.close();
    }
}
