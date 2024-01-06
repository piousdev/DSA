public class HashSetSimplified implements Solution {
    @Override
    public boolean checkForDuplicates(Integer[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            int current = numbers[i];
            int j = i-1;

            while(j>=0 && current<numbers[j]) {
                numbers[j+1] = numbers[j];
                j--;
            }

            if(j>=0 && current==numbers[j]) return true;

            numbers[j+1] = current;
        }

        return false;
    }
}
