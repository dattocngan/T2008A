<?php
	require_once('login-form.php');
?>
<!DOCTYPE html>
<html>
<head>
	<title>Register</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <style>
        body{
            background: linear-gradient(to right, #D9AFD9, #97D9E1);
        }
		a{
			text-decoration: none !important;
		}
		.link{
			margin-top: 20px;
		}
    </style>
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

	<!-- Popper JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h2 class="text-center">Login</h2>
			</div>
			<div class="panel-body">
				<form method="post">
                    <div class="form-group">
					  <label for="username">Username:</label>
					  <input required="true" type="text" class="form-control" id="username" name="username">
					</div>
                    <div class="form-group">
					  <label for="password">Password</label>
					  <input required="true" type="password" class="form-control" id="password" name="password">
					</div>
					<button class="btn btn-success">Login</button>
					<div class="link"><a href="register.php">Chưa có tài khoản? Đăng kí tại đây</a></div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>