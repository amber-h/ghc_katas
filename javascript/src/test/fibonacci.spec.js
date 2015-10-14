'use strict';

require('../main/fibonacci.js');
var expect = require('chai').expect;

describe("should solve same arrays", function() {
	it("should return the first five numbers in the fibonacci sequence", function(){
		expect(fibonacci(5)).to.eql([1, 1, 2, 3, 5]);
	});
});

describe(".calculateNthNumber", function() {
		it("should return 1 for first number", function(){
				expect(calculateNthNumber(1)).to.eql(1);
		});

		it("should return 1 for second number", function(){
				expect(calculateNthNumber(2)).to.eql(1);
		});

		it("should return 2 for third number", function(){
				expect(calculateNthNumber(3)).to.eql(2);
		});

		it("should return 610 for fifteenth number", function(){
				expect(calculateNthNumber(15)).to.eql(610);
		});
});
