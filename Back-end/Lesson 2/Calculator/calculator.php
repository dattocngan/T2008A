<!doctype html>
<html lang="en">

<head>
    <title>Calculator Made By Dat Nguyen</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <style>
        body{
            background: linear-gradient(to right, red, blue);
        }
        *{
            color: #fff;
            font-size: 30px;
            font-weight: lighter;
        }
        .table {
            width: 50% !important;
            margin: 10px auto;
        }
        .moregrey{
            background-color: grey;
        }
        #result {
            text-align: right;
            background-color: #5d5c5c;
        }
        td{
            text-align: center;
            width: 25%;
        }
        td:hover{
            cursor: pointer;
        }
        td{
            background-color: #afadad;
        }
        td:last-child{
            background-color: orange !important;
        }
        .table-bordered td, .table-bordered th{
            border-color: black !important;
        }
    </style>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <table class="table table-bordered">
            <tr>
                <th colspan="4" id="result">0</th>
            </tr>
            <tr>
                <td class="moregrey" onclick="AC()">AC</td>
                <td class="moregrey">+/_</td>
                <td class="moregrey" onclick="Mod()">%</td>
                <td onclick="Divide()">÷</td>
            </tr>
            <tr>
                <td onclick="Number7()">7</td>
                <td onclick="Number8()">8</td>
                <td onclick="Number9()">9</td>
                <td onclick="Multiple()">x</td>
            </tr>
            <tr>
                <td onclick="Number4()">4</td>
                <td onclick="Number5()">5</td>
                <td onclick="Number6()">6</td>
                <td onclick="Minus()">-</td>
            </tr>
            <tr>
                <td onclick="Number1()">1</td>
                <td onclick="Number2()">2</td>
                <td onclick="Number3()">3</td>
                <td onclick="Plus()">+</td>
            </tr>
            <tr>
                <td colspan="2" onclick="Number0()">0</td>
                <td onclick="ThapPhan()">.</td>
                <td onclick="Result()">=</td>
            </tr>
        </table>
    </div>
    <!-- Optional JavaScript -->
    <script>
        var result = document.getElementById('result');
        var check = 0;
        function AC(){
            check = 0;
            result.textContent = '0';
        }
        function Number0(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '0';
        }
        function Number1(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '1';
        }
        function Number2(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '2';
        }
        function Number3(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '3';
        }
        function Number4(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '4';
        }
        function Number5(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '5';
        }
        function Number6(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '6';
        }
        function Number7(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '7';
        }
        function Number8(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '8';
        }
        function Number9(){
            if(check == 0){
                result.textContent = '';
                check++;
            }
            result.textContent += '9';
        }
        function ThapPhan(){
            result.textContent += '.';
        }
        var num1, pheptinh;
        function Multiple(){
            check = 0;
            num1 = result.textContent;
            pheptinh = '*';
        }
        function Mod(){
            check = 0;
            num1 = result.textContent;
            pheptinh = '%';
        }
        function Divide(){
            check = 0;
            num1 = result.textContent;
            pheptinh = '/';
        }
        function Minus(){
            check = 0;
            num1 = result.textContent;
            pheptinh = '-';
        }
        function Plus(){
            check = 0;
            num1 = result.textContent;
            pheptinh = '+';
        }
        var num2;
        function Result(){
            check = 0;
            num2 = result.textContent;
            num1 = parseFloat(num1);
            num2 = parseFloat(num2);
            if(pheptinh == '*'){
                result.textContent = num1*num2;
            }else if(pheptinh == '-'){
                result.textContent = num1-num2;
            }else if(pheptinh == '+'){
                result.textContent = num1+num2;
            }else if(pheptinh == '/'){
                result.textContent = num1/num2;
            }else if(pheptinh == '%'){
                result.textContent = num1%num2;
            }
        }
    </script>
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>

</html>