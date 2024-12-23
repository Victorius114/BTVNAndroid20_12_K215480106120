function giaiBac1() {
    if (typeof PTSolver !== "undefined") {
        var a = parseFloat(document.getElementById("a1").value);
        var b = parseFloat(document.getElementById("b1").value);

        // Gọi phương thức từ Java để giải phương trình bậc 1
        var result = PTSolver.bac1(a, b);

        document.getElementById("result1").innerHTML = "Nghiệm: " + result;
    } else {
        console.log("PTSolver is not defined.");
    }
}

function giaiBac2() {
    if (typeof PTSolver !== "undefined") {
        var a = parseFloat(document.getElementById("a2").value);
        var b = parseFloat(document.getElementById("b2").value);
        var c = parseFloat(document.getElementById("c").value);

        // Gọi phương thức từ Java để giải phương trình bậc 2
        var result = PTSolver.bac2(a, b, c);

        if (result[0] >= 0) {
            document.getElementById("result2").innerHTML = "Delta: " + result[0] + "<br/>Nghiệm x1: " + result[1] + "<br/>Nghiệm x2: " + result[2];
        } else {
            document.getElementById("result2").innerHTML = "Phương trình vô nghiệm!";
        }
    } else {
        console.log("PTSolver is not defined.");
    }
}

function return_index(){
    window.location.href = 'index.html';
}
