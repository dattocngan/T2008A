<?php
$pass = '1842002';
$md5Pass = md5($pass);
echo $md5Pass;
echo '<br>';
$string = 'Nguyen Tien Dat';
$base64String = base64_encode($string);
echo $base64String . '<br>' . base64_decode($base64String);