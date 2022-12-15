<?php
	$host		= "localhost";
	$dbusername	= "root";
	$dbpassword	= "";
	$dbname     = "bimbus"; //database yg d pilih dlm mysql

	// Create connection to database
	$connection = mysqli_connect($host, $dbusername, $dbpassword);

	// Select database
	$dbselect = mysqli_select_db($connection,$dbname);
?>