<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Document</title>
		<link href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' rel='stylesheet'>
		<link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
		<script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
		<link href="https://fonts.googleapis.com/css?family=Alegreya:700" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
	</head>
	</head> 
	<style>::-webkit-scrollbar {
		width: 8px;
		}
		/* Track */
		::-webkit-scrollbar-track {
		background: #f1f1f1; 
		}
		/* Handle */
		::-webkit-scrollbar-thumb {
		background: #888; 
		}
		/* Handle on hover */
		::-webkit-scrollbar-thumb:hover {
		background: #555; 
		} body{
		background: #ddd;
		min-height: 100vh;
		vertical-align: middle;

		}
		.title{
		margin-bottom: 5vh;
		}
		.card{
		margin: auto;
		max-width: 950px;
		width: 90%;
		box-shadow: 0 6px 20px 0 rgba(0, 0, 0, 0.19);
		border-radius: 1rem;
		border: transparent;
		}
		@media(max-width:767px){
		.card{
		margin: 3vh auto;
		}
		}
		.cart{
		background-color: #fff;
		padding: 4vh 5vh;
		border-bottom-left-radius: 1rem;
		border-top-left-radius: 1rem;
		}
		@media(max-width:767px){
		.cart{
		padding: 4vh;
		border-bottom-left-radius: unset;
		border-top-right-radius: 1rem;
		}
		}
		.summary{
		background-color: #ddd;
		border-top-right-radius: 1rem;
		border-bottom-right-radius: 1rem;
		padding: 4vh;
		color: rgb(65, 65, 65);
		}
		@media(max-width:767px){
		.summary{
		border-top-right-radius: unset;
		border-bottom-left-radius: 1rem;
		}
		}
		.summary .col-2{
		padding: 0;
		}
		.summary .col-10
		{
		padding: 0;
		}.row{
		margin: 0;
		}
		.title b{
		font-size: 1.5rem;
		}
		.main{
		margin: 0;
		padding: 2vh 0;
		width: 100%;
		}
		.col-2, .col{
		padding: 0 1vh;
		}
		a{
		padding: 0 1vh;
		}
		.close{
		margin-left: auto;
		font-size: 0.7rem;
		}
		img{
		width: 3.5rem;
		}
		.back-to-shop{
		margin-top: 4.5rem;
		}
		h5{
		margin-top: 4vh;
		}
		hr{
		margin-top: 1.25rem;
		}
		form{
		padding: 2vh 0;
		}
		select{
		border: 1px solid rgba(0, 0, 0, 0.137);
		padding: 1.5vh 1vh;
		margin-bottom: 4vh;
		outline: none;
		width: 100%;
		background-color: rgb(247, 247, 247);
		}
		input{
		border: 1px solid rgba(0, 0, 0, 0.137);
		padding: 1vh;
		margin-bottom: 4vh;
		outline: none;
		width: 100%;
		background-color: rgb(247, 247, 247);
		}
		input:focus::-webkit-input-placeholder
		{
		color:transparent;
		}
		.btn{
		background-color: #000;
		border-color: #000;
		color: white;
		width: 100%;
		font-size: 0.7rem;
		margin-top: 4vh;
		padding: 1vh;
		border-radius: 0;
		}
		.btn:focus{
		box-shadow: none;
		outline: none;
		box-shadow: none;
		color: white;
		-webkit-box-shadow: none;
		-webkit-user-select: none;
		transition: none; 
		}
		.btn:hover{
		color: white;
		}
		a{
		color: black; 
		}
		a:hover{
		color: black;
		text-decoration: none;
		}
		#code{
		background-image: linear-gradient(to left, rgba(255, 255, 255, 0.253) , rgba(255, 255, 255, 0.185)), url("https://img.icons8.com/small/16/000000/long-arrow-right.png");
		background-repeat: no-repeat;
		background-position-x: 95%;
		background-position-y: center;
		}
	</style>
	<body className='snippet-body'>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item">
							<a class="nav-link active" aria-current="page" href="Home.jsp">
							Trang chủ
							</a>
						</li>
			            <li class="nav-item">
			                <a class="nav-link active" aria-current="page" href="FindTicket.jsp">
			                Tra cứu vé xe
			                </a>               
			             </li>             						
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Tài khoản
							</a>
							<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
								<li><a class="dropdown-item" href="Register.jsp">
									Đăng ký
									</a>
								</li>
								<li><a class="dropdown-item" href="Login.jsp">
									Đăng nhập
									</a>
								</li>
							</ul>
						</li>
					</ul>
					<button class="nav-link active" aria-current="page" href="#">
						<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-telephone-fill" viewBox="0 0 16 16">
							<path fill-rule="evenodd" d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
						</svg>
						Hotline
					</button>
				</div>
			</div>
		</nav>
		<div class="card">
			<div class="row">
				<div class="col-md-8 cart">
					<div class="title">
						<div class="row">
							<div class="col">
								<h4><b>Thông tin đặt vé</b></h4>
							</div>
						</div>
					</div>
					<!-- item 1 -->
					<div class="row border-top border-bottom">
						<div class="row main align-items-center">
							<div class="col-2"><img class="img-fluid" src="https://i.imgur.com/1GrakTl.jpg"></div>
							<div class="col">
								<div class="row ">Đà Nẵng - Đà Lạt</div>
								<div class="row text-info">15h00-5h00</div>
								<div class="row text-muted">Nhà xe Phương Trang</div>
							</div>
							<div class="col">
								<a href="#">-</a><a href="#" class="border">1</a><a href="#">+</a>
							</div>
							<div class="col">285.000 VNĐ <span class="close">&#10005;</span></div>
						</div>
					</div>
					<div class="row border-top border-bottom">
						<div class="row main align-items-center">
							<div class="col-2"><img class="img-fluid" src="https://i.imgur.com/1GrakTl.jpg"></div>
							<div class="col">
								<div class="row ">Đà Nẵng - Huế</div>
								<div class="row text-info">15h00-5h00</div>
								<div class="row text-muted">Nhà xe Phương Trang</div>
							</div>
							<div class="col">
								<a href="#">-</a><a href="#" class="border">1</a><a href="#">+</a>
							</div>
							<div class="col">285.000 VNĐ <span class="close">&#10005;</span></div>
						</div>
					</div>
					<div class="back-to-shop"><a href="#">&leftarrow;</a><span class="text-muted">Quay lại trang đặt vé</span></div>
				</div>
				<div class="col-md-4 summary">
					<div>
						<h5><b>TỔNG CỘNG</b></h5>
					</div>
					<hr>
					<div class="row">
						<div class="col" style="padding-left:0;">SỐ VÉ: 1</div>
						<div class="col text-right">285.000 VNĐ</div>
					</div>
					<form>
						<p>PHƯƠNG THỨC THANH TOÁN</p>
						<select>
							<option class="text-muted">Ngân hàng</option>
							<option class="text-muted">Chuyển khoản</option>
							<option class="text-muted">Momo</option>
						</select>
					</form>
					<div class="row" style="border-top: 1px solid rgba(0,0,0,.1); padding: 2vh 0;">
						<div class="col">TỔNG CỘNG</div>
						<div class="col text-right">285.000 VNĐ</div>
					</div>
					<button class="btn">ĐẶT VÉ</button>
				</div>
			</div>
		</div>
		<script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js'></script>
		<script type='text/javascript' src='#'></script>
		<script type='text/javascript' src='#'></script>
		<script type='text/javascript' src='#'></script>
		<script type='text/javascript'>'#'</script>
		<script type='text/javascript'>var myLink = document.querySelector('a[href="#"]');
			myLink.addEventListener('click', function(e) {
			  e.preventDefault();
			});
		</script>
</html>