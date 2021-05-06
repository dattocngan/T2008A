<?php
$arr = [];
$arr[] = 55;
$arr[] = 45;
array_push($arr,18);
array_splice($arr,1,1);
var_dump($arr);
$std = [
    'name' => 'Nguyen Tien Dat',
    'age' => '18',
    'address' => 'Hanoi'
];
unset($std['age']);
var_dump($std);
echo '<br>';
foreach ($std as $key => $value) {
    echo $key . ' : ' . $value . '<br>';
}