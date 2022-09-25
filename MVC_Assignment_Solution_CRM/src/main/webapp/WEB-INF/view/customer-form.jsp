<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<%--
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.1/css/bootstrap-grid.min.css"
	integrity="sha512-95rjxgceX8l8NTRpxqRWwYWAl5jhwmGHGtmwgaA5++tITaixvU/RipgbZIBwp/912s9AE5AZGs9EM3gSBx6OuQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />


<link rel="stylesheet" 
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

--%>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Customer Form</title>
</head>
<body>
	<div class="container p-5 bg-info">
		<h3 class="bg-info text-white">Customer Relationship Management</h3>
	</div>

	<div class="container">
		<hr>
		<br>
		<form action="/MVC_Assignment_Solution_CRM/customer/save"
			method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Customer.id}" />

			<div class="form-inline">
				<label for="FirstName" class="form-label col-md-3 pb-4">First Name : </label>
				<input type="text" name="firstName" value="${Customer.firstName}"
					class="form-control mb-4 col-4" placeholder="First Name">
			</div>

			<div class="form-inline">
				<label for="LastName" class="form-label col-md-3 pb-4">Last Name : </label>
				<input type="text" name="lastName" value="${Customer.lastName}"
					class="form-control mb-4 col-4" placeholder="Last Name">
			</div>

			<div class="form-inline">
				<label for="Email" class="form-label col-md-3 pb-4 pl-5">Email : </label>
				<input type="text" name="email" value="${Customer.email}"
					class="form-control mb-4 col-4" placeholder="Email">
			</div>
			<br>
			<button type="submit" class="btn btn-info col-sm-2">Save</button>
		</form>
		<br>
		<a href="/MVC_Assignment_Solution_CRM/customer/list">Back
			to List</a>

	</div>

</body>
</html>