angular.module("app",["ngRoute","app.main","ui.bootstrap","app.component1","app.component2","app.user","app.register","app.pets"]).config(["$locationProvider",function(t){"use strict";t.html5Mode(!1)}]),angular.module("app.component1",["ngRoute","app.component1.templates"]).config(["$routeProvider",function(t){"use strict";t.when("/component-1/dialog-a",{templateUrl:"component-1/dialog-a/dialog-a.html"})}]),angular.module("app.component1.templates",[]).run(["$templateCache",function(t){t.put("component-1/dialog-a/dialog-a.html",'<!DOCTYPE html><html><body><h2>Hello from Dialog A!</h2><img src="main/img/Koala.jpg"></body></html>')}]),angular.module("app.component2",["ngRoute","app.component2.templates"]).config(["$routeProvider",function(t){"use strict";t.when("/component-2/dialog-b",{templateUrl:"component-2/dialog-b/dialog-b.html"})}]),angular.module("app.component2.templates",[]).run(["$templateCache",function(t){t.put("component-2/dialog-b/dialog-b.html","<!DOCTYPE html><html><body><h2>Hello from Dialog B!</h2></body></html>")}]),angular.module("app.main",["ngRoute","app.main.templates"]).config(["$routeProvider",function(t){"use strict";t.when("/",{redirectTo:"/main/welcome"}).when("/main/welcome",{templateUrl:"main/welcome/welcome.html"}).when("/main/login",{templateUrl:"main/login/login.html"}).when("/main/login-failure",{templateUrl:"main/login-failure/login-failure.html"}).when("/main/logout-success",{templateUrl:"main/logout-success/logout-success.html"}).when("/main/register",{templateUrl:"main/register/register.html"}).otherwise({templateUrl:"main/page-not-found/page-not-found.html"})}]),angular.module("app.main").controller("AppCntl",["$scope","AppRestService",function(t,e){"use strict";t.message="Hello!",t.isUserAnonymous=!0,t.init=function(){e.getCurrentUsersRole().then(function(e){t.isUserAnonymous=e.data},function(){alert("Failed to load current users role!")})},angular.element.ready(t.init())}]),angular.module("app.main").factory("AppRestService",["$http",function(t){"use strict";return{getCurrentUsersRole:function(){return t.get("/web/currentUsersRole/")}}}]),angular.module("app.main.templates",[]).run(["$templateCache",function(t){t.put("main/login/login.html",'<html><head><title>Login Page</title></head><body><div id="login-box"><h2>Podaj email oraz haslo aby sie zalogowac</h2><form name="loginForm" action="/web/j_spring_security_check" method="POST"><table><tr><td>User:</td><td><input type="text" name="username" value="" required=""></td></tr><tr><td>Password:</td><td><input type="password" name="password" required=""></td></tr><tr><td colspan="2"><input class="btn btn-success" name="submit" type="submit" value="Log in"></td></tr></table></form></div></body></html>'),t.put("main/login-failure/login-failure.html",'<!DOCTYPE html><html><body><div class="row"><div class="col-md-12"><h2>Login failure!</h2><p>Wrong email or password.</p></div></div></body></html>'),t.put("main/logout-success/logout-success.html",'<!DOCTYPE html><html><body><div class="row"><div class="col-md-12"><h2>Logout success!</h2><p>If You want to log in again plese click <a href="#/main/login">this</a> .</p></div></div></body></html>'),t.put("main/page-not-found/page-not-found.html",'<!DOCTYPE html><html><body><div class="row"><div class="col-md-12"><h2>Page Not Found!</h2><p>The page you trying to reach could not be found.</p></div></div></body></html>'),t.put("main/welcome/welcome.html",'<!DOCTYPE html><html><body><div class="row"><div class="col-md-12"><h2>Witamy w klinice qVETa!</h2><p><a href="#/pets/pets">Sprawdz liste swoich zwierzat.</a></p><p><a href="/web/j_spring_security_logout">Wyloguj sie</a></p></div></div></body></html>')}]),angular.module("app.pets",["ngRoute","app.main","app.pets.templates","ui.bootstrap"]).config(["$routeProvider",function(t){"use strict";t.when("/pets/pets",{templateUrl:"pets/pets/pets.html",controller:"PetsController"})}]),angular.module("app.pets").controller("PetsController",["$scope","PetsRestService","$modal",function(t,e,a){"use strict";t.pets=[],t.getPets=function(){e.getPets().then(function(e){angular.copy(e.data,t.pets)},function(){alert("Failed to load pets list!")})},t.getCurrentUsersRole=function(){e.getCurrentUsersRole().then(function(e){angular.copy(e.data,t.pets)},function(){alert("Failed to delete pet!")})},t.editPet=function(t){var e=a.open({templateUrl:"pets/editPet/edit-pet-modal.html",controller:"EditPetModalController",size:"lg",resolve:{pet:function(){return t}}});e.result.then(function(){})},t.addPet=function(e){var r=a.open({templateUrl:"pets/addPet/add-pet-modal.html",controller:"AddPetModalController",size:"lg"});r.result.then(function(e){angular.copy(e,t.pets)})}}]),angular.module("app.pets").factory("PetsRestService",["$http",function(t){"use strict";return{getPets:function(){return t.get("/web/getPets/")},deletePet:function(e){return t["delete"]("/web/pet/"+e)},savePet:function(e){return t.post("/web/savePet/",e)},updatePet:function(e){return t.post("/web/editPet/",e)},getTypes:function(){return t.get("/web/getPetTypes/")}}}]),angular.module("app.pets").controller("EditPetModalController",["$scope","PetsRestService","$modalInstance","pet",function(t,e,a,r){"use strict";t.pet=r,t.petType=r.type,t.petTypeHolder=r.type,t.petBornDate=new Date(r.bornDate),t.petBornDateHolder=new Date(r.bornDate),t.petTypes=[],t.saveEditedPet=function(){t.pet.type=t.petType,t.pet.bornDate=t.petBornDate,e.updatePet(t.pet).then(function(t){a.close(t.data)},function(){t.pet.type=t.petTypeHolder,t.pet.bornDate=t.petBornDateHolder,alert("Failed to complete editing pet!")})},t.init=function(){e.getTypes().then(function(e){angular.copy(e.data,t.petTypes)},function(){alert("Failed to load pet types!")})},angular.element().ready(t.init())}]),angular.module("app.pets").controller("AddPetModalController",["$scope","PetsRestService","$modalInstance",function(t,e,a){"use strict";t.petTypes=[],t.newPet={name:"",type:"",bornDate:""},t.addPet=function(){e.savePet(t.newPet).then(function(t){a.close(t.data)},function(){alert("Failed to add a new pet!")})},t.init=function(){e.getTypes().then(function(e){angular.copy(e.data,t.petTypes)},function(){alert("Failed to load pet types!")})},angular.element().ready(t.init())}]),angular.module("app.pets.templates",[]).run(["$templateCache",function(t){t.put("pets/pets/pets.html",'<!DOCTYPE html><html><head><title>Pets</title></head><body><h2>Lista Twoich zwierzakow</h2><div align="center"><button ng-click="getPets()" class="btn btn-success">Pokaz moje zwierzaki</button> <button ng-click="addPet()" class="btn btn-info">Dodaj zwierzaka</button><br><br><table id="petList" border="1"><th>Id</th><th>Name</th><th>Type</th><th>Born date</th><th>Delete</th><th>Edit</th><tr ng-repeat="pet in pets | orderBy:\'name\'"><td>{{$index + 1}}</td><td>{{ pet.name }}</td><td>{{ pet.type }}</td><td>{{ pet.bornDate | date: "MM-dd-yyyy"}}</td><td><button ng-click="deletePet(pet.id)" class="btn btn-danger btn-xs">Usun zwierzaka</button></td><td><button ng-click="editPet(pet)" class="btn btn-warning btn-xs">Edytuj zwierzaka</button></td></tr></table></div></body></html>')}]),angular.module("app.register",["ngRoute","app.main","app.register.templates","ui.bootstrap"]).config(["$routeProvider",function(t){"use strict";t.when("/register/register",{templateUrl:"register/register/register.html",controller:"RegisterController"})}]),angular.module("app.register").controller("RegisterController",["$scope","RegisterRestService",function(t,e){"use strict";t.registerData={id:"",firstName:"",lastName:"",email:"",password:""},t.reEmail="",t.rePassword="",t.validEmail=function(){return t.registerData.email!==t.reEmail},t.validPassword=function(){return t.registerData.password!==t.rePassword},t.register=function(){e.register(t.registerData).then(function(e){t.registerData="",alert("Register complete. Now You can log in")},function(){alert("Faiure!!!")})}}]),angular.module("app.register").factory("RegisterRestService",["$http",function(t){"use strict";return{register:function(e){var a={id:"",firstName:e.firstName,lastName:e.lastName,email:e.email,password:e.password};return t.post("/web/register/",a)}}}]),angular.module("app.register.templates",[]).run(["$templateCache",function(t){t.put("register/register/register.html",'<!DOCTYPE html><html><head><title>Register Page</title></head><body><div><h2>Wypelnij ponizsze pola aby sie zarejestrowac</h2><form name="registerData"><table><tr><td>First name:</td><td><input type="text" ng-model="registerData.firstName" required=""></td></tr><tr><td>Last name:</td><td><input type="text" ng-model="registerData.lastName" required=""></td></tr><tr><td>Email:</td><td><input type="text" ng-model="registerData.email" required=""></td></tr><tr><td>Re-email:</td><td><input type="text" ng-model="reEmail" required=""> <span ng-show="validEmail()">Emaile musza sie zgadzac!</span></td></tr><tr><td>Password:</td><td><input type="password" ng-model="registerData.password" required=""></td></tr><tr><td>Re-password:</td><td><input type="password" ng-model="rePassword" required=""> <span ng-show="validPassword()">Hasla musza sie zgadzac!</span></td></tr><tr><td><button ng-disabled="registerData.$invalid || validEmail() || validPassword()" ng-click="register()" class="btn btn-success">Rejestruj</button></td><td></td></tr></table></form></div></body></html>')}]),angular.module("app.user",["ngRoute","app.main","app.user.templates","ui.bootstrap"]).config(["$routeProvider",function(t){"use strict";t.when("/user/user",{templateUrl:"user/user/user.html",controller:"UserController"})}]),angular.module("app.user").controller("UserController",["$scope","UserRestService",function(t,e){"use strict";t.user=[],t.search=function(){e.search().then(function(e){angular.copy(e.data,t.user)},function(){alert("Faiure!!!")})}}]),angular.module("app.user").factory("UserRestService",["$http",function(t){"use strict";return{search:function(){return t.get("/web/rests")}}}]),angular.module("app.user.templates",[]).run(["$templateCache",function(t){t.put("user/user/user.html",'<!DOCTYPE html><html><body><button ng-click="search()">Szukaj</button><table id="userList" border="1"><tr ng-repeat="u in user"><td>{{ u.id }}</td><td>{{ u.firstName }}</td><td>{{ u.lastName }}</td><td>{{ u.email }}</td><td>{{ u.password }}</td></tr></table></body></html>')}]);