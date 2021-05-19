<?php
require_once('database-helper.php');
require_once('form-main.php');
$searchTitle = getGET('searchTitle');
if (!empty($searchTitle)) {
    $conn = mysqli_connect(HOST, USERNAME, PASSWORD, DATABASE);
    $result = mysqli_query($conn, "select count(id) as total from product where title like '%$searchTitle%'");
    $row = mysqli_fetch_assoc($result);
    $total_records = $row['total'];
    $current_page = isset($_GET['page']) ? $_GET['page'] : 1;
    $limit = 10;
    $total_page = ceil($total_records / $limit);
    if ($current_page > $total_page) {
        $current_page = $total_page;
    } else if ($current_page < 1) {
        $current_page = 1;
    }
    $start = ($current_page - 1) * $limit;
    $result = mysqli_query($conn, "SELECT * FROM product where title like '%$searchTitle%' LIMIT $start, $limit");
} else {
    $conn = mysqli_connect(HOST, USERNAME, PASSWORD, DATABASE);
    $result = mysqli_query($conn, 'select count(id) as total from product');
    $row = mysqli_fetch_assoc($result);
    $total_records = $row['total'];
    $current_page = isset($_GET['page']) ? $_GET['page'] : 1;
    $limit = 10;
    $total_page = ceil($total_records / $limit);
    if ($current_page > $total_page) {
        $current_page = $total_page;
    } else if ($current_page < 1) {
        $current_page = 1;
    }
    $start = ($current_page - 1) * $limit;
    $result = mysqli_query($conn, "SELECT * FROM product LIMIT $start, $limit");
}
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
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>

<body>
    <div class="form-group has-search" style="width: 400px;text-align:right;margin-left: auto;margin-right: 20px;margin-top:20px">
        <form method="post">
            <input name="searchTitle" type="text" class="form-control" placeholder="Enter to search...">
        </form>
    </div>
    <div class="container">
        <table class="table table-bordered">
            <thead>
                <tr>
                    <td>No</td>
                    <td>Thumbnail</td>
                    <td>Title</td>
                    <td>Price</td>
                    <td>Udpated At</td>
                </tr>
            </thead>
            <tbody>
                <?php
                $count = getGET('count');

                while ($row = mysqli_fetch_assoc($result)) {
                    if ($count < 9) {
                        echo '<tr>
                    <td>0' . (++$count) . '</td>
                    <td><img src="' . $row['thumbnail'] . '" style="max-width:160px"></td>
                    <td>' . $row['title'] . '</td>
                    <td>' . $row['price'] . '</td>
                    <td>' . $row['updated_at'] . '</td>
                    </tr>';
                    } else {
                        echo '<tr>
                    <td>' . (++$count) . '</td>
                    <td><img src="' . $row['thumbnail'] . '" style="max-width:160px"></td>
                    <td>' . $row['title'] . '</td>
                    <td>' . $row['price'] . '</td>
                    <td>' . $row['updated_at'] . '</td>
                    </tr>';
                    }
                }
                ?>
            </tbody>
        </table>
        <div class="pagination" style="margin-bottom: 20px;">
            <?php
            // PHẦN HIỂN THỊ PHÂN TRANG
            // BƯỚC 7: HIỂN THỊ PHÂN TRANG

            $count1 = getGET('count');
            // nếu current_page > 1 và total_page > 1 mới hiển thị nút prev
            if (!empty($count1)) {

                if ($current_page > 1 && $total_page > 1) {
                    $count1 -= 10;
                    if(!empty($searchTitle)){
                        echo '<a href="main.php?page=' . ($current_page - 1) . '&count=' . $count1 . '&searchTitle='.$searchTitle.'">Prev</a> | ';
                    }
                    else echo '<a href="main.php?page=' . ($current_page - 1) . '&count=' . $count1 . '">Prev</a> | ';
                }
            }

            // Lặp khoảng giữa
            $dem = 0;
            for ($i = 1; $i <= $total_page; $i++) {
                // Nếu là trang hiện tại thì hiển thị thẻ span
                // ngược lại hiển thị thẻ a
                if ($i == $current_page) {
                    echo '<span>' . $i . '</span> | ';
                } else {
                    if(!empty($searchTitle)){
                        echo '<a href="main.php?page=' . $i . '&count=' . $dem . '&searchTitle='.$searchTitle.'">' . $i . '</a> | ';
                    }
                    else echo '<a href="main.php?page=' . $i . '&count=' . $dem . '">' . $i . '</a> | ';
                }
                $dem += 10;
            }
            $count2 = getGET('count');
            // nếu current_page < $total_page và total_page > 1 mới hiển thị nút prev
            if (!empty($count2)) {
                if ($current_page < $total_page && $total_page > 1) {
                    $count2 += 10;
                    if(!empty($searchTitle)){
                        echo '<a href="main.php?page=' . ($current_page + 1) . '&count=' . $count2 . '&searchTitle='.$searchTitle.'">Next</a> | ';
                    }
                    else echo '<a href="main.php?page=' . ($current_page + 1) . '&count=' . $count2 . '">Next</a> | ';
                }
            }

            ?>
        </div>
    </div>
    <!-- Optional JavaScript -->
    <script>

    </script>
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> -->
</body>

</html>