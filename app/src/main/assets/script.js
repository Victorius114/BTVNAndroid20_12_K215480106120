function solveBac1() {
    const a = parseFloat(document.getElementById("a1").value);
    const b = parseFloat(document.getElementById("b1").value);

    if (a === 0) {
        alert("Hệ số a phải khác 0!");
        return;
    }

    // Gọi hàm solveBac1 từ Java
    const result = PTSolver.solveBac1(a, b);
    document.getElementById("result1").innerText = `Nghiệm: x = ${result}`;
}

function solveBac2() {
    const a = parseFloat(document.getElementById("a2").value);
    const b = parseFloat(document.getElementById("b2").value);
    const c = parseFloat(document.getElementById("c2").value);

    if (a === 0) {
        alert("Hệ số a phải khác 0!");
        return;
    }

    // Gọi hàm solveBac2 từ Java
    const result = PTSolver.solveBac2(a, b, c);

    const delta = result[0];
    const x1 = result[1];
    const x2 = result[2];
    let resultText;

    if (delta > 0) {
        resultText = `Phương trình có hai nghiệm phân biệt: x1 = ${x1}, x2 = ${x2}`;
    } else if (delta === 0) {
        resultText = `Phương trình có nghiệm kép: x1 = x2 = ${x1}`;
    } else {
        resultText = "Phương trình vô nghiệm.";
    }

    document.getElementById("result2").innerText = resultText;
}

function return_index(){
    location.href = 'index.html';
}