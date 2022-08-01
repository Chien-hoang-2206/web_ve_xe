<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tra cứu vé xe</title>
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
						aria-current="page" href="findticket">Tra cứu vé xe</a></li>
					<c:if test="${sessionScope.acc  == null}">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Tài khoản </a>
							<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
								<li><a class="dropdown-item" href="Register.jsp">Đăng
										ký</a></li>
								<li><a class="dropdown-item" href="Login.jsp">Đăng nhập</a></li>
							</ul></li>
					</c:if>
					<c:if test="${sessionScope.acc  != null}">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Xin chào ${sessionScope.acc.userName} </a>
							<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
								<li><a class="dropdown-item" href="Profile.jsp">Trang cá nhân</a></li>
								<li><a class="dropdown-item" href="myticket">Vé của tôi</a></li>
								<li><a class="dropdown-item" href="logout">Đăng xuất</a></li>
								</ul></li>
					</c:if>
				</ul>
			
				<button class="nav-link active" aria-current="page" href="#">
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-telephone-fill"
						viewBox="0 0 16 16">
                <path fill-rule="evenodd"
							d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z" />
              </svg>
					Hotline
				</button>

			</div>
		</div>
	</nav>
	<section class="h-100">
		<div class="container-fluid my-5  d-flex  justify-content-center">
			<div class="card card-1">
				<div class="card-header bg-white">
					<div
						class="media flex-sm-row flex-column-reverse justify-content-between  ">
						<div class="col my-auto">
							<h4 class="mb-0">
								Cảm ơn bạn đã đặt vé, <span class="change-color">Ahihi</span> !
							</h4>
						</div>
						<div class="col-auto text-center  my-auto pl-0 pt-sm-4">
							<img class="img-fluid my-auto align-items-center mb-0 pt-3"
								src="./img/xe.png" width="400" height="200">
							<p class="mb-4 pt-0 Glasses">Chúc bạn thượng lộ nằm ngang</p>
						</div>
					</div>
				</div>
				<div class="card-body">
					<div class="row justify-content-between mb-3">
						<div class="col-auto">
							<h6 class="color-1 mb-0 change-color">Thông tin vé</h6>
						</div>
						<div class="col-auto  ">
							<small>Mã vé: ${ticketDetal.ticketID}</small>
						</div>
						<div class="row mt-4">
							<div class="col">
								<div class="card card-2">
									<div class="card-body">
										<div class="media">
											<div class="sq align-self-center "></div>
											<div class="media-body my-auto text-right">
												<div class="row  my-auto flex-column flex-md-row">
													<div class="col-auto my-auto ">
														<h6 class="mb-0">Tên nhà xe</h6>
													</div>
													<div class="col-auto my-auto  ">
														<h6 class="mb-0">Tên khách</h6>
													</div>
													<div class="col-auto my-auto  ">
														<h6 class="mb-0">SĐT</h6>
													</div>
													<div class="col-auto my-auto ">
														<h6 class="mb-0">Email</h6>
													</div>
													<div class="col-auto my-auto ">
														<h6 class="mb-0">Điểm đi</h6>
													</div>
													<div class="col-auto my-auto ">
														<h6 class="mb-0">Điểm đến</h6>
													</div>
													<div class="col-auto my-auto ">
														<h6 class="mb-0">Thời gian đi</h6>
													</div>
													<div class="col-auto my-auto ">
														<h6 class="mb-0">Thời gian đến</h6>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<div class="card card-2">
								<div class="card-body">
									<div class="media">
										<div class="sq align-self-center "></div>
										<div class="media-body my-auto text-right">
											<div class="row  my-auto flex-column flex-md-row">
												<div class="col my-auto">
													<h6 class="mb-0">${ticketid}</h6>
												</div>
												<div class="col-auto my-auto">
													<small>${ticketid}</small>
												</div>
												<div class="col my-auto">
													<small>${ticketid}</small>
												</div>
												<div class="col my-auto">
													<small>${ticketid}</small>
												</div>
												<div class="col my-auto">
													<small>${ticketid}</small>
												</div>
												<div class="col my-auto">
													<small>${ticketid}</small>
												</div>
												<div class="col my-auto">
													<small>${ticketid}</small>
												</div>
												<div class="col my-auto">
													<small>${ticketid}</small>
												</div>
											</div>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
					<div class="row mt-4"></div>
					<div class="row invoice ">
						<div class="col">
							<p class="mb-1">Ngày đặt : 22 Dec,2019</p>
						</div>
					</div>
				</div>
				<div class="card-footer">
					<div class="jumbotron-fluid">
						<div class="row justify-content-between ">
							<div class="col-sm-auto col-auto my-auto"></div>
							<div class="col-auto my-auto ">
								<h2 class="mb-0 font-weight-bold">Giá vé:</h2>
							</div>
							<div class="col-auto my-auto ml-auto">
								<h1 class="display-3 ">${ticketDetal.carPrice}&#8363;</h1>
							</div>
						</div>
						<div class="row mb-3 mt-3 mt-md-0">
							<div class="col-auto border-line">
								<small class="text-white">PAN:AA02hDW7E</small>
							</div>
							<div class="col-auto border-line">
								<small class="text-white">CIN:UMMC20PTC </small>
							</div>
							<div class="col-auto ">
								<small class="text-white">GSTN:268FD07EXX </small>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
