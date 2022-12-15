<!DOCTYPE html>
<html>
<head>
	<title>Mi Store Apple Phone</title>
</head>
<body>
<header><!--top navigation-->
		<title>HomePage</title>
		<link rel="stylesheet" type="text/css" href="../css/branddeis.css">
		<script src="https://kit.fontawesome.com/a076d05399.js"></script>
	</header>
	
	<?php include 'usernavbar.php'?>
	<article>
			<p class="brand">Apple Product</p>
	<div class="flex-container2">
			<div class="iphone11"><p>iPhone 11</p><a href="cart.php?name=iphone 11">Buy</a><br></div>
			<div class="iphone11promax"><p>iPhone 11 Pro Max</p><a href="cart.php?name=iphone 11 pro max"><img src="">Buy</a><br></div>
			<div class="iphone10"><p>iPhone 10</p><a href="cart.php?name=iphone10"><img src="">Buy</a><br></div>
			<div class="iphone8plus"><p>iPhone 8 Plus</p><a  href="cart.php?name=iphone 8 plus"><img src="">Buy</a><br></div>
			<div class="iphone7plus"><p>iPhone 7 Plus</p><a href="cart.php?name=iphone 7 plus"><img src="">Buy</a><br></div>
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
