import java.util.*;

import java.util.stream.*;
/**
 * There is a game in which you try not to repeat a word while
 * your opponent tries to see if you have repeated one.
 *
 * "THE RAIN IN SPAIN" has no repeats.
 *
 * "IN THE RAIN AND THE SNOW" repeats THE.
 *
 * "THE RAIN IN SPAIN IN THE PLAIN" repeats THE and IN.
 *
 * Write a program to test a phrase.
 *
 * Input
 * Input is a line containing words separated by single spaces,
 * where a word consists of one or more uppercase letters. A line contains no more than 80 characters.
 *
 * Output
 * The output is "yes" if no word is repeated, and "no" if one or more words repeat.
 *
 * Sample Input 1   Sample Output 1
 * THE RAIN IN SPAIN
 * yes
 * Sample Input 2   Sample Output 2
 * IN THE RAIN AND THE SNOW
 * no
 * Sample Input 3   Sample Output 3
 * THE RAIN IN SPAIN IN THE PLAIN
 * no
 */
public class NoDuplicate {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String [] inputs=sc.nextLine().split(" ");
        isDuplicateStream(inputs);
        //isDuplicate(inputs);
    }
   private static void isDuplicateStream(String[] inputs){
       Set<String>filter=new HashSet<>();
       filter.addAll(Arrays.stream(inputs).filter(input->!filter.contains(input)).collect(Collectors.toList()));
       System.out.println((filter.size()== inputs.length)? "yes":"no");

   }
   private static void isDuplicate(String[] inputs) {
        Set<String> filter=new HashSet<>();
        for(String input: inputs){
            if(!filter.contains(input))
                filter.add(input);
        }
        System.out.println((filter.size()== inputs.length)? "yes":"no");
    }
}
