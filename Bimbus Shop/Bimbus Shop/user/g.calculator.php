<!DOCTYPE html>
<html>
<head>
	<title>Bimbus Shop Glossary</title>
</head>
<body>
	<header><!--top navigation-->
		<title>HomePage</title>
		<link rel="stylesheet" type="text/css" href="../css/branddeis.css">
		<script src="https://kit.fontawesome.com/a076d05399.js"></script>
	</header>
	
	<?php include 'usernavbar.php'?>
	
	<h1>Calculator</h1> 

	<!--Calculator explanation-->
	The basic functions (addition, subtraction, multiplication, division) are included in all calculators but some offer more advanced options such as square root or trigonomic functions.<br><br>

	Some calculators have the option to convert currency and can calculate mortgage payments.

	<script>
		window.onscroll = function() {myFunction()};

		var navitop = document.getElementById("navitop");
		var sticky = navitop.offsetTop;

		function myFunction() {
  			if (window.pageYOffset >= sticky) {
    		navitop.classList.add("sticky")
  		} else {
    		navitop.classList.remove("sticky");
  		}
		}
</script>
</body>
</html>