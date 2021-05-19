<?php
require_once ('config.php');

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