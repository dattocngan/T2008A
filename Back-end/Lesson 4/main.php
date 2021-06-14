<?php
require_once('database-helper.php');
require_once('form.php');
$studentList = executeResult('select * from student');
?>

<!doctype html>
<html lang="en">
  <head>
    <title>Quản lí sinh viên</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="style.css">
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
    <div class="container">
        <div class="card">
            <div class="card-header">
                <span>Management Student's Detail Information</span>
            </div>
            <div class="card-body">
                <table class="table">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>FullName</th>
                            <th>Age</th>
                            <th>Address</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                    <?php
                        $count = 0;
                        foreach ($studentList as $student) {
                        echo '<tr>
                            <td>'.(++$count).'</td>
                            <td>'.$student['fullname'].'</td>
                            <td>'.$student['age'].'</td>
                            <td>'.$student['address'].'</td>
                            <td style="text-align: center" ><button onclick="deleteProduct('.$student['id'].')" class="btn btn-danger">Delete</button></td>
                            </tr>';
                        }
                    ?>
                    </tbody>
                </table>
            </div>
        </div>
        <br>
        <div class="card">
            <div class="card-header">
                <span>Input Student's detail information</span>
            </div>
            <div class="card-body">
                <form method="post">
                    <div class="form-group">
                      <label for="fullname">Fullname</label>
                      <input type="text" class="form-control" name="fullname" id="fullname">
                    </div>
                    <div class="form-group">
                      <label for="age">Age</label>
                      <input type="text" class="form-control" name="age" id="age">
                    </div>
                    <div class="form-group">
                      <label for="address">Address</label>
                      <input type="text" class="form-control" name="address" id="address">
                    </div>
                    <button class="btn btn-success">Save</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Optional JavaScript -->
    <script>
      function deleteProduct(id) {
        option = confirm('Are you sure to delete this product?')
        if(!option) return 

        $.post('form.php', {
          'action': 'delete',
          'id': id
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