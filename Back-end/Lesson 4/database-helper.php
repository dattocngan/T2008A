<?php
require_once('config.php'); 

function execute($sql){
    $conn = mysqli_connect(HOST,USERNAME,PASSWORD,DATABASE);
    mysqli_set_charset($conn,'utf8');
    mysqli_query($conn,$sql);
    mysqli_close($conn);
}

function executeResult($sql){
    $conn = mysqli_connect(HOST,USERNAME,PASSWORD,DATABASE);
    mysqli_set_charset($conn,'utf8');
    $result = mysqli_query($conn,$sql);
    $data = [];
    while(($row = mysqli_fetch_array($result,1)) != NULL){
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

function getGET($key) {
	$value = '';
	if (isset($_GET[$key])) {
		$value = $_GET[$key];
	}
	return removeSpecialCharacter($value);
}