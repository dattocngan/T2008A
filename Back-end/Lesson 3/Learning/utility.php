<?php
function moveFileToPhotos($key) {
	//Duong dan chua file da duoc upload len Server
	$target_dir        = "photos/";
	$file              = $_FILES[$key]['name'];
	$path              = pathinfo($file);
	$filename          = $path['filename'];
	$ext               = $path['extension'];
	$temp_name         = $_FILES[$key]['tmp_name'];
	$path_filename_ext = $target_dir.$filename.".".$ext;

	if (file_exists($path_filename_ext)) {
		// echo "Sorry, file already exists.";
	} else {
		move_uploaded_file($temp_name, $path_filename_ext);
		// echo "Congratulations! File Uploaded Successfully.";
	}
	return $path_filename_ext;
}