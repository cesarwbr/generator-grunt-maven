(function(App) {
  'use strict';

  angular.module('sample.service', ['ngResource'])
    .factory('Samples', ['$resource',
      function($resource) {
        return $resource('/sample/sample1/:sampleId', {
          sampleId: '@sampleId'
        });

      }
    ]);



})(window.App);
