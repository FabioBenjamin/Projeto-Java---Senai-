function addValor(valor) {
    document.getElementById("display").value += valor;
}

function limpar() {
    document.getElementById("display").value = "";
    document.getElementById("resultado").innerText = "";
}

// Envia para o back-end
async function enviarCalculo() {
    const expressao = document.getElementById("display").value;

    try {
        const resposta = await fetch("/calcular", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ expressao: expressao })
        });

        const dados = await resposta.json();
        document.getElementById("resultado").innerText =
            "Resultado: " + dados.resultado;

    } catch (erro) {
        document.getElementById("resultado").innerText =
            "Erro ao calcular";
    }
}
