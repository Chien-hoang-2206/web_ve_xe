
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vn">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colrolib Templates">
    <meta name="author" content="Colrolib">
    <meta name="keywords" content="Colrolib Templates">

    <!-- Title Page-->
    <title>Au Form Wizard</title>

    <!-- Icons font CSS-->
    <link href="./template/vendor/mfi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="./template/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="./template/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="./template/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="./template/css/main.css" rel="stylesheet" media="all">
    <!-- Autocomplete -->
    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
</head>
<body>
    <div class="page-wrapper bg-img-2 p-t-290 p-b-120">
        <div class="wrapper wrapper--w1226">
            <div class="card card-5">
                <div class="card-body">
                <form action="search">
        
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">from</label>
                                    <input class="input--style-1" type="text" name="routeFrom" id ="q" placeholder="City, Region or Airport"  required="required"  >
  
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">to</label>
                                    <input class="input--style-1" type="text" name="routeTo" id ="a" placeholder="City, Region or Airport" required="required"  >                             
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                        								<div class="row">
									<div class="col-sm">
										<div class="form-group">
											<span class="form-label">Ngày đi</span> <input
												class="form-control" type="date" name="timeFrom" id="date" required value=""
												min="1997-01-01" max="2030-12-31">
										</div>
									</div>

								</div>
								<div class="form-btn">
									<script>
										function formatdate(date) {
											let m = date.getMonth() + 1;
											let d = date.getDate();
											let y = date.getFullYear();
											if (m >= 10) {
												return d + '-' + m + '-' + y;
											} else {
												return d + '-0' + m + '-' + y;
											}
										}
										function myfunction() {
											var departure = document
													.getElementById("departure").value;
											var destination = document
													.getElementById("destination").value;
											var input = document
													.getElementById("date").value;
											var date = new Date(input);
											console.log(departure);
											console.log(destination);
											console.log(formatdate(date));
										}
									</script>
								</div>
                                    <div class="col-2">
                                  <a href="ShowInf.jsp">
                                        <button class="btn-submit" type="submit">search</button>
                                        </a>
                                   
                                    </div>
                                
                            
                        </div>
       </form>
                </div>
            </div>
        </div>
    </div>
 
    

    <!-- Jquery JS-->
    <script src="./template/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="./template/vendor/select2/select2.min.js"></script>
    <script src="./template/vendor/jquery-validate/jquery.validate.min.js"></script>
    <script src="./template/vendor/bootstrap-wizard/bootstrap.min.js"></script>
    <script src="./template/vendor/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
    <script src="./template/vendor/datepicker/moment.min.js"></script>
    <script src="./template/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="./template/js/global.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->