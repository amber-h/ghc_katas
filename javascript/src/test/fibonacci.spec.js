'use strict';

require('../main/fibonacci.js');
var expect = require('chai').expect;

describe("should solve same arrays", function() {
	it("should return the first five numbers in the fibonacci sequence", function(){
		expect(fibonacci(5)).to.eql([1, 1, 2, 3, 5]);
	});
});