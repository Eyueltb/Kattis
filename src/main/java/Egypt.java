import java.util.Scanner;

public class Egypt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            String[] strNumbers= sc.nextLine().split(" ");
            int firstLine=Integer.parseInt(strNumbers[0]);
            int secondLine=Integer.parseInt(strNumbers[1]);
            int thirdLine=Integer.parseInt(strNumbers[2]);
            if(firstLine==0 && secondLine==0 && thirdLine==0)
                break;
            if(firstLine >secondLine){
                int temp = firstLine;firstLine=secondLine;secondLine=temp;
            }
            if(secondLine>thirdLine){
                int temp =secondLine;secondLine=thirdLine;thirdLine=temp;
            }
            System.out.println(((firstLine*firstLine)+(secondLine*secondLine)==(thirdLine*thirdLine))? "right" : "wrong");
        }
        sc.close();
    }
}
