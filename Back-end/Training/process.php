<?php
// var_dump($_POST);

//REQUEST dung duoc cho ca GET va POST
if (isset($_POST['fullname'])) {
    $fullname = $_POST['fullname'];
    $address = $_POST['address'];
    $email = $_POST['email'];

    echo 'Fullname : ' . $fullname . '<br/>';

    echo 'Address : ' . $address . '<br/>';

    echo 'Email : ' . $email . '<br/>';
    if($fullname == 'Nguyen Tien Dat') header('Location: hello.html');
}