<!DOCTYPE html>
<html>
<head>
	<title>Oppo</title>
</head>

<body>
	<header><!--top navigation-->
	<title>HomePage</title>
	<link rel="stylesheet" type="text/css" href="../css/branddeis.css">
	<script src="https://kit.fontawesome.com/a076d05399.js"></script>
	</header>

		
	<?php include 'usernavbar.php'?>
	<article>
		<p class="brand">Oppo Product</p>
	<div class="flex-container2">
			<div class="oppof1s"><p>Oppo F1S</p><a href="cart.php?name=oppo f1s">Buy</a><br></div>
			<div class="oppoa37"><p>Oppo A37</p><a href="cart.php?name=oppo a37">Buy</a><br></div>
	</div>
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
