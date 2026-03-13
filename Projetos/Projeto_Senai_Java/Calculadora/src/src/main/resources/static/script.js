// Função para adicionar números e operadores ao visor
function addValor(valor) {
    console.log("Botão clicado: " + valor);
    const display = document.getElementById("display");
    
    if (display) {
        display.value += valor;
    } else {
        console.error("Erro: O elemento com id 'display' não foi encontrado!");
    }
}

// Função para limpar o visor e o texto de resultado
function limpar() {
    console.log("Limpando visor...");
    const display = document.getElementById("display");
    const resultadoDiv = document.getElementById("resultado");
    
    if (display) display.value = "";
    if (resultadoDiv) resultadoDiv.innerText = "";
}

// Envia a conta para o Spring Boot
async function enviarCalculo() {
    const display = document.getElementById("display");
    const resultadoDiv = document.getElementById("resultado");
    const expressao = display.value;

    console.log("Enviando expressão: " + expressao);
    
    if (!expressao) {
        alert("Digite uma conta primeiro!");
        return;
    }

    try {
        
        // Faz a chamada para o Controller
        const resposta = await fetch("/calcular", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ expressao: expressao })
        });

        // Verifica se o servidor respondeu com erro
        if (!resposta.ok) {
            throw new Error("Erro na resposta do servidor: " + resposta.status);
        }

        const dados = await resposta.json();

        // Atualiza o visor e a div de resultado com a resposta do Java
        display.value = dados.resultado;
        resultadoDiv.innerText = "Resultado: " + dados.resultado;
        console.log("Sucesso! Resultado recebido: " + dados.resultado);

    } catch (erro) {
        console.error("Erro ao conectar com o back-end:", erro);
        resultadoDiv.innerText = "Erro: Servidor Offline";
    }

}
