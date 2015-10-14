sameArrays = function(first_array, second_array) {
	if(first_array.length !== second_array.length) return false;
    if(first_array.length === 0 && second_array.length === 0) {
        return first_array[0] === second_array[0];
    } else {
        var matches = true;
        first_array.forEach(function(element, index) {
            if(Array.isArray(element) && Array.isArray(second_array[index])) {
                matches = matches && sameArrays(element, second_array[index]);
            } else {
                matches = matches && (element === second_array[index]);
            }
        });

        return matches;
    }
}