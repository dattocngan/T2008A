<?php
$searchTitle = "";
if(!empty($_POST)){
    $searchTitle = getPOST('searchTitle');
    if(!empty($searchTitle)){
        header('Location: main.php?searchTitle='.$searchTitle);
    }else{
        header('Location: main.php');
    }
}