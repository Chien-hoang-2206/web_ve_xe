<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
							<li><a class="dropdown-item" href="Ticketinfo.jsp">Vé
									của tôi</a></li>
							<li><a class="dropdown-item" href="logout">Đăng xuất</a></li>
						</ul></li>
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
	<div class="row">
		<section class="col-md-2">
			<!-- Bên info  -->
			<div id="list">
				<ul class="nav flex-column" style="background-color: #e1e1e1;">
					<li class="nav-item"><a href="Profile.jsp"
						class="nav-link active"><i class="fa fa-adjust"></i>Thông tin
							tài khoản</a></li>
					<li class="nav-item"><a href="Ticketinfo.jsp"
						class="nav-link active"><i class="fa fa-adjust"></i>Vé đã đặt</a></li>
		</section>

		<section class="col-md-10">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">Họ và tên</span>
				</div>
				<input type="text" class="form-control"
					placeholder="${sessionScope.acc.userName }" aria-label="Username"
					aria-describedby="basic-addon1" disabled>
			</div>

			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">Email</span>
				</div>
				<input type="text" class="form-control"
					placeholder="${sessionScope.acc.userEmail }" aria-label="Username"
					aria-describedby="basic-addon1" disabled>
			</div>
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">SĐT: </span>
				</div>
				<input type="text" class="form-control"
					placeholder="${sessionScope.acc.userPhone }" aria-label="Username"
					aria-describedby="basic-addon1" disabled>
			</div>
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">Giới tính:
					</span>
				</div>
				<input type="text" class="form-control" placeholder="Nam"
					aria-label="Username" aria-describedby="basic-addon1" disabled>
			</div>
			<button class="btn btn-primary" type="button"
				data-bs-toggle="collapse" data-bs-target="#changeinfo"
				aria-expanded="false" aria-controls="collapseExample">Thay
				đổi thông tin cá nhân</button>
			<div class="collapse" id="changeinfo">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1">Họ và tên</span>
					</div>
					<input type="text" class="form-control"
						placeholder="Phạm Trần Thanh Lâm" aria-label="Username"
						aria-describedby="basic-addon1">
				</div>

				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1">Email</span>
					</div>
					<input type="text" class="form-control"
						placeholder="lam73nk@gmail.com" aria-label="Username"
						aria-describedby="basic-addon1">
				</div>
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1">SĐT: </span>
					</div>
					<input type="text" class="form-control" placeholder="012345678"
						aria-label="Username" aria-describedby="basic-addon1">
				</div>
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1">Giới tính:
						</span>
					</div>
					<input type="text" class="form-control" placeholder="Nam"
						aria-label="Username" aria-describedby="basic-addon1">

				</div>
				<button class="btn btn-danger">Cập nhật thông tin cá nhân</button>
			</div>

			<script>
				
			</script>
		</section>

	</div>
</body>
<style>
</style>
</html>