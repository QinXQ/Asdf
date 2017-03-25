var testService=angular.module("testService",[]);

testService.service("testService",[function () {
    return {
        test:function (execFunc) {
            execFunc();
        }
    }
}]);