<?php
require_once('database-helper.php');
require_once('config.php');

function alert($msg) {
    echo "<script type='text/javascript'>alert('$msg');</script>";
}

if(!empty($_POST)){
    $action = getPOST('action');
    $id = getPOST('id');
    switch($action){
        case 'delete':
            deleteCategory();
            break;
        default:
            if(!empty($id)){
                editProduct($id);
            }else{
                addProduct();
            }
            break;
    }
}

function deleteCategory(){
    $id = getPOST('id');
    $idSanPham = getPOST('idSanPham');
    if(!empty($idSanPham)){
        $sql = "delete from sanpham where id = $idSanPham";
        execute($sql);
    }else{
        $sql1 = "delete from danhmuc where id = $id";
        $sql = "delete from sanpham where idDanhMuc = $id";
        execute($sql);
        execute($sql1);
    }
}
function addProduct(){
    $categoryName = getPOST('categoryName');
    $productName = getPOST('productName');
    $price = getPOST('price');
    $thumbnail = getPOST('thumbnail');
    $content = getPOST('content');
    $idDanhMuc = getPOST('idDanhMuc');
    $startTime = date('Y-m-d H:i:s');
    $cenvertedTime = date('Y-m-d H:i:s',strtotime('+5 hour',strtotime($startTime)));
    $created_at = $updated_at = $cenvertedTime;
    if(!empty($productName)){
        $sql = "insert into sanpham(name,price,thumbnail,content,created_at,updated_at,idDanhMuc)
        values ('$productName','$price','$thumbnail','$content','$created_at','$updated_at','$idDanhMuc')";
        execute($sql);
    }
    else{
        $sql = "insert into danhmuc(name,created_at,updated_at) values('$categoryName','$created_at','$updated_at')";
        execute($sql);
    }
}
function editProduct($id){
    $productName = getPOST('productName');
    $price = getPOST('price');
    $thumbnail = getPOST('thumbnail');
    $content = getPOST('content');
    $startTime = date('Y-m-d H:i:s');
    $cenvertedTime = date('Y-m-d H:i:s',strtotime('+5 hour',strtotime($startTime)));
    $updated_at = $cenvertedTime;
    if(!empty($productName)){
        $sql = "update sanpham set name='$productName',price=$price,thumbnail='$thumbnail',content='$content',updated_at='$updated_at'
        where id = $id";
        execute($sql);
        alert('Đã update thành công!!');
        header('Location:add-product.php');
    }
}