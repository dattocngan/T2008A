<?php
    $username = $email = $password = ' ';
    if(isset($_GET['username'])){
        $username = $_GET['username'];
        $email = $_GET['email'];
        $password = $_GET['password'];
        if(!empty('$username') && $password == '123'){
            header('Location: welcome.php?username='.$username.'&email='.$email.'&password='.$password);
        }
    }
?>
<!doctype html>
<html lang="en">
  <head>
    <title>Input</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <style>
        .box{
            width: 800px;
            height: 400px;
            margin: 5px auto;
            border: 1px solid blue;
            /* padding: 5px; */
            border-radius: 5px;
        }
        .header{
            width: 100%;
            background-color: #1c74dfe8;
            color: #fff;
            padding: 5px;
            margin-top: -1px;
        }
        form{
            margin: 10px;
        }
    </style>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
    <div class="box">
        <div class="header">
            <span>Input detail information</span>
        </div>
        <form method="get">
            <div class="form-group">
              <label for="">User Name</label>
              <input type="text" name="username" id="" class="form-control" placeholder="">
              <label for="">Email</label>
              <input type="email" name="email" id="" class="form-control" placeholder="">
              <label for="">Password</label>
              <input type="password" name="password" id="" class="form-control" placeholder="">
            </div>
            <button name="" id="" class="btn btn-success" btn-lg btn-block">Register</button>
        </form>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>