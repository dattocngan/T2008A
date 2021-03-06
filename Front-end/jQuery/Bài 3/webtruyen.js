var dem=0
$(function() {
    if(localStorage.getItem('soluong')>=1){
        dem=localStorage.getItem('soluong')
        localStorage.setItem('dem_db',dem)
        for(i=1;i<=localStorage.getItem('soluong');i++){
            $('.row').append(`
            <div class="col-sm-3">
            <div class="sanpham">
            <div class="tieude">
                <div>${localStorage.getItem('title_db'+i)}</div>
            </div>
            <div class="diem">
                <div>${localStorage.getItem('mark_db'+i) + ' điểm vote'}</div>
            </div>
            <div class="anh">
                <img src="${localStorage.getItem('photo_db'+i)}" alt="" style="width: 100%;height: 100%;">
            </div>
            <div class="luotxem">
                <div>${localStorage.getItem('view_db'+i) + ' lượt xem'}</div>
            </div>
            </div>
        </div>
            `);
        }
    }
})
var count=0
$('#upload').click(function () { 
    var title=$('#title').val();
    var photo=$('#photo').val();
    var mark=$('#mark').val();
    var view=$('#view').val();
    $('.row').append(`
    <div class="col-sm-3">
    <div class="sanpham">
      <div class="tieude">
        <div>${title}</div>
      </div>
      <div class="diem">
        <div>${mark+' điểm vote'}</div>
      </div>
      <div class="anh">
        <img src="${photo}" alt="" style="width: 100%;height: 100%;">
      </div>
      <div class="luotxem">
        <div>${view+' lượt xem'}</div>
      </div>
    </div>
  </div>
    `);
    count++;
    localStorage.setItem('dem_db',dem)
    localStorage.setItem('soluong',count+ parseInt(localStorage.getItem('dem_db')))
    localStorage.setItem('title_db'+(count+ parseInt(localStorage.getItem('dem_db'))),title)
    localStorage.setItem('photo_db'+(count+ parseInt(localStorage.getItem('dem_db'))),photo)
    localStorage.setItem('mark_db'+(count+ parseInt(localStorage.getItem('dem_db'))),mark)
    localStorage.setItem('view_db'+(count+ parseInt(localStorage.getItem('dem_db'))),view)
    $('#title').val('')
    $('#photo').val('')
    $('#mark').val('')
    $('#view').val('')
});
