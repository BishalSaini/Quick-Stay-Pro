<%@page import="com.jsp.dto.Room"%>
<%@page import="com.jsp.service.RoomService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hotel Booking</title>
<style>
body {
	font-family: Arial, sans-serif;
	
	margin: 0;
	padding: 0;
	
	
	
}

header {
	background-color: #333;
	color: #fff;
	padding: 10px 0;
	height: 70px; /* Adjusted the height */
	position: sticky;
	top: 0;
	width: 100%;
}

.container {
	margin: auto;
	max-width: 800px;
	/* margin: 100px auto 0; Adjusted the margin-top to account for the smaller header height */
	padding: 20px;
	text-align: center;
}

nav {
	display: flex;
	justify-content: flex-end;
	align-items: center;
	padding-right: 20px;
	
	
}

nav a {
	color: #fff;
	text-decoration: none;
	margin: 0 15px;
}

.cart {
	margin-left: auto;
}

.hotel-container {
	display: flex;
	 flex-wrap: wrap; 
	justify-content: center;
	
}

.hotelimg{

	width: calc(75.33% - 20px);
	margin: 10px;
	padding: 20px;
	text-align: center;
	border-radius: 25px;
	

}
.hotel {
	border: 1px solid #ccc;
	width: calc(33.33% - 20px);
	margin: 10px;
	padding: 20px;
	text-align: center;
	border-radius: 25px;
	border : 3px solid purple;
	
}

.status {
	font-size: 18px;
	margin: 10px 0;
}

.price {
	font-size: 18px;
	margin: 10px 0;
}

.id {
	font-size: 18px;
	margin: 10px 0;
}

.room-type {
	margin: 10px 0;
}

.book-button {
	background-color: #007BFF;
	color: #fff;
	border: none;
	padding: 10px 20px;
	cursor: pointer;
	font-size: 16px;
	

}
</style>
</head>
<body>
	<header>
		<div class="container">
			<nav>
				<a href="#">Home</a> <a href="#">Rooms</a> <a href="#">Contact
					Us</a>
				<form action="logout" method="post">
					<button type="submit" name="logout" class="cart">LOGOUT</button>
				</form>
			</nav>
		</div>
	</header>
	<div class="container">

		<h1>Welcome to our Hotel Booking Website</h1>
		<p>Find the perfect room for your stay!</p>



		<%
		RoomService roomService = new RoomService();
		List<Room> rooms = roomService.getAllRoom();
		%>


		<div class="hotel-container">

			<%
			for (Room r : rooms) {
			%>
			<div class="hotel">
			<div><img class="hotelimg" src="images/final.jpg"></div>
				<div class="id">
					Room No.:
					<%=r.getId()%>
				</div>
				<div class="price">
					Price:
					<%=r.getPrice()%>
				</div>
				<div class="room-type">
					Room Type:
					<%=r.getRoomtype()%>
				</div>
				<div class="status">
					Status:
					<%=r.getStatus()%>
				</div>
				
				<%
				// Check if the room status is "booked"
				if (r.getStatus().equals("Booked")) {
				%>
				<button style="background-color: gray ; border-radius: 8px" disabled>Booked</button>
				<button style="background-color: gray ; border-radius: 8px" enable>
				<a style="text-decoration: none; color: red ; "
						href="CancelBooking.jsp?id=<%=r.getId()%>"> Cancel </a></button>
				<%
				} else {
				%>
				<button style="background-color: blue; border-radius: 8px" >
					<a style="text-decoration: none; color: white"
						href="UserClickBookRoom.jsp?id=<%=r.getId()%>"> Book Here </a>
				</button>
				<%
				}
				%>
			</div>
			<%
			}
			%>

		</div>
	</div>
</body>
</html>