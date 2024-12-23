        // Hàm giải phương trình bậc 1
        function giaiBac1() {
            const a = parseFloat(document.getElementById("a1").value);
            const b = parseFloat(document.getElementById("b1").value);
            if (a === 0) {
                alert("Hệ số a phải khác 0!");
                return;
            }
            const x = -b / a;
            document.getElementById("result1").innerText = `Nghiệm: x = ${x}`;
        }

        // Hàm giải phương trình bậc 2
        function giaiBac2() {
            const a = parseFloat(document.getElementById("a2").value);
            const b = parseFloat(document.getElementById("b2").value);
            const c = parseFloat(document.getElementById("c2").value);
            if (a === 0) {
                alert("Hệ số a phải khác 0!");
                return;
            }
            const delta = Math.pow(b, 2) - 4 * a * c;
            let x1, x2;
            let resultText;

            if (delta > 0) {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                resultText = `Phương trình có hai nghiệm phân biệt: x1 = ${x1}, x2 = ${x2}`;
            } else if (delta === 0) {
                x1 = x2 = -b / (2 * a);
                resultText = `Phương trình có nghiệm kép: x1 = x2 = ${x1}`;
            } else {
                resultText = "Phương trình vô nghiệm.";
            }

            document.getElementById("result2").innerText = resultText;
        }