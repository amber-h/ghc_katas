"use strict";

var buffertools = require("buffertools");

var byRelative = function (a, b) {
    if ( a.relative < b.relative ) {
        return -1;
    }

    if ( a.relative > b.relative ) {
        return 1;
    }

    return 0;
};

var toRelative = function (file) {
    return file.relative;
};

module.exports = function (chai, utils) {
    return function (expected) {
        var actual = this._obj.slice().sort(byRelative);
        expected = expected.slice().sort(byRelative);

        var actualRelativePaths = actual.map(toRelative);
        var expectedRelativePaths = expected.map(toRelative);

        this.assert(
            actualRelativePaths.toString() === expectedRelativePaths.toString(),
            "expected #{this} to contain files #{exp} but got #{act}",
            "expected #{this} to not contain files #{exp} but got #{act}",
            expectedRelativePaths.toString(", "),
            actualRelativePaths.toString(", ")
        );

        for ( var i = 0; i < expected.length; i++ ) {
            this.assert(
                buffertools.equals(actual[i].contents, expected[i].contents),
                "expected file `" + expectedRelativePaths[i] + "` in #{this} to have contents #{exp} but got #{act}",
                "expected file `" + expectedRelativePaths[i] + "` in #{this} to not have contents #{exp} but got #{act}",
                expected[i].contents,
                actual[i].contents
            );
        }
    };
};
