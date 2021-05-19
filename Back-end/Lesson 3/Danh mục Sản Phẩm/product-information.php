<!doctype html>
<html lang="en">
  <head>
    <title>Product Information</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <style>
      body{
        background: linear-gradient(to right, #D9AFD9, #97D9E1);
      }
      .container{
        margin-top: 10px;
      }
      .card-body{
        background: blanchedalmond;
      }
      .card-header{
        text-align: center;
        color: blueviolet;
      }
      h1{
        color: red;
      }
      p{
        font-size: 20px;
      }
      a{
        font-size: 20px;
        text-decoration: none !important;
      }
      h3{
        color: orange;
      }
    </style>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <div class="card">
        <div class="card-header">
          <h2>Product Information</h2>
        </div>
        <div class="card-body">
          <div class="row">
            <div class="col-md-6 col-sm-12 col-lg-6 text-center">
              <img src="<?=$_GET['thumbnail']?>" height="200" alt="">
            </div>
            <div class="col-md-6 col-sm-12 col-lg-6">
              <h1><?=$_GET['name']?></h1>
              <p><?=$_GET['content']?></p>
              <h3>Giá: <?=$_GET['price']?></h3>
            </div>
          </div>
        </div>
      </div>
      <a href="sanpham.php">Return Product List</a>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>