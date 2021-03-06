var count=0;
function Productbox() {
    var productTag=document.getElementById('product');
    if(count%2==0){
        productTag.innerHTML=`
        <div class="list-group">
            <a href="#" class="list-group-item list-group-item-action">Bếp Từ</a>
            <a href="#" class="list-group-item list-group-item-action">Bếp Điện Từ</a>
            <a href="#" class="list-group-item list-group-item-action">Máy Hút Mùi</a>
            <a href="#" class="list-group-item list-group-item-action">Lò Vi Sóng</a>
            <a href="#" class="list-group-item list-group-item-action">Máy Sấy Bát</a>
            <a href="#" class="list-group-item list-group-item-action">Lò Nướng</a>
            <a href="#" class="list-group-item list-group-item-action">Máy Rửa Chén</a>
            <a href="#" class="list-group-item list-group-item-action">Bếp Gas Âm</a>
            <a href="#" class="list-group-item list-group-item-action">Máy Lọc Nước</a>
            <a href="#" class="list-group-item list-group-item-action">Phụ Kiện Rửa Bếp</a>
            <a href="#" class="list-group-item list-group-item-action">Chậu Rửa</a>
            <a href="#" class="list-group-item list-group-item-action">Vòi Rửa</a>
            <a href="#" class="list-group-item list-group-item-action">Nồi Chiên Không Dầu</a>
            <a href="#" class="list-group-item list-group-item-action">Bộ Nồi</a>
        </div>
        `
        count++;
    }else{
        productTag.innerHTML=``
        count++;
    }
}
    $('.topbar').css('background-color','blanchedalmond')