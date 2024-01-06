import java.util.Arrays;

public class SortingSolution implements Solution {
    @Override
    public boolean checkForDuplicates(Integer[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i].equals(numbers[i + 1])) {
                return true;
            }
        }
        return false;
    }
}