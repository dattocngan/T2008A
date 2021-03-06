<?php
    if (!empty($_POST)) {
        $email = $_POST['email'];
        $password = $_POST['password'];
        if(!empty($email)){
            $emailCookie = '';
            if(isset($_COOKIE['email'])){
                $emailCookie = $_COOKIE['email'];
            }
            $passwordCookie = '';
            if(isset($_COOKIE['password'])){
                $passwordCookie = $_COOKIE['password'];
            }
            if($email == $emailCookie && $password == $passwordCookie){
                header('Location: welcome.php');
                die();
            }
        }
    }
?>

<!doctype html>
<html lang="en">
  <head>
    <title>Register</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <style>
        .card-header{
            background: rgb(116, 154, 224) !important;
            color: white;
            text-align: center;
            font-size: 25px;
        }
        label{
            font-weight: bold !important;
        }
    </style>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
        <?php
            if(!empty($email)){
                echo '<div style="color:red; font-size: 30px">Nhập sai, vui lòng thử lại!!</div>';
            }
        ?>
        <div class="card">
            <div class="card-header">
                <span>Login</span>
            </div>
            <div class="card-body">
                <form method="post">
                    <div class="form-group">
                      <label for="email">Email</label>
                      <input type="email" class="form-control" name="email" id="email">
                    </div>
                    <div class="form-group">
                      <label for="password">Password</label>
                      <input type="password" class="form-control" name="password" id="password">
                    </div>
                    
                    <button class="btn btn-success">Login</button>
                </form>
            </div>
        </div>
        <a href="register.php">Register</a>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>