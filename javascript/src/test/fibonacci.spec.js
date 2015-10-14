'use strict';

require('../main/fibonacci.js');
var expect = require('chai').expect;

describe("should solve same arrays", function() {
    it("should return the first three numbers in the fibonacci sequence by default", function(){
        expect(fibonacci()).to.eql([1, 1, 2]);
    });

    xit("should return the first five numbers in the fibonacci sequence", function(){
        expect(fibonacci(5)).to.eql([1, 1, 2, 3, 5]);
    });

    xit("should return the first ten numbers in the fibonacci sequence", function(){
        expect(fibonacci(5)).to.eql([1, 1, 2, 3, 5, 8, 13, 21, 34, 55]);
    });
});