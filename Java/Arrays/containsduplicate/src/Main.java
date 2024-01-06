import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        class Solution {
            public boolean checkForDuplicates(Integer[] numbers) {
                Set<Integer> uniqueNumbers = new HashSet<>();

                for (int number : numbers) {
                    if (uniqueNumbers.contains(number)) {
                        return true;
                    }

                    uniqueNumbers.add(number);
                }

                return false;
            }
        }

        Solution solution = new Solution();

        Integer[][] duplicateArrays = {
            {1,2,3,1},
            {1,2,3,4},
            {1,1,1,3,3,4,3,2,4,2}
        };

        for (Integer[] duplicate : duplicateArrays) {
            boolean result = solution.checkForDuplicates(duplicate);
            System.out.println("The result for this duplicate array " + Arrays.toString(duplicate) + " is: " + result);
        }
    }
}