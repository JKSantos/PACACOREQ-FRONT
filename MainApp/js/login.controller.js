app.controller('loginCtrl', function($scope,$http,$location) {
	
	$scope.valid = "";
	$scope.showError = false;
	
	$scope.login = function() {
		
		var loginData = $.param({
	        username: $scope.username,
	        password: $scope.password
	    });
		
		$http({
		    url: "http://localhost:8080/Pacacoreq/login", 
		    method: "post",
		    headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
		    data: loginData
		 })
		.then(function(response) {
			$scope.result = response.data;

			console.log($scope.result.result);

			if($scope.result.result === "success") {
				window.location.href = "app/home.html";
			} else {
				$scope.valid = "has-error";
				$scope.showError = true;
			}
		});
	}

});

