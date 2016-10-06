'use strict';

require('../../main/year2016/fizzbuzz.js');
var expect = require('chai').expect;

describe("fizzbuzz", function () {

    it("calculates sequence of numbers up to input value", function () {
        expect(fizzbuzzUpTo(2)).to.eql(["1", "2"]);
    });

    it("calculates sequence of numbers up to 3, substituting Fizz for 3", function () {
        expect(fizzbuzzUpTo(3)).to.eql(["1", "2", "Fizz"]);
    });

    it("calculates sequence of numbers up to 5, substituting Buzz for 5", function () {
        expect(fizzbuzzUpTo(5)).to.eql(["1", "2", "Fizz", "4", "Buzz"]);
    });

    it("calculates sequence of numbers up to 15, substituting FizzBuzz for 15", function () {
        expect(fizzbuzzUpTo(15)).to.eql([
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
            "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
        ]);
    });

});