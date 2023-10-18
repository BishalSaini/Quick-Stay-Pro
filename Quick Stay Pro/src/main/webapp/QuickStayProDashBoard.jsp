<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quick Stay Pro - Hotel Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
	integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
/* Custom styles for the navigation bar */
.navbar {
	background-color: #f7f7f7;
	color: #fff;
	padding: 10px 0;
	box-shadow: 2px 2px 5px 2px rgba(0, 0, 0, 0.5);
	position: sticky;
	top: 0px;
	z-index: 10;
}

.navbar-container {
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.logo {
	height: 80px;
	width: 100px;
}

.logo img {
	height: 80px;
	width: 120px;
}

.nav-links {
	list-style: none;
	padding: 0;
}

.nav-links li {
	display: inline;
	margin-right: 20px;
}

.nav-links a {
	text-decoration: none;
	color: #000000;
}

/* Custom styles for the hero section */
.hero {
	background-image: url('hotel-image.jpeg');
	background-size: cover; /* Cover the entire viewport */
	background-position: center;
	background-attachment: fixed;
	color: #fff;
	text-align: center;
	height: 450px;
	width: 100%;
}

.hero h1 {
	position: relative;
	top: 200px;
	font-size: 36px;
	color: #ffffff;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);
}

.hero p {
	font-size: 18px;
	color: #ffffff;
	position: relative;
	top: 200px;
	text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.8);
}

.hero h1, .hero p {
	opacity: 0; /* Initially, set the elements to be transparent */
	transition: opacity 3s ease;
	/* Apply a 1-second ease-in-out transition */
}

/* User type selection styles */
.user-type-selection {
	text-align: center;
}

.user-type-selection h2 {
	font-size: 24px;
	margin-bottom: 20px;
}

.user-type-selection .user-type-buttons {
	display: flex;
	justify-content: center;
	gap: 20px;
}

.user-type-selection .user-type-button {
	background-color: #ff3f80;
	color: #fff;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	font-size: 20px;
	cursor: pointer;
	transition: background-color 0.3s;
}

.user-type-selection .user-type-button:hover {
	background-color: #ff005e;
}

/* Additional styling for testimonials */
.testimonials {
	text-align: center;
}

.testimonial {
	margin: 20px;
	text-align: center;
}

.testimonial img {
	border-radius: 50%;
	width: 80px;
	height: 80px;
}

/* Footer styles */
.footer {
	background-color: #333;
	color: #fff;
	padding: 20px 0;
	text-align: center;
}

.footer a {
	color: #fff;
	text-decoration: none;
	margin: 0 15px;
}
</style>
</head>
<body>
	<form action="QSP" method="post">
		<div class="navbar">
			<div class="container navbar-container">
				<div class="logo">
					<img alt="Quick Stay Pro" src="images/qsplogo.png">
				</div>
				<ul class="nav-links">
					<li><a href="#">Home</a></li>
					<li><a href="#">Rooms</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Contact Us</a></li>
				</ul>
			</div>
		</div>

		<div class="hero">
			<h1>Welcome to Quick Stay Pro</h1>
			<p>Your Premier Hotel Management Solution</p>
		</div>

		<div class="container mt-5">
			<div class="user-type-selection">
				<h2>Choose Your User Type to Get Started</h2>
				<div class="user-type-buttons">

					<button class="user-type-button" name="admin">Admin</button>
	</form>

	<button class="user-type-button" name="manager">Manager</button>
	</form>

	<button class="user-type-button" name="owner">Owner</button>
	</form>

	<button class="user-type-button" name="user">User</button>
	</form>
	</div>
	</div>



	<section>
		<div class="row d-flex justify-content-center">
			<div class="col-md-10 col-xl-8 text-center">
				<h3 class="mb-4" style="margin-top: 100px">Reviews by
					Celebrities</h3>
				<p class="mb-4 pb-2 mb-md-5 pb-md-0">Quick Stay Pro is
					recognized by various famous actors, sportmans. They've shared
					their experiences when they stayed in our hotels.</p>
			</div>
		</div>

		<div class="row text-center">
			<div class="col-md-4 mb-5 mb-md-0">
				<div class="d-flex justify-content-center mb-4">
					<img
						src="https://4.bp.blogspot.com/_TiCO8op_NpI/S814n7dtBEI/AAAAAAAAFyk/tyzru_0CYRQ/s1600/Ranbir+Kapoor++is+fast+becoming+the+most+flamboyant+style+icon%21.jpg"
						class="rounded-circle shadow-1-strong" width="150" height="150" />
				</div>
				<h5 class="mb-3">Ranbir Kapoor</h5>
				<h6 class="text-primary mb-3">Actor</h6>
				<ul class="list-unstyled d-flex justify-content-center mb-0">
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star-half-alt fa-sm text-warning"></i></li>
				</ul>
				<p class="px-xl-3">
					<i class="fas fa-quote-left pe-2"></i>I recently had the pleasure
					of staying at the Sunrise Serenity Hotel, and I can't stop raving
					about it. From the moment I walked into the lobby, I was greeted
					with warm smiles and efficient service.The hotel's restaurant
					offered a delectable array of dishes, and the staff went out of
					their way to accommodate our dietary preferences. I can't wait to
					return to this tranquil oasis!"
				</p>

			</div>
			<div class="col-md-4 mb-5 mb-md-0">
				<div class="d-flex justify-content-center mb-4">
					<img
						src="https://cdn.shopify.com/s/files/1/0576/3271/8988/files/image_2022_08_08T20_28_28_903Z_480x480.png?v=1660021205"
						class="rounded-circle shadow-1-strong" width="150" height="150" />
				</div>
				<h5 class="mb-3">Deepika Padukone</h5>
				<h6 class="text-primary mb-3">Actress</h6>
				<ul class="list-unstyled d-flex justify-content-center mb-0">
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
				</ul>
				<p class="px-xl-3">
					<i class="fas fa-quote-left pe-2"></i>My stay at the Ocean Breeze
					Resort was absolutely fantastic. From the moment I arrived, I felt
					like I was in a tropical paradise. The room had a gorgeous view of
					the ocean, and the sound of the waves crashing was so soothing. The
					staff was incredibly friendly and went out of their way to make my
					stay comfortable.
				</p>
			</div>
			<div class="col-md-4 mb-0">
				<div class="d-flex justify-content-center mb-4">
					<img
						src="https://i.pinimg.com/736x/ad/14/54/ad1454bd29d749cff55814584bceaca8.jpg"
						class="rounded-circle shadow-1-strong" width="150" height="150" />
				</div>
				<h5 class="mb-3">Virat Kohli</h5>
				<h6 class="text-primary mb-3">Cricketer</h6>
				<ul class="list-unstyled d-flex justify-content-center mb-0">
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="fas fa-star fa-sm text-warning"></i></li>
					<li><i class="far fa-star fa-sm text-warning"></i></li>
				</ul>
				<p class="px-xl-3">
					<i class="fas fa-quote-left pe-2"></i>"I can't say enough good
					things about my recent stay at the Royal Haven Hotel. The level of
					service and attention to detail here is truly exceptional. The room
					was luxurious, with a comfortable bed and a stunning city view. The
					hotel's restaurant offered a fine dining experience, and the staff
					provided top-notch recommendations for local attractions.
				</p>

			</div>
		</div>
	</section>

	</div>

	<div class="footer">
		<div class="container">
			<p>&copy; 2023 Quick Stay Pro. All rights reserved.</p>
			<a href="#">Privacy Policy</a> <a href="#">Terms of Service</a> <a
				href="#">Contact Us</a>
		</div>
	</div>
	</form>

	<script>
		// Wait for the document to be fully loaded
		window.addEventListener("load", function() {
			// Select the elements you want to fade in
			const heroHeading = document.querySelector('.hero h1');
			const heroParagraph = document.querySelector('.hero p');

			// Add a small delay (e.g., 500 milliseconds) before fading in
			setTimeout(function() {
				heroHeading.style.opacity = '1';
				heroParagraph.style.opacity = '1';
			}, 500);
		});
	</script>
</body>
</html>
