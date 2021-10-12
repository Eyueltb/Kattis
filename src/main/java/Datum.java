import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] strNumbers= sc.nextLine().split(" ");
        String givenDate = strNumbers[0] + "/" + strNumbers[1] + "/2009";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(givenDate, format);
        DayOfWeek day = date.getDayOfWeek();
        System.out.println(day.getDisplayName(TextStyle.FULL, Locale.US));
        sc.close();
    }
}
