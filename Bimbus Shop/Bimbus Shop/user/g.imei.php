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
		<h1>EMEI</h1> 
			
			EMEI is a shortform for International Mobile Eqipment Identity.<br><br>

			IMEI is a unique 15-digit serial number that uniquely identifies a GSM or UMTS mobile phone. It consists of four parts and provides information, such as the manufacturer, to the mobile network. It is usually printed on the device under the battery.<br><br>

			IMEI can be used to "ban" a stolen phone, making it hard to use by the thief with a new SIM card.
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