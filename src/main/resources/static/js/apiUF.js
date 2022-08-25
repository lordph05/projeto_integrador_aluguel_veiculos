const url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados?orderBy=nome";
const loadingElement = document.querySelector("#estado")
 

async function api(){
    const reponse = await fetch(url);

    const data = await reponse.json();

    data.map((uf) => {
        const option = document.createElement('option')
        
        console.log(uf)

        option.innerHTML = uf.sigla;
        loadingElement.appendChild(option);

    })
}

api()