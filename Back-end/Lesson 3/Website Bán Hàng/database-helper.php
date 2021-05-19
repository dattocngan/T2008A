<?php
require_once ('config.php');

//insert, update, delete
function execute($sql){
    //Mo lien ket
    $conn = mysqli_connect(HOST,USERNAME,PASSWORD,DATABASE);
    //He utf8
    mysqli_set_charset($conn,'utf8');
    //Thuc thi cau lenh
    mysqli_query($conn,$sql);
    //Dong cong
    mysqli_close($conn);
}
//Doi voi bai toan muon lay du lieu
function executeResult($sql) {
	$conn = mysqli_connect(HOST,USERNAME,PASSWORD,DATABASE);
    mysqli_set_charset($conn,'utf8');
    $data = [];
    $result = mysqli_query($conn,$sql);
    while(($row = mysqli_fetch_array($result,1)) != null){
        $data[] = $row;
    }
    mysqli_close($conn);
    return $data;
}

function removeSpecialCharacter($str) {
	$str = str_replace('\\', '\\\\', $str);
	$str = str_replace('\'', '\\\'', $str);
	return $str;
}

function getPOST($key) {
	$value = '';
	if (isset($_POST[$key])) {
		$value = $_POST[$key];
	}
	return removeSpecialCharacter($value);
}