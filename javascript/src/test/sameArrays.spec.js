'use strict';

require('../main/sameArrays.js');
var expect = require('chai').expect;

xdescribe("should solve same arrays", function() {
    it("should return true for two empty arrays", function(){
        expect(sameArrays([], [])).to.be.true;
    });

    it("should return false for two arrays with different numbers", function(){
        expect(sameArrays([2], [5])).to.be.false;
    });

    it("should return false for two arrays with different amounts", function(){
        expect(sameArrays([2], [2, 6])).to.be.false;
    });

    it("should return false for two arrays with multiple different numbers", function(){
        expect(sameArrays([2, 4], [2, 5])).to.be.false;
    });

    it("should return true for two nested arrays with the same numbers", function(){
        expect(sameArrays([[3], [4]], [[3], [4]])).to.be.true;
    });

    it("should return false for two nested arrays with multiple different numbers", function(){
        expect(sameArrays([[2], [4]], [[2], [5]])).to.be.false;
    });

    it("should not return true or false based on just the last element in the arrays", function(){
        expect(sameArrays([[2], [4]], [[2], [5]])).to.be.false;
    });
});