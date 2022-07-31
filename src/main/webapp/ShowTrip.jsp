<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Web đặt vé xe</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="../Homepage/index.html">Trang chủ</a>
              </li>
              
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Tài khoản
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="../Register/index.html">Đăng ký</a></li>
                  <li><a class="dropdown-item" href="../Login/index.html">Đăng nhập</a></li>
                  
                </ul>
               
              </li>
            </ul>
            <button class="nav-link active" aria-current="page" href="#"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-telephone-fill" viewBox="0 0 16 16">
                <path fill-rule="evenodd" d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
              </svg> Hotline</button>
            
          </div>
        </div>
      </nav>


      <div class="container">
        <div class="row g-3">
            <div class="col-12 col-md-6 col-lg-4">
                <div class="card">
                    <img src="../img/xe.jpg" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">Xe Phương Trang</h5>
                        <p class="card-text">8h30-10h30</p>
                        <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">Thêm thông tin</button>
                        <a href="../shoppingcart/index.html" class="btn btn-primary">Đặt chỗ</a>
                        
                    </div>
                    <div class="collapse" id="collapseExample">
                      <div class="card card-body">Số ghế: 50</div>
                    </div>
                </div>
            </div>
            <div class="col-12 col-md-6 col-lg-4">
                <div class="card">
                    <img src="../img/xe.jpg" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">Xe Phương Trang</h5>
                        <p class="card-text">9h30-11h30</p>
                        <a href="../shoppingcart/index.html" class="btn btn-primary">Đặt chỗ</a>
                    </div>
                </div>
            </div>
            <div class="col-12 col-md-6 col-lg-4">
                <div class="card">
                    <img src="../img/xe.jpg" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">Xe Thanh Hiền</h5>
                        <p class="card-text">12h30-14h30</p>
                        <a href="../shoppingcart/index.html" class="btn btn-primary" >Đặt chỗ</a>
                    </div>
                </div>
            </div>
            
        </div>
    </div>
</body>      