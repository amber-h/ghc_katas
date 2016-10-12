'use strict';

require('../../main/year2016/sumSquareDifference.js');
var expect = require('chai').expect;

describe("sum square difference", function () {

    it("finds sum square difference of 0 numbers", function () {
        expect(sumSquareDifference(0)).to.eql(0);
    });

    it("finds sum square difference of 2 numbers", function () {
        expect(sumSquareDifference(2)).to.eql(4);
    });

    it("finds sum square difference of 10 numbers", function () {
        expect(sumSquareDifference(10)).to.eql(2640);
    });

});
