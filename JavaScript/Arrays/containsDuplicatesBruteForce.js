function checkForDuplicatesBruteForce(numbers) {
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            if (numbers[i] === numbers[j]) {
                return true;
            }
        }
    }
    return false;
}

const numberSets = [
    { setName: 'set1', numbers: [1,2,3,1]},
    { setName: 'set2', numbers: [1,2,3,4]},
    { setName: 'set3', numbers: [1,1,1,3,3,4,3,2,4,2]}
];

for (let numberSet of numberSets) {
    const result = checkForDuplicatesBruteForce(numberSet.numbers);
    console.log(`The result for this number set ${numberSet.setName} is: ${result}`);
}