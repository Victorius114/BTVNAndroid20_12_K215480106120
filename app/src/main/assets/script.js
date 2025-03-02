function giaiBac2() {
    var a = parseFloat(document.getElementById("a2").value);
    var b = parseFloat(document.getElementById("b2").value);
    var c = parseFloat(document.getElementById("c2").value);

    if (isNaN(a) || isNaN(b) || isNaN(c)) {
        document.getElementById("resultBac2").innerText = "Vui lòng nhập đầy đủ hệ số";
        return;
    }

    try {
        // Kiểm tra xem AndroidFunction có tồn tại không
        if (typeof AndroidFunction !== "undefined" && AndroidFunction.solve) {
            var result = AndroidFunction.solve(a, b, c);
            document.getElementById("resultBac2").innerText = result;
        } else {
            document.getElementById("resultBac2").innerText = "Lỗi: WebView chưa được kết nối!";
        }
    } catch (error) {
        document.getElementById("resultBac2").innerText = "Lỗi khi gọi phương thức Java!";
    }
}

function return_index() {
    window.location.href = "index.html";
}
