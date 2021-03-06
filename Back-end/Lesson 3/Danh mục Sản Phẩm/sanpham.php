<?php
  require_once('database-helper.php');
  require_once('form-admin.php');
  if(!empty(getGET('idDanhMuc'))){
    $productList = executeResult("select * from sanpham where idDanhMuc =" . getGET('idDanhMuc'));
  }else{
    $productList = executeResult('select * from sanpham');
  }
?>
<!doctype html>
<html lang="en">
  <head>
    <title>Product List</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <style>
      body{
        background: linear-gradient(to right, #D9AFD9, #97D9E1);
      }
      h2{
        color: red;
        text-align: center;
      }
      a{
        text-decoration: none !important;
      }
      th,td{
        background: #dad0d0 !important;
        color: green;
      }
      .table-bordered td, .table-bordered th{
        border-color: black !important;
      }
      .container{
        margin-bottom: 50px;
      }
      
    </style>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  </head>
  <body>
    <h2>Xin chào Nguyễn Tiến Đạt</h2>
    <div class="container">
      <table class="table table-bordered">
        <thead>
          <tr>
            <td>No</td>
            <td>Product Name</td>
            <td>Price</td>
            <td>Thumbnail</td>
            <td>Content</td>
            <td>Created Time</td>
            <td></td>
            <td></td>
          </tr>
        </thead>
        <tbody>
          <?php
            $count = 0;
            foreach ($productList as $item) {
              echo '<tr>
                  <td>'.(++$count).'</td>
                  <td><a href="product-information.php?name='.$item['name'].'&thumbnail='.$item['thumbnail'].'&price='.$item['price'].'&content='.$item['content'].'">'.$item['name'].'</a></td>
                  <td>'.$item['price'].'</td>
                  <td><img src="'.$item['thumbnail'].'" style="max-width:160px"></td>
                  <td>'.$item['content'].'</td>
                  <td>'.$item['created_at'].'</td>
                  <td style="text-align: center" >
                  <a href="add-product.php?id='.$item['id'].'&productName='.$item['name'].'&price='.$item['price'].'&thumbnail='.$item['thumbnail'].'&content='.$item['content'].'&idDanhMuc='.$item['idDanhMuc'].'">
                  <button class="btn btn-warning">Edit</button></a></td>
                  <td style="text-align: center" ><button onclick="deleteProduct('.$item['id'].')" class="btn btn-danger">Delete</button></td>
                </tr>';
            }
          ?>
        </tbody>
      </table>
      <a href="add-product.php"><div type="button" class="btn btn-success">Add Product</div></a>
      <a href="admin.php" style="margin-left: 15px;">Return Category List</a>
    </div>
    <!-- Optional JavaScript -->
    <script>
      function deleteProduct(id) {
        option = confirm('Are you sure to delete this product?')
        if(!option) return 

        $.post('form-admin.php', {
          'action': 'delete',
          'idSanPham': id
        }, function(data) {
          location.reload()
        })
      }
    </script>
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> -->
  </body>
</html>  