<?php

function Register()
{
    if (!empty($_POST)) {
        $fullname = $_POST['fullname'];
        $username = $_POST['username'];
        $password = $_POST['password'];
        $email = $_POST['email'];
        $telnum = $_POST['phonenumber'];

        $_SESSION['fullname'] = $fullname;
        $_SESSION['username'] = $username;
        $_SESSION['password'] = $password;
        $_SESSION['email'] = $email;
        $_SESSION['telnum'] = $telnum;

        // setcookie('fullname', $fullname, time() + 24 * 60 * 60, '/');
        // setcookie('username', $username, time() + 24 * 60 * 60, '/');
        // setcookie('password', $password, time() + 24 * 60 * 60, '/');
        // setcookie('email', $email, time() + 24 * 60 * 60, '/');
        // setcookie('telnumber', $telnum, time() + 24 * 60 * 60, '/');

        header('Location: login.php');
    }
}
