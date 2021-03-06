function myFunction() {
    var x = document.getElementById("myLinks");
    if (x.style.display === "block") {
      x.style.display = "none";
    } else {
      x.style.display = "block";
    }
  }
function printDiv(divName) {
  var printContents = document.getElementById(divName).innerHTML;
  var originalContents = document.body.innerHTML;

  document.body.innerHTML = printContents;

  window.print();

  document.body.innerHTML = originalContents;
}
function Hienthi() { 
  document.getElementById('hienthi').style.display = 'none';
  document.getElementById('tintuc1').style.display = 'block';
};

function Binhluan() { 
    var x = document.getElementById('cmt')
    $('#binhluan').append(
      `
      <div class="row">
          <div class="col-md-6">
            <div class="boxcomment">
              ${x.value}
            </div> 
          </div>
        </div>
      `
    );
};