fibonacci = function(numberOfSequence) {

    var sequence = [];

    var index = 1;
    while (index <= numberOfSequence) {
        sequence.push(calculateNthNumber(index));
        index++;
    }
    return sequence;
};

calculateNthNumber = function(nthNumber) {

    if (nthNumber === 1 || nthNumber == 2) {
        return 1;
    }

    var firstFibo = 1, secondFibo = 1, sum = 0;
    for (var i = 3; i <= nthNumber; i++) {
        sum = firstFibo + secondFibo;
        firstFibo = secondFibo;
        secondFibo = sum;
    }

    return sum;
};

