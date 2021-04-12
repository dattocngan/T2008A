<?php
session_start();
if (!empty($_POST)) {
    $username = $_POST['username'];
    $password = $_POST['password'];

    $Sessionusername = $Sessionpassword = "";
    if (isset($_SESSION['username'])) {
        $Sessionusername = $_SESSION['username'];
    }
    if (isset($_SESSION['password'])) {
        $Sessionpassword = $_SESSION['password'];
    }
    if ($username == $Sessionusername && $password == $Sessionpassword) {
        header('Location: hello.html');
    }
}