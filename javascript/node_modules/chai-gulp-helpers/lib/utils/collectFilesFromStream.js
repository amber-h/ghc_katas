"use strict";

var Q = require("q");

module.exports = function (stream) {
    var deferred = Q.defer();
    var result = [];

    stream.on("data", function (file) {
        result.push(file);
    });

    stream.once("end", function () {
        deferred.resolve(result);
    });

    stream.once("error", function (error) {
        deferred.reject(error);
    });

    return deferred.promise;
};
