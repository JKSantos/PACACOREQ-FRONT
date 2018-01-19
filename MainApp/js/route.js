app.config(function($routeProvider) {
    $routeProvider
    .when("/home", {
        templateUrl : "home-view/home-content.html"
    })
    .when("/profile", {
        templateUrl : "profile-view/profile-view.html"
    })
    .when("/create_request", {
        templateUrl : "create-request/create-request-content.html"
    })
});