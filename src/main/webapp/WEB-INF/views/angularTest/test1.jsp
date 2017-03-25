<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8"/>
    <script>
        var contextPath='${contextPath}'
    </script>
</head>
<body ng-app="testApp" ng-controller="testController" ng-init="test()">

<script src="${contextPath}/statics/js/quote/angular.min.js"></script>
<script src="${contextPath}/statics/js/modules/angularTest/testController.js"></script>
<script src="${contextPath}/statics/js/modules/angularTest/testService.js"></script>
<script>
    var app=angular.module("testApp",['testController'])
</script>
</body>
</html>
