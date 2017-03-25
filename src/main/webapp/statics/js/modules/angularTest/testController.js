var testController=angular.module("testController",['testService'])

testController.controller("testController",['$scope','testService',function ($scope,testService) {
    $scope.test=function () {
        testService.test(function () {
            console.log("this is test func");
        })
    }
}])