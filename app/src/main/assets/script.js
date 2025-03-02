async function giaiBac2(aElement, bElement, cElement) {
    const a = parseFloat(aElement.value);
    const b = parseFloat(bElement.value);
    const c = parseFloat(cElement.value);

    if (isNaN(a) || isNaN(b) || isNaN(c)) {
        document.getElementById("resultBac2").innerText = "Vui lòng nhập đầy đủ hệ số";
        return;
    }

    try {
        const response = await fetch("http://localhost:8080/solve", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ a, b, c })
        });

        const result = await response.json();
        document.getElementById("resultBac2").innerText = result.message;
    } catch (error) {
        document.getElementById("resultBac2").innerText = "Lỗi kết nối đến server";
    }
}

function return_index() {
    window.location.href = "index.html";
}
