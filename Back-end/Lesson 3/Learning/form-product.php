<?php
require_once ('database-helper.php');
require_once ('utility.php');

$title = $thumbnail = $content = '';

if (!empty($_POST)) {
	$action = getPOST('action');

	switch ($action) {
		case 'delete':
			deleteProduct();
			break;

		default:
			$id = getPOST('id');
			if ($id > 0) {
				updateProduct();
			} else {
				addProduct();
			}

			break;
	}
}

function deleteProduct() {
	$id  = getPOST('id');
	$sql = "delete from product where id = $id";
	execute($sql);
}

function updateProduct() {
	$title = getPOST('title');

	if (isset($_FILES['thumbnail']['name']) && $_FILES['thumbnail']['name'] != '') {
		$thumbnail = moveFileToPhotos('thumbnail');
	} else {
		$thumbnail = '';
	}
	// $thumbnail = moveFileToPhotos('thumbnail');

	$content = getPOST('content');
	$id      = getPOST('id');

	if (!empty($title) && !empty($content)) {
		$created_at = $updated_at = date('Y-m-d H:i:s');
		if (empty($thumbnail)) {
			$sql = "update product set title = '$title', content = '$content', updated_at = '$updated_at' where id = " .$id;
		} else {
			$sql = "update product set title = '$title', thumbnail = '$thumbnail', content = '$content', updated_at = '$updated_at' where id = " .$id;
		}

		execute($sql);
	}
}

function addProduct() {
	$title     = getPOST('title');
	$thumbnail = moveFileToPhotos('thumbnail');
	$content   = getPOST('content');

	if (!empty($title) && !empty($content)) {
		$created_at = $updated_at = date('Y-m-d H:i:s');
		$sql        = "insert into product(title, thumbnail, content, created_at, updated_at) values ('$title', '$thumbnail', '$content', '$created_at', '$updated_at')";
		// echo $sql;
		execute($sql);
	}
}