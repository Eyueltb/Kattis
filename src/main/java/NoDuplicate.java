import java.util.*;

import java.util.stream.*;

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
