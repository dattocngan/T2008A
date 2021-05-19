<?php
require_once('database-helper.php');
$accountList = executeResult('select * from account');

function alert($msg) {
    echo "<script type='text/javascript'>alert('$msg');</script>";
}

$username = $name = $email = $password = $passwordConfirmed = '';
if (!empty($_POST)) {
    $username = getPOST('username');
    $name = getPOST('name');
    $email = getPOST('email');
    $password = getPOST('password');
    $passwordConfirmed = getPOST('passwordConfirmed');
    
    $check = 0;
    foreach ($accountList as $account) {
        if($account['username'] == $username){
            $check++;
            alert('Tai khoan da ton tai');
            break;
        }
    }
    if($password == $passwordConfirmed && $check == 0){
        $created_at = $updated_at = date('Y-m-d H:i:s');
        $sql = "insert into account(name,username,password,email,created_at,updated_at)
        values ('$name','$username','$password','$email','$created_at','$updated_at')";
        execute($sql);
        header('Location: login.php');
    }
}