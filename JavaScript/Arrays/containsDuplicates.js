// Set solution
function checkForDuplicates(numbers) {
    const uniqueNumbers = new Set();

    for (let number of numbers) {
        if (uniqueNumbers.has(number)) {
            return true; // return true if the set contain a duplicate
        }

        uniqueNumbers.add(number) // otherwise add it to the set if it does not contain a duplicate
    }

    return false; // and return false after adding (if it has no duplicate)
}

const numberSets = [
    { setName: 'set1', numbers: [1,2,3,1]},
    { setName: 'set2', numbers: [1,2,3,4]},
    { setName: 'set3', numbers: [1,1,1,3,3,4,3,2,4,2]}
];

for (let numberSet of numberSets) {
    const result = checkForDuplicates(numberSet.numbers);
    console.log(`The result for this number set ${numberSet.setName} is: ${result}`);
}

/**
 * Time complexity O(n)
 * Space complexity O(n)
 */
