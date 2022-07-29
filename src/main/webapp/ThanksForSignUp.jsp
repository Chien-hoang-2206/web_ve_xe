<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tra cứu vé xe</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Alegreya:700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400" rel="stylesheet">

	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
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
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Xin chào
								${sessionScope.acc.userName}</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="Logout.jsp">Đăng xuất</a></li>
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

	<div class="jumbotron text-center">
	  <h1 class="display-3">Thank You!</h1>
	  <p class="lead"><strong>Please check your email</strong> for further instructions on how to complete your account setup.</p>
	  <hr>
	  <p>
	    Having trouble? <a href="https://bootstrapcreative.com/">Contact us</a>
	  </p>
	  <p class="lead">
	    <a class="btn btn-primary btn-sm" href="Home.jsp" role="button">Continue to homepage</a>
	  </p>
	</div>
</body>
</html> 