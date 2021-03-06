var count=0
$('#inputA').click(function () { 
    a=prompt('Nhập A: ')
    count++
});
$('#inputB').click(function () { 
    b=prompt('Nhập B: ')
    count++
});
$('#Result').click(function () {
    if(count==2){
        if(a==0){
            if(b==0){
                alert('Phương trình vô số nghiệm!!')
            }else{
                alert('Phương trình vô nghiệm!!')
            }
        }else{
            x=-b/a;
            alert('Phương trình bậc nhất có nghiệm là '+x)
        }
        count=0
    }else{
        alert('Yêu cầu nhập giá trị đầy đủ!!')
    }
});