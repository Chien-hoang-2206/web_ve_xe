<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dashboard</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Alegreya:700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="home">Trang chủ</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="FindTicket.jsp">Tra cứu vé xe</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Xin chào ${sessionScope.acc.userName} </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="Profile.jsp">Trang cá
									nhân</a></li>
							<li><a class="dropdown-item" href="myticket">Vé của tôi</a></li>
							<li><a class="dropdown-item" href="logout">Đăng xuất</a></li>
						</ul></li>
				</ul>
				<form action="Contact.jsp">
					<button class="nav-link active" aria-current="page">
						<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
							fill="currentColor" class="bi bi-telephone-fill"
							viewBox="0 0 16 16">
                <path fill-rule="evenodd"
								d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z" />
              </svg>
						Hotline
					</button>
				</form>
			</div>
		</div>
	</nav>

	<form method="get" action="myticket" autocomplete="off">
		<p class="text-danger">${mess}</p>
		<div class="row">
			<section class="col-md-2">
				<!-- BÃªn info  -->
				<div id="list">
					<ul class="nav flex-column" style="background-color: #e1e1e1;">
						<li class="nav-item"><a href="Profile.jsp"
							class="nav-link active"><i class="fa fa-adjust"></i>Thông tin
								tài khoảnn</a></li>
						<li class="nav-item"><a href="myticket"
							class="nav-link active"><i class="fa fa-adjust"></i>Vé đã đặt</a></li>
					</ul>
				</div>
			</section>
			<section class="col-md-10">
				<div class="table-responsive">
					<table class="table table-hover mb-0">
						<thead>
							<tr>
								<th>Mã vé</th>
								<th>Tên nhà xe</th>
								<th>Khởi hành</th>
								<th>Đích đến</th>
								<th>Giờ khởi hành</th>
								<th>Giờ đến</th>
								<th>Giá vé</th>
								<th>Trạng thái</th>
							</tr>
						</thead>

						<c:forEach items="${listTicketDetal}" var="l">
							<thead>
								<tr>
									<th>${l.ticketID}</th>
									<th>${l.carName}</th>
									<th>${l.routeFrom}</th>
									<th>${l.routeTo}</th>
									<th>${l.timeFrom}</th>
									<th>${l.timeTo}</th>
									<th>${l.carPrice}</th>
									<th>${l.paymentName}</th>
								</tr>
							</thead>
						</c:forEach>

					</table>
				</div>
			</section>
		</div>
	</form>
</body>
<style>
.carid {
	display: flex;
	justify-content: space-around;
	height: 20vh;
}
</style>
</html>