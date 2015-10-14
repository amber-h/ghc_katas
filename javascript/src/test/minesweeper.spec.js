'use strict';

require('../main/minesweeper.js');
var expect = require('chai').expect;

xdescribe("should solve minesweeper", function() {
    it("should return string with a mine", function(){
        expect(minesweeper("*")).to.eql("*");
    });

    xit("should return string with mine and one", function(){
        expect(minesweeper("*.")).to.eql("*1");
    });

    xit("should return string with one and zero", function(){
        expect(minesweeper("*..")).to.eql("*10");
    });

    xit("should return string with one and zero", function(){
        expect(minesweeper("*...*")).to.eql("*101*");
    });

    xit("should return string with two lines and two mines", function(){
        expect(minesweeper("*..\n..*")).to.eql("*11\n12*");
    });
});