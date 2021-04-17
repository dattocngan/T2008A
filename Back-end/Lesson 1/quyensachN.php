<?php
$array=[];
$n = rand(0,100);
for ($i=1; $i < $n ; $i++) { 
    $array['Quyển sách ' . $i]['Tên'] = 'quyển sách ' .$i;
    $array['Quyển sách ' . $i]['Tác giả'] = 'tác giả ' .$i;
    $array['Quyển sách ' . $i]['Giá'] = $i . '00';
    $array['Quyển sách ' . $i]['Nhà xuất bản'] = 'nhà xuất bản ' .$i;
}
foreach ($array as $key => $value) {
    echo $key . ':' . '<br>';
    foreach($value as $key1 => $value1){
        echo '&nbsp -' . $key1 . ': ' . $value1;
        echo '<br>';
    }
    echo '<br>';
}