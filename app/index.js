var fs = require('fs');
var path = require('path');
var chalk = require('chalk');

var Generator = module.exports = function() {
  var prompts = [];
  var files   = this.expandFiles('**/*', { cwd: this.sourceRoot(), dot: true });
  var ignores = [
    '.git',
    'LICENSE',
    'README.md',
  ];

  this.package = JSON.parse(this.readFileAsString(path.join(__dirname, '../package.json')));

  this.log.writeln('Generating a ' + chalk.cyan('Grunt') + ' project integrated with ' + chalk.cyan('Struts2 + Maven') + '...');

  files.forEach(function(file) {
    if (ignores.indexOf(file) !== -1) {
      return;
    }

    this.copy(file, file);
  }, this);
};

Generator.name = "Grunt with Maven generator";
