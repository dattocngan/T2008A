<?php
    require_once('config.php');
    require_once('database-helper.php');
    $page = 1;
    if(isset($_GET['page'])){
        $page = $_GET['page'];
    }
    if($page <= 0){
        $page = 1;
    }
    $currentIndex = ($page-1)*NUMPAGE_MAX;
    $sql = "select * from products limit $currentIndex, ".NUMPAGE_MAX;
    $productList = executeResult($sql);
    $sqlCount = "select count(*) as 'Total' from products";
    $data = executeResult($sqlCount);
    $total = $data[0]['Total'];
    $numPages = ceil($total/NUMPAGE_MAX);

?>
<!doctype html>
<html lang="en">
  <head>
    <title>Product List</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
        <div class="card">
            <div class="card-header text-center">
                <span>Product List</span>
            </div>
            <div class="card-body">
                <table class="table table-bordered">
                    <thead>
                        <th>No</th>
                        <th>Name</th>
                        <th>Thumbnail</th>
                    </thead>
                    <tbody>
                        <?php
                        $count = $currentIndex;
                        foreach ($productList as $product) {
                            echo '<tr>
                                    <td>'.++$count.'</td>
                                    <td>'.$product['name'].'</td>
                                    <td><img src = "'.$product['thumbnail'].'" width=100px></td>
                                </tr>';
                        }
                        ?>
                    </tbody>
                </table>
            </div>
            <div class="card-footer">
                <ul class="pagination">
                    <?php
                    if ($page > 1) {
                        echo '<li class="page-item"><a class="page-link" href="?page='.($page-1).'">Previous</a></li>';
                    }
                    for ($i = 1; $i <= $numPages && $numPages > 1; $i++) {
                        echo '<li class="page-item"><a class="page-link" href="?page='.$i.'">'.$i.'</a></li>';
                    }
                    if ($page < $numPages) {
                        echo '<li class="page-item"><a class="page-link" href="?page='.($page+1).'">Next</a></li>';
                    }
                    ?>

                </ul>
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