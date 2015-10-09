"use strict";

module.exports = function (chai, utils) {
    var Assertion = chai.Assertion;
    var sameFilesAs = require("./lib/assertions/sameFilesAs")(chai, utils);
    var produceSameFilesAs = require("./lib/assertions/produceSameFilesAs")(chai, utils);

    Assertion.addProperty("produce", function () {
        utils.flag(this, "sameFilesAs.produce", true);
    });

    Assertion.addMethod("sameFilesAs", function (actual) {
        if ( utils.flag(this, "sameFilesAs.produce") ) {
            return produceSameFilesAs.apply(this, arguments);
        }

        return sameFilesAs.apply(this, arguments);
    });
};
