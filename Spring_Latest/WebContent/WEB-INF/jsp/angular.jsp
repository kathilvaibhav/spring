<!doctype html>
<html ng-app>
	<head>
		<title>Spring MVC + AngularJS Demo</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    	<script>
    	function Hello($scope, $http) {
    	    $http.get('http://localhost:9090/Spring_Latest/springcontent').
    	        success(function(data) {
    	            $scope.user = data;
    	        });
    	}
    	</script>
	</head>
	<body>
		<div ng-controller="Hello">
			<h2>Spring MVC + AngularJS Demo</h2>
			<p>EMail Id : {{user.emailId}}</p>
			<p>User Name : {{user.userName}}</p>
		</div>
		<a href="http://localhost:9090/Spring_Latest/index">example</a> 
	</body>
</html>