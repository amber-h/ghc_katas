'use strict';

require('../main/sameArrays.js');
var expect = require('chai').expect;

xdescribe("should solve same arrays", function() {
	it("should return true for two empty arrays", function(){
		expect(sameArrays([], [])).toBeTruthy();
	});
	
	it("should return false for two arrays with different numbers", function(){
		expect(sameArrays([2], [5])).toBeFalsy();
	});
});