<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Web đặt vé xe</title>
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
						aria-current="page" href="Home.jsp">Trang chủ</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="FindTicket.jsp">Tra cứu vé xe</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Tài khoản </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="Register.jsp">Đăng ký</a></li>
							<li><a class="dropdown-item" href="Login.jsp">Đăng nhập</a></li>

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
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-sm-center h-100">
				<div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">

					<div class="card shadow-lg">
						<div class="card-body p-5">
							<h1 class="fs-4 card-title fw-bold mb-4">Đăng ký</h1>
							<form method="post" action="register" autocomplete="off">
								<div class="mb-3">
									<label class="mb-2 text-muted" for="name">Tên người
										dùng</label> <input id="name" type="text" class="form-control"
										name="name" value="" required autofocus>
									<div class="invalid-feedback">Nhap ten nguoi dung</div>
									<div class="mb-3">
										<div class="mb-2 w-100">
											<label class="text-muted" for="tel">Số điện thoại</label>
										</div>
										<input id="phone" type="tel" class="form-control" name="phone"
											required>
										<div class="invalid-feedback">Yêu cầu nhập số điện thoại
										</div>
									</div>
								</div>
								<div class="mb-3">
									<label class="mb-2 text-muted" for="email">E-Mail</label> <input
										id="email" type="email" class="form-control" name="email"
										value="" required autofocus>
									<div class="invalid-feedback">Email không hợp lệ</div>
								</div>
								<p class="text-danger">${mess}</p>
								<div class="mb-3">
									<div class="mb-2 w-100">
										<label class="text-muted" for="password">Nhập mật khẩu</label>
									</div>
									<input id="password" type="password" class="form-control"
										name="password" required>
									<div class="mb-2 w-100">
										<label class="text-muted" for="password">Nhập lại mật
											khẩu</label>
									</div>
									<input id="repassword" type="password" class="form-control"
										name="repassword" required>
								</div>
								<div class="mb-2 w-100">
									<label class="text-muted" for="tel">Giới tính của bạn ?</label>
									<br> <input type="radio" name="sex" value="true">
									Male <input type="radio" name="sex" value="false">
									Female
								</div>

								<div class="d-flex align-items-center">

									<button type="submit" class="btn btn-primary ms-auto">
										Đăng ký</button>
								</div>
							</form>
						</div>

					</div>

				</div>
			</div>
		</div>
	</section>
</body>
</html>