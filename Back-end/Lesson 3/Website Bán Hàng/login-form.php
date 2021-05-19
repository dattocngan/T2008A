<?php
function alert($msg) {
    echo "<script type='text/javascript'>alert('$msg');</script>";
}
require_once('database-helper.php');
$accountList = executeResult('select * from account');
$username = $password = '';
if(!empty($_POST)){
    $username = getPOST('username');
    $password = getPOST('password');
    foreach ($accountList as $account) {
        if($account['username'] == $username){
            if($account['password'] == $password){
                header('Location: quantri.php?name='.$account['name']);
                die();
            }
        }
    }
    alert('Khong co tai khoan');
}