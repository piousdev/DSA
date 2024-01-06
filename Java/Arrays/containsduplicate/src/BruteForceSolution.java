public class BruteForceSolution implements Solution {
    @Override
    public boolean checkForDuplicates(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i].equals(numbers[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}