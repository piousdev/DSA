import java.util.HashSet;
import java.util.Set;

public class HashSetSolution implements Solution {
    @Override
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
