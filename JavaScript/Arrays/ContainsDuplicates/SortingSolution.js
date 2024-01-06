function checkForDuplicates(numbers) {
    numbers.sort((a, b) => a - b);

    for (let i = 0; i < numbers.length - 1; i++) {
        if (Object.is(numbers[i], numbers[i + 1])) {
            return true;
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
    const result = checkForDuplicates(numberSet.numbers);
    console.log(`The result for this number ${numberSet.setName} is: ${result}`);
}