<?php
require_once ('config.php');

//insert, update, delete
function execute($sql) {
	//save data -> database (product)
	//B1. Mo ket noi toi database
	$conn = mysqli_connect(HOST, USERNAME, PASSWORD, DATABASE);
	mysqli_set_charset($conn, 'utf8');

	//B2. Thuc thi query (select, insert, update, delete)
	mysqli_query($conn, $sql);

	//B3. Dong ket noi database
	mysqli_close($conn);
}

function executeResult($sql, $isSingle = false) {
	//save data -> database (product)
	//B1. Mo ket noi toi database
	$conn = mysqli_connect(HOST, USERNAME, PASSWORD, DATABASE);
	mysqli_set_charset($conn, 'utf8');

	//B2. Thuc thi query (select, insert, update, delete)
	$resultset = mysqli_query($conn, $sql);

	if ($isSingle) {
		$data = mysqli_fetch_array($resultset, 1);
	} else {
		$data = [];

		while (($row = mysqli_fetch_array($resultset, 1)) != null) {
			$data[] = $row;
		}
	}

	//B3. Dong ket noi database
	mysqli_close($conn);

	return $data;
}

function removeSpecialCharacter($str) {
	// abc\okok -> abc\\okok
	//abc\okok (user) -> abc\okok (server) -> sql (abc\okok) -> xuat hien ky tu \ -> ky tu dac biet -> error query
	//abc\okok (user) -> abc\okok (server) -> convert -> abc\\okok -> sql (abc\\okok) -> chinh xac
	$str = str_replace('\\', '\\\\', $str);
	//abc'okok -> abc\'okok
	//abc'okok (user) -> abc'okok (server) -> sql (abc'okok) -> xuat hien ky tu \ -> ky tu dac biet -> error query
	//abc'okok (user) -> abc'okok (server) -> convert -> abc\'okok -> sql (abc\'okok) -> chinh xac
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