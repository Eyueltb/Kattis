import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SpeedLimit {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // displayTotalMiles(sc);
        displayTotalMilesUsingStream(sc);
    }
    private static void displayTotalMilesUsingStream(Scanner sc) {
        while (true) {
            int speeds = sc.nextInt();
            if (speeds == -1) break;
            int totalMiles = 0, previousHours = 0, miles = 0, hours = 0;
            int finalMiles = miles;
            int finalPreviousHours = previousHours;
            totalMiles= IntStream.range(0, speeds-1)
                    .boxed()
                    .parallel()
                    .mapToInt(i->
                            i += (sc.nextInt() * Math.abs(sc.nextInt() - previousHours))).sum();

           *//* for (int i = 0; i < speeds; i++) {
                miles = sc.nextInt();
                hours = sc.nextInt();
                totalMiles += (miles * Math.abs(hours - previousHours));
                previousHours = hours;
            }*//*
            System.out.println(totalMiles + " miles");
        }
    }
    private static void displayTotalMiles(Scanner sc) {
        while (true) {
            int speeds = sc.nextInt();
            if (speeds == -1) break;
            int totalMiles = 0, previousHours = 0, miles = 0, hours = 0;
            for (int i = 0; i < speeds; i++) {
                miles = sc.nextInt();
                hours = sc.nextInt();
                totalMiles += (miles * Math.abs(hours - previousHours));
                previousHours = hours;
            }
            System.out.println(totalMiles + " miles");
        }
    }*/
}
