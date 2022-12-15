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
		
		<!--Network Coverage explanation-->
		<h1>Network Coverage</h1> 			
		The geographical area covered by the network of a service provider. Within this area, the phone will be able to complete a call using the carrier's network or a partner network.
		
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