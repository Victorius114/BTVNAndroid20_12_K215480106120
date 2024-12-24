// Hàm gọi giải phương trình bậc 1 từ Java
function giaiBac1(a, b) {
    try {
        var resultBac1 = giaiPT.PTInterface.bac1(a, b);
        alert("Nghiệm phương trình bậc 1: " + result);
    } catch (e) {
        alert("Lỗi: " + e.message);
    }
}

function giaiBac2(a, b, c) {
    try {
        var resultBac2 = giaiPT.PTInterface.bac2(a, b, c);
        var delta = result[0];
        var x1 = result[1];
        var x2 = result[2];

        // Kiểm tra delta và hiển thị kết quả
        if (delta > 0) {
            alert("Phương trình bậc 2 có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            alert("Phương trình bậc 2 có nghiệm kép: x1 = x2 = " + x1);
        } else {
            alert("Phương trình bậc 2 vô nghiệm thực");
        }
    } catch (e) {
        alert("Lỗi: " + e.message);
    }
}

function return_index(){
    window.location.href = 'index.html';
}
