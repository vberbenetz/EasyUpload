/* js/fileAppControllers.js */

function fileCtrl ($scope) {
    $scope.partialDownloadLink = 'http://localhost:8080/download?filename=';
    $scope.filename = '';

    $scope.uploadFile = function() {
        $scope.processDropzone();
    };

    $scope.reset = function() {
        $scope.resetDropzone();
    };
}

angular.module('fileApp').controller('fileCtrl', fileCtrl);