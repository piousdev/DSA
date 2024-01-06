import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution[] solutions = {
                new BruteForceSolution(),
                new HashSetSolution(),
                new SortingSolution(),
                new HashSetSimplified()
        };

        Integer[][] numberSets = {
                {1,2,3,1},
                {1,2,3,4},
                {1,1,1,3,3,4,3,2,4,2}
        };

        for (Solution solution : solutions) {
            for (Integer[] numberSet : numberSets) {
                boolean result = solution.checkForDuplicates(numberSet);
                System.out.println("The result for this numberSet array " + Arrays.toString(numberSet) + " using " + solution.getClass().getSimpleName() + " is: " + result);
            }
        }
    }
}