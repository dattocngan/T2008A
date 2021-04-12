<?php

function showMenu($a1, $a2, $a3)
{
    echo $a1 . '<br>';
    echo $a2 . '<br>';
    echo $a3 . '<br>';
}

showMenu('Nguyen Tien Dat', 'Nam', 'Ha Noi');

$a = 5;

if ($a % 2 == 0) {
    echo $a . ' is even number';
} else {
    echo $a . ' is odd number';
}
echo '<br>';

$string = 'Nguyen Tien Dat';

print_r(explode(' ',$string)) ;

// $arr = [
//     'Fullname' => 'Nguyen Tien Dat',
//     'Gender' => 'Nam',
//     'Address' => 'Ha Noi'
// ];



// $arr1 = [1,2,3,4,5];
// for ($i=0; $i < sizeof($arr1) ; $i++) { 
//     echo $arr1[$i] . '<br>';
// }

// foreach ($arr1 as $value) {
//     echo $value . '<br>';
// }