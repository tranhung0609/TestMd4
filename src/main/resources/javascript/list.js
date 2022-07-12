document.getElementById("content").innerHTML = `
<br>
<br>
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" style="margin-left: 10px">
 Add
</button>
<br>
<br>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Thêm Thành phố</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <label for="">Tên</label>
        <input type="text"class="form-control" >
        <label for="">Quốc Gia</label>
        <input type="text"class="form-control" >
        <label for="">Diện Tích</label>
        <input type="number"class="form-control" >
        <label for="">Dân Số</label>
        <input type="number"class="form-control" >
        <label for="">GDP</label>
        <input type="number"class="form-control" >
        <label for="">Giới thiệu</label>
        <input type="text"class="form-control" >
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>


<table class="table">
  <thead>
    <tr style="text-align: center">
      <th scope="col">#</th>
      <th scope="col">Thành Phố</th>
      <th scope="col">Quốc Gia</th>
    </tr>
  </thead>
  <tbody id="list">
  </tbody>
</table>
`
let tbody = document.getElementById("list");
$.ajax({
    type: "GET",
    url: "http://localhost:8888/api/cities",
    success: function (list) {
        let str = "";
        for (let i = 0; i < list.length; i++) {
            str += `<tr style="text-align: center">
            <th scope="row">${i + 1}</th>
            <td>${list[i].name}</td>
            <td>${list[i].country.name}</td>
  
           
            </tr>`
        }
        tbody.innerHTML = str;
    },error: function (error) {
        console.log(error);
    }
})