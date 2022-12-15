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
		<h1>Battery charging</h1> 
			
			The circuitry to recharge the batteries in a portable product such a mobile phone plays an important part in determining the battery longevity and the practicalities of using the product on a daily basis.<br><br>

			The charging protocol (how much voltage or current for how long, and what to do when charging is complete) depends on the size and type of the battery being charged.<br><br>

			The modern battery chargers adapt the charging parameters dynamically based on the level of charging the battery has reached. An empty battery can be charged faster without any safety risk. This is why most benchmarks for charging speed (ours included) quote the battery charging level reached after a 30-minute charging session on an empty battery.<br><br>

			With basic chargers outputting 5V/1A equalling to 5W of power, anything faster than that is considered quick or fast charging.<br><br>

			<h4>Quick charging</h4>
			Quick charging field is still very much fragmented and almost every manufacturer has its own solution - most of the time, including proprietary tech.<br><br>

			The most common solution is the 5V/2A charging which delivers 10W of power and pretty much every phone other there supports this charging rate. The real quick charging starts from there and up.<br><br>

			Smartphones utilizing Qualcomm chipsets can make use of Qualcomm's QuickCharge protocol. It's been through a few generations already with the latest one being QuickCharge 4+. It is backward compatible with the previous generations and the most common implementations peak at 18W of power output. Motorola is using this standard for its phones even though they are marketing it as TurboPower and QuickCharge is not mentioned anywhere.<br><br>

			Similarly to Qualcomm, MediaTek has also introduced its own charging standard called Pump Express, which is supported by phones using the company's chipsets and it requires its own set of proprietary chargers. The latest generation of the standard is PumpExpress 3.0 and it utilizes a USB-C connector for the charging cable. Pump Express+ 2.0 is available as well as a more budget solution and it allows the use of a microUSB connector.<br><br>

			USB Power Delivery is another quick charging standard and this one is not limited to a particular hardware manufacturer. It doesn't require proprietary hardware though it does require the use of USB-C to USB-C cable. The maximum power output is 100W because there are even laptops that rely on this standard for charging. The current implementations in smartphones however only go as high as 18W of power output.<br><br>

			Oppo, Vivo and OnePlus share some of their intellectual property and R&D and as a result, their phones use similar quick charging solutions. Oppo calls it VOOC Flash charge, Vivo calls it just Fast battery charging, while OnePlus used to call theirs Dash charge (now renamed to just OnePlus Fast Charge for legal reasons). All three versions output 18-20W of power.<br><br>

			But since the three manufacturers are spearheading the quick charge revolution, in 2018 they came up with even faster implementations so they introduced new names as well making things a bit more confusing for the inexperienced users. Oppo's Super VOOC Flash charge can output 50W of power. Vivo's Dual-Engine Fast Charge can output 22.5W of power. And finally, OnePlus's Warp charge can deliver up to 30W.<br><br>

			Huawei also has a proprietary fast battery charging solution in their top-tier smartphones called SuperCharge, which is capable of outputting 40W of power but their more common implementations provide up to 22.5W of power.<br><br>

			Meizu's mCharge solution is proprietary as well and is already available in a few of their higher models. It can deliver up to 24W of power. Meizu has also demoed their future Super mCharge solution which can deliver up to 55W of power but it's yet to release a smartphone integrating it as of the time of writing this.<br><br>

			<h4>Wireless charging</h4>
			Wireless (or inductive) charging uses an electromagnetic field to transfer energy between two objects through electromagnetic induction. Induction is achieved by placing a device which is equipped with the induction coil directly onto a dedicated charging station (or charging pad).<br><br>

			While there used to be at least a few competing wireless charging standards in the past, nowadays the entire mobile industry has moved to using Qi (pronounced "chee").<br><br>

			Much like with the regular wired charging - wireless charging can be performed at different rates. The nominal power output of a Qi charging pad is 5W but faster chargers can already pump out up to 15W of power to phones which support it.<br><br>

			Regardless of the maximum power output supported by the charging pad and the smartphone, the Qi standard demands that all the hardware is backward compatible so regardless the supported revision - any Qi pad is compatible with all Qi-enabled devices.

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