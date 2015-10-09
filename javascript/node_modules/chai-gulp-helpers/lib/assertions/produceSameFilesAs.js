"use strict";

var Q = require("q");

var collectFilesFromStream = require("../utils/collectFilesFromStream");

module.exports = function (chai, utils) {
    var expect = chai.expect;

    return function (expected) {
        var actual = this._obj;

        return Q.all([
            collectFilesFromStream(actual),
            collectFilesFromStream(expected)
        ]).spread(function (actualFiles, expectedFiles) {
            expect(actualFiles).to.have.sameFilesAs(expectedFiles);
        });
    };
};
