document.getElementById("formCadastroCliente").addEventListener("submit", function(event){
    event.preventDefault();

    fetch('http://localhost:8080/cliente', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ 
            nome: document.getElementById("inputNome").value, 
            email: document.getElementById("inputEmail").value, 
            telefone: document.getElementById("inputTelefone").value, 
            cpf: document.getElementById("inputCpf").value, 
            dataNascimento: document.getElementById("inputDataNascimento").value
        })
    }).then(r => {
        alert("Chamei a API");
        console.log(r);
    });
});