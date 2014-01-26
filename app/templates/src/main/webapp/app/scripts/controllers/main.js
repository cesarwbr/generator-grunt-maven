'use strict';

angular.module('angularApp')
  .controller('MainCtrl', function ($scope, Samples) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
    $scope.samples = Samples.query();
  });
