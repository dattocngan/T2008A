<?php
    require_once('form-admin.php');
    $categoryList = executeResult('select * from danhmuc');
    $productName = $price = $thumbnail = $content = $idDanhMuc = "";
    $id = getGET('id');
    if (!empty($id)) {
        $productName = getGET('productName');
        $price = getGET('price');
        $thumbnail = getGET('thumbnail');
        $content = getGET('content');
        $idDanhMuc = getGET('idDanhMuc');
    }
?>
<!doctype html>
<html lang="en">
  <head>
    <title>Add Category</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <style>
        body{
            background: linear-gradient(to right, #D9AFD9, #97D9E1);
        }
        .container{
            margin-top: 10px;
        }
        .card-header{
            text-align: center;
            background: lightgoldenrodyellow !important;
            color:red;
        }
        a{
            text-decoration: none !important;
            margin-left: 15px;
        }
        select{
            width: 200px !important;
        }
    </style>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
        <div class="card">
            <div class="card-header">
                <h2>Add Product</h2>
            </div>
            <div class="card-body">
                <form method="post">
                    <input type="text" name="id" hidden value="<?=$id?>" id="">
                    <div class="form-group">
                        <label for="productName"><h3>Tên sản phẩm:</h3></label>
                        <input value="<?=$productName?>" required type="text" name="productName" id="categoryName" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="price"><h3>Giá:</h3></label>
                        <input value="<?=$price?>" required type="text" name="price" id="price" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="thumbnail"><h3>Thumbnail:</h3></label>
                        <input value="<?=$thumbnail?>" required type="text" name="thumbnail" id="thumbnail" class="form-control">
                    </div>
                    <?php
                        if(!empty($thumbnail)){
                            echo '<img src="'.$thumbnail.'" style="max-height:200px;">';
                        }
                    ?>
                    <div class="form-group">
                        <label for="content"><h3>Nội dung:</h3></label>
                        <textarea  name="content" id="content" rows="5" class="form-control"><?=$content?></textarea>
                    </div>
                    <div class="form-group">
                        <select name="idDanhMuc" id="" class="form-control" required>
                            <?php
                                if(!empty($idDanhMuc)){
                                    foreach ($categoryList as $item) {
                                        if($idDanhMuc==$item['id'])
                                        echo '<option value="'.$idDanhMuc.'">'.$item['name'].'</option>';
                                    }
                                }else{
                                    foreach ($categoryList as $item) {
                                        echo '<option value="'.$item['id'].'">'.$item['name'].'</option>';
                                    }
                                }
                            ?>
                        </select>
                    </div>
                    <button class="btn btn-warning" btn-lg btn-block">Add Product</button>
                    <a href="admin.php">Quản lý danh mục</a>
                </form>
            </div>
        </div>
        
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>