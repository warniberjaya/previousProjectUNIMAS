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
	<article>
		<br>
		<h1>Mobile Terms Glossary</h1>
		<h5>0-9</h5>
		<a href="g.3.5mmheadphonejack.php">3.5mm headphone jack</a>

		<h5>A</h5>
		<a href="g.airplanemode.php">Airplane Mode</a>

		<h5>B</h5>
		<a href="g.batterycharging.php">Battery Charging</a>

		<h5>C</h5>
		<a href="g.calculator.php">Calculator</a>

		<h5>I</h5>
		<a href="g.imei.php">IMEI(International Mobile Equipment Identity)</a><br><br>
		<a href="g.ip.php">IP(Internet Protocol)</a>

		<h5>N</h5>
		<a href="g.networkcoverage.php">Network Coverage</a>
			
	</article>

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