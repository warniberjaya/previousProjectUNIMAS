<?php
	@session_start();
	include "../database/conndb.php";

	if (@$_SESSION['user']) {
		$user = @$_SESSION['user'];

		$sql = mysqli_query($connection, "SELECT * FROM user WHERE username = '$user'") or die(mysqli_error());
		$data = mysqli_fetch_array($sql);
		$result = mysqli_num_rows($sql);
		$usertype = $data['access'];}
		if ($usertype === "user") {
			$userid = $user;
			$sql = mysqli_query($connection, "SELECT * FROM user WHERE username = '$userid'") or die(mysqli_error());
			$data = mysqli_fetch_array($sql);
			$result = mysqli_num_rows($sql);

			@$_SESSION['user'] = $userid;}
?>

<!DOCTYPE html>
<html>
	<body>
		<link rel="stylesheet" type="text/css" href="../css/userdeis.css">
		<?php include 'usernavbar.php'?>
		<p>Welcome <?php echo @$data['firstname']; ?>&nbsp;<?php echo @$data['lastname'];?> </p>

		<article>
			<div class="link">
			<div class="flex-container">
				<div class="board"><a href="apple.php">Learn more</a> <br></div>
					<div class="Samsung"><a href="samsung.php">Learn more</a><br></div>
					<div class="Sony"><a href="sony.php">Learn more</a><br></div>
					<div class="Xiaomi"><a  href="xiaomi.php">Learn more</a><br></div>
					<div class="Oppo"><a href="oppo.php">Learn more</a><br></div>
				</div>
			</div>

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
		</article>

		<footer>
			<P>© Bimbus Shop, December 2020</P>
		</footer>
	</body>
</html>