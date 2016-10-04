'use strict';

require('../../main/year2016/pigLatin.js');
var expect = require('chai').expect;

xdescribe("pig latin", function() {

    it("translates a single word beginning with a vowel", function(){
        expect(pigLatin("eat")).to.eql("eatway");
    });

});
