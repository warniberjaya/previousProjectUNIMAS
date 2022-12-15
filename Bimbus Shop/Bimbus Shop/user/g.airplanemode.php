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
		<h1>Airplane Mode</h1> 
			
			Known also as Flight mode, this mode disables all radio parts of a mobile phone but leaves other functions available. These include music player, organizer and everything that doesn't require the radio transmitters.<br><br>

			This mode is required because most airlines forbid the use of wireless devices during flight. Some airlines do not allow the use of such devices even in Airplane mode.<br><br>

			There is an industry standard icon to signify that airplane mode is on but not all phones use it.<br><br>

			This mode is required for several reasons. Preventing interference with the airplane equipment is the best known one but another reason is that cell towers cannot handle phones moving at high altitudes and speeds.<br><br>
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