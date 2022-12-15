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
		<h1>IP</h1> 
			
			IP is a shortform for Internet Protocol.<br><br>

			IP is the the protocol used for communicating data across a packet-switched network used in most publicly accessible networks today. Connections that mobile devices make to GPRS, 3G and similar networks are made using IP.
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