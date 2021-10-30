import java.io.IOException;
import java.util.*;

public class MaximizingXOR {
    public static void main(String [] args) throws IOException {
    /*    Scanner sc = new Scanner(System.in);
        displayMaximizingXOR(sc);
        sc.close();
    }

    static void displayMaximizingXOR(Scanner sc)  {
        int totalInput=Integer.parseInt(sc.nextLine());
        List<Long> numbers = new ArrayList<>();
        String s[] = sc.nextLine().split(" ");
        for (int i = 0; i < totalInput; ++i)
            numbers.add(Long.parseLong (s[i]));
        long result = 0;
        for (int b = 60; b >= 0; --b)
        {
            for (int i = 0; i < numbers.size(); i++)
                if (numbers.get(i) >= 1L<< b)
                {
                    Long current = numbers.get(i);
                    if ((result & 1L<<b) == 0)
                        result ^= current;
                    for (int j = 0; j < numbers.size(); j++)
                        if (numbers.get(j) >= 1L<<b)
                            numbers.set(j, numbers.get(j) ^ current);
                    numbers.remove(i);
                    break;
                }
        }
        System.out.println(result);
      */
    }


}
