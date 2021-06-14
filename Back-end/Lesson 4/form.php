<?php
require_once('database-helper.php');

if(!empty($_POST)){
    $action = getPOST('action');
    $id = getPOST('id');
    switch($action){
        case 'delete':
            deleteStudent($id);
            break;
        default:
            addStudent();
            break;
    }
}

function addStudent(){
    $fullname = getPOST('fullname');
    $age = getPOST('age');
    $address = getPOST('address');
    $startTime = date('Y-m-d H:i:s');
    $cenvertedTime = date('Y-m-d H:i:s',strtotime('+5 hour',strtotime($startTime)));
    $created_at = $updated_at = $cenvertedTime;
    if(!empty($fullname)){
        $sql = "insert into student(fullname,age,address,created_at,updated_at) values ('$fullname',$age,'$address','$created_at','$updated_at')";
        execute($sql);
    }
}
function deleteStudent($id){
    $sql = "delete from student where id = $id";
    execute($sql);
}