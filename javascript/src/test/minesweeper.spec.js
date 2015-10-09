'use strict';

require('../main/minesweeper.js');
var expect = require('chai').expect;

xdescribe("should solve minesweeper", function() {
	it("should return string with mine and one", function(){
		expect(minesweeper("*.")).toBe("*1");
	});
	
	it("should return string with one and zero", function(){
		expect(minesweeper("*..")).toBe("*10");
	});
	
	it("should return string with two lines and two mines", function(){
		expect(minesweeper("*..\n..*")).toBe("*11\n12*");
	});
});