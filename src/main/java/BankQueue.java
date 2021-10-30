import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BankQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] strNumbers = sc.nextLine().split(" ");
        int numPeople = Integer.parseInt(strNumbers[0]);
        int totalTime = Integer.parseInt(strNumbers[1]);
        List<Integer>[] money = new ArrayList[totalTime];
        for (int i = 0; i < totalTime; i++) {
            money[i] = new ArrayList<>();
        }

        while (numPeople-- > 0) {
            String[] person = sc.nextLine().split(" ");
            money[Integer.parseInt(person[1])].add(Integer.parseInt(person[0]));
        }

        List<Integer> moneyOptions = new ArrayList<>(totalTime);

        int maxMoney = 0;
        for (int i = totalTime - 1; i >= 0; i--) {
            moneyOptions.addAll(money[i]);

            if (!moneyOptions.isEmpty()) {
                Collections.sort(moneyOptions);
                maxMoney += moneyOptions.remove(moneyOptions.size() - 1);
            }
        }
        System.out.println(maxMoney);
        sc.close();
    }
}
