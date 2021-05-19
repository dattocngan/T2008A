<?php
  require_once('database-helper.php');
  require_once('quantri-form.php');
  $productList = executeResult('select * from gift_db');
?>
<!doctype html>
<html lang="en">
  <head>
    <title>Title</title>
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
      #formAdd{
        opacity: 0;
        height: 0;
        overflow: hidden;
      }
      .container{
        margin-bottom: 50px;
      }
      .card{
        margin-top: 20px;
      }
      .card-header{
        background: paleturquoise !important;
        text-align: center;
        color: palevioletred;
        font-weight: 600;
        font-size: 25px;
      }
      .card form{
        margin: 20px;
      }
      .close {
        cursor: pointer;
        position: absolute;
        top: 4.9%;
        left: 0%;
        padding: 20.5px 20px;
        transform: translate(0%, -50%);
      }
      .close:hover{
        background: blueviolet;
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
    <h2>Xin chào <?=$_GET['name']?></h2>
    <div class="container">
      <table class="table table-bordered">
        <thead>
          <tr>
            <td>No</td>
            <td>Name</td>
            <td>Image</td>
            <td>Content</td>
            <td>Price</td>
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
                  <td>'.$item['name'].'</td>
                  <td><img src="'.$item['thumbnail'].'" style="width: 160px"/></td>
                  <td>'.$item['content'].'</td>
                  <td>'.$item['price'].'</td>
                  <td>'.$item['updated_at'].'</td>
                  <td><button class="btn btn-warning" 
                  onclick="editProduct('.$item['id'].',\''.$item['name'].'\',\''.$item['thumbnail'].'\',\''.$item['content'].'\','.$item['price'].')">Edit</button></td>
                  <td><button onclick="deleteProduct('.$item['id'].')" class="btn btn-danger">Delete</button></td>
                </tr>';
            }
          ?>
        </tbody>
      </table>
      <div type="button" class="btn btn-success" onclick="addProduct()">Add product</div>
      <a href="login.php" style="margin-left: 10px;">Đăng xuất</a>
      <div id="formAdd" class="card">
        <div class="card-header"><span class="close" onclick="CloseForm()">&times;</span> <span id="formName"> Add product </span></div>
        <div class="card-body">
          <form action="" method="post">
            <div class="form-group">
              <label for="name">Name:</label>
              <input required type="text" id="name" name="name" class="form-control">
            </div>
            <div class="form-group">
              <label for="thumbnail">Image:</label>
              <input required type="text" id="thumbnail" name="thumbnail" class="form-control">
            </div>
          <div class="form-group">
              <label for="content">Content:</label>
              <textarea required class="form-control" id="content" rows="5" id="content" name="content"></textarea>
            </div>
            <div class="form-group">
              <label for="price">Price:</label>
              <input required type="text" name="price" id="price" class="form-control">
            </div>
            <input type="text" id='abc' name="id" hidden >
            <button name="" id="buttonName" class="btn btn-primary" btn-lg btn-block">Add Product</button>
          </form>
        </div>
      </div>
    </div>
    <!-- Optional JavaScript -->
    <script>
      function deleteProduct(id) {
        option = confirm('Are you sure to delete this product?')
        if(!option) return

        $.post('quantri-form.php', {
          'action': 'delete',
          'id': id
        }, function(data) {
          location.reload()
        })
      }
      var formAdd = document.getElementById('formAdd')
      var formName = document.getElementById('formName')
      var buttonName = document.getElementById('buttonName')
      var idInput = document.getElementById('abc')
      function addProduct(){
        formName.textContent = 'Add Product'
        formAdd.style.opacity = "1"
        formAdd.style.height = "auto"
        formAdd.style.transition = 'opacity 0.5s'
        buttonName.textContent = 'Add Product'
        idInput.value ='';
      }
      function editProduct(id,name,thumbnail,content,price){
        formName.textContent = 'Edit Product'
        formAdd.style.opacity = "1"
        formAdd.style.height = "auto"
        formAdd.style.transition = 'opacity 0.5s'
        buttonName.textContent = 'Edit Product'
        idInput.value = id;
        document.getElementById('name').value = name;
        document.getElementById('thumbnail').value = thumbnail;
        document.getElementById('content').value = content;
        document.getElementById('price').value = price;
      }
      function CloseForm(){
        formAdd.style.opacity = "0"
        formAdd.style.transition = 'opacity 0s'
        formAdd.style.height = "0"
      }
    </script>
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> -->
  </body>
</html>  