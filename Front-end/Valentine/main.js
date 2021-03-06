$('#wrongButton').click(function () { 
    alert('IQ của bạn đã giảm đi 1 đơn vị!!!')
});

$('.box1').click(function () { 
    $( this ).css( "background-color", "rgba(72, 143, 1, 0.692)" );
    $( this ).css( "border", "rgba(72, 143, 1, 0.692)" );
    $( '.box2' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box2' ).css( "border", "1px solid black" );
    $( '.box3' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box3' ).css( "border", "1px solid black" );
    $( '.box4' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box4' ).css( "border", "1px solid black" );
});
var check = 0;
$('.box2').click(function () { 
    $( this ).css( "background-color", "rgba(72, 143, 1, 0.692)" );
    $( this ).css( "border", "rgba(72, 143, 1, 0.692)" );
    $( '.box1' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box1' ).css( "border", "1px solid black" );
    $( '.box3' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box3' ).css( "border", "1px solid black" );
    $( '.box4' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box4' ).css( "border", "1px solid black" );
});
$('.box3').click(function () { 
    $( this ).css( "background-color", "rgba(72, 143, 1, 0.692)" );
    $( this ).css( "border", "rgba(72, 143, 1, 0.692)" );
    $( '.box1' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box1' ).css( "border", "1px solid black" );
    $( '.box2' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box2' ).css( "border", "1px solid black" );
    $( '.box4' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box4' ).css( "border", "1px solid black" );
});
$('.box4').click(function () { 
    $( this ).css( "background-color", "rgba(72, 143, 1, 0.692)" );
    $( this ).css( "border", "rgba(72, 143, 1, 0.692)" );
    $( '.box1' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box1' ).css( "border", "1px solid black" );
    $( '.box3' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box3' ).css( "border", "1px solid black" );
    $( '.box2' ).css( "background-color", " rgb(228, 146, 116)"  );
    $( '.box2' ).css( "border", "1px solid black" );
});

$('.correct').click(function () { 
   check = 1;
});

$('.wrong').click(function () { 
    check = 0;
});

$('.deal').click(function () { 
    if( check == 1 ){
        alert('Yêu em!!')
        $('.next').css("display", "block")
        check = 0
    } 
    else alert('Sai bét!!')
});
 
