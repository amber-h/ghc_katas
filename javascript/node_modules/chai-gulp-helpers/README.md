# chai-gulp-helpers

[![Build Status](https://travis-ci.org/jussi-kalliokoski/chai-gulp-helpers.svg?branch=master)](https://travis-ci.org/jussi-kalliokoski/chai-gulp-helpers)
[![Coverage Status](https://img.shields.io/coveralls/jussi-kalliokoski/chai-gulp-helpers.svg)](https://coveralls.io/r/jussi-kalliokoski/chai-gulp-helpers)

This is a [chai](http://chaijs.com/) plugin for testing [gulp](http://gulpjs.com/) plugins.

## Installation

You can install chai-gulp-helpers via npm:

```bash
$ npm install --save-dev chai-gulp-helpers
```

## Usage

Enable the plugin:

```javascript
var chai = require("chai");
var chaiGulpHelpers = require("chai-gulp-helpers");
chai.use(chaiGulpHelpers);
```

This gives you two kinds of syntax:

```javascript
// Verify that two arrays of Vinyl files are equal (have the same files with same content):
expect(fileList1).to.be.sameFilesAs(fileList2);
// Verify that two streams return the equal list of Vinyl files (returns a promise)
expect(stream1).to.produce.sameFilesAs(stream2);
```

## Examples

```javascript
describe("my gulp plugin", function () {
    it("should do something", function () {
        var expected = gulp.src("./expected/**/*", { base: "./expected/" });
        var actual = gulp.src("./fixtures/**/*", { base: "./fixtures/" })
            .pipe(myGulpPlugin());
        return expect(actual).to.produce.sameFilesAs(expected);
    });
});
```

This test will pass if the files in `fixtures` folder processed by your plugin match those in the `expected` folder.
