<?php
	@session_start();
	include "database/conndb.php";

	$firstname = @$_POST['firstname'];
	$lastname = @$_POST['lastname'];
	$username = @$_POST['username'];
	$nophone = @$_POST['nophone'];
	$email = @$_POST['email'];
	$password = @$_POST['password'];
	$gender = @$_POST['gender'];
	$state = @$_POST['state'];
	$access = @$_POST['access'];

	$sql = "INSERT INTO user (firstname, lastname, username, nophone, email, password, gender, state, access) VALUES ('$firstname','$lastname','$username','$nophone','$email','$password','$gender','$state', '$access')";

	$query = mysqli_query($connection, $sql);
	if (!$query) {
		var_dump($sql);
		die('Could not enter data: ' . mysqli_error($connection));
	} else {
		header("location: index.php");
	}
	
?>