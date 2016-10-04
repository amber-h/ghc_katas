var gulp = require('gulp');
var mocha = require('gulp-mocha');
var chai = require("chai");
var chaiGulpHelpers = require("chai-gulp-helpers");
chai.use(chaiGulpHelpers);

gulp.task('default', function () {
    return gulp.src(['src/main/*/*.js','src/test/*/*.spec.js'], {read: false})
	.pipe(mocha({reporter: 'nyan'}));
});

gulp.task('minesweeper', function () {
    return gulp.src(['src/main/year2015/*.js','src/test/year2015/minesweeper.spec.js'], {read: false})
	.pipe(mocha({reporter: 'nyan'}));
});

gulp.task('arrays', function () {
    return gulp.src(['src/main/year2015/*.js','src/test/year2015/sameArrays.spec.js'], {read: false})
	.pipe(mocha({reporter: 'nyan'}));
});

gulp.task('fibonacci', function () {
    return gulp.src(['src/main/year2015/*.js','src/test/year2015/fibonacci.spec.js'], {read: false})
	.pipe(mocha({reporter: 'nyan'}));
});

var taskListing = require('gulp-task-listing');

gulp.task('help', taskListing);
gulp.task('test', ['default']);
