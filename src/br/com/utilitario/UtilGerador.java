/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utilitario;

/**
 *
 * @author david.maria
 */
public class UtilGerador {

    public static String sortearEditora() {
        String editoraGerada = "";
        String[] editoras = {"Pearson", "RELX Group", "ThomsonReuters", "Bertelsmann", "Wolters Kluwer", "Hachette Livre", "Grupo Planeta", "Springer Nature", "Saraiva", "Senac São Paulo",
            "Novatec", "Oracle", "Abril", "Aleph", "Super Interessante", "Caellum", "Suma de Letras", "FTD", "Editora Record", "Companhia da Letras.",
            "do Pomar", "Tapera", "dos Anjos", "Silva Sauro", "Orson", "Campos"};

        int indice1 = (int) (Math.random() * editoras.length);
        editoraGerada += editoras[indice1];

        return editoraGerada;
    }

    public static String gerarDescricao() {
        String descricao = "";
        String[] descricoes = {"Django é um framework web para perfeccionistas com prazos de entrega, projetado para ajudar você a criar projetos web gerenciáveis, de médio e grande"
            + " portes, em um curto período. Esta quarta edição, Desenvolvimento Web com Django 3 Cookbook, foi atualizada com os recursos mais recentes de Django 3 para orientá-lo"
            + " no processo de desenvolvimento, de modo eficaz. ",
            "O livro orientará você no processo de uploading e processamento de imagens, na renderização de dados em HTML5, PDF e Excel, no uso e na criação de APIs"
            + " e na navegação por diferentes tipos de dados em Django.",
            " Esta edição o ajudará a trabalhar não só com o banco de dados PostgreSQL, mas também com o MySQL.",
            "Projetos de ciência de dados com Python foi pensado para oferecer orientação prática sobre ferramentas padrão para análise de dados e machine learning"
            + " em Python com a ajuda de dados reais. O curso o ajudará a entender como usar pandas e o Matplotlib para examinar criticamente um dataset com sínteses estatísticas"
            + " e gráficos e extrair os insights que deseja obter.",
            "Uma introdução completa ao Flask: explore o básico sobre o desenvolvimento de aplicações web com o Flask e conheça uma estrutura apropriada para aplicações de médio e grande portes.",
            "Desenvolvimento do Flasky: aprenda a desenvolver, passo a passo, uma aplicação de blogging de código aberto, reutilizando templates, colocando itens de lista em páginas e trabalhando "
            + "com rich text.",
            "Curso Intensivo de Python é uma introdução completa e em ritmo acelerado à linguagem Python, que fará você escrever programas, resolver problemas e criar soluções que"
            + " funcionarão em um piscar de olhos.",
            "Na primeira metade do livro você conhecerá os conceitos básicos de programação, como listas, dicionários, classes e laços, e praticará a escrita de códigos limpos e legíveis, com exercícios para cada assunto."
        };

        int indice1 = (int) (Math.random() * descricoes.length);
        descricao += descricoes[indice1];

        return descricao;
    }

    public static String gerarNome() {
        String nomeGerado = "";
        String[] sobrenomes = {"Silva", "Souza", "Lucas", "Hoffman", "Maria", "Conceição", "da Silva", "da Luz", "Joaquim", "Luiz Inácio",
            "Kronnus", "Cassol", "da Lagoa", "Farias", "Torrone", "Pé de Feijão", "Querubin", "Pobre", "Destri", "Carrito",
            "do Pomar", "Tapera", "dos Anjos", "Silva Sauro", "Orson", "Campos"};
        String[] nomes = {"Alice", "Bianca", "Cyntia", "Daiana", "Ester", "Fernanda", "Gabriela", "Hanna", "Inácia", "Juliani",
            "Karen", "Leticia", "Marianne", "Nicole", "Olivia", "Pricila", "Quenia", "Raquel", "Sabrina", "Tuane",
            "Uvalina", "Vanessa", "Wacari", "Xuxa", "Yanne", "Zinna", "André", "Adilson", "Carlos", "David", "Eduardo", "Fernando", "Gustavo", "Henrique", "Inácio", "João",
            "Kevin", "Lucas", "Marcos", "Nicholas", "Otavio", "Paulo", "Querubin", "Rico", "Saulo", "Thiago",
            "Ulisses", "Victor", "Wagner", "Xico", "York", "Zucatto"};

        int indice1 = (int) (Math.random() * sobrenomes.length);
        int indice2 = (int) (Math.random() * nomes.length);
        nomeGerado += nomes[indice2] + " " + sobrenomes[indice1];

        return nomeGerado;
    }

    public static int gerarNumInteiro(int qtd) {
        int numero;
        String numeroGerado = "";
        for (int i = 0; i < qtd; i++) {
            numero = (int) ((Math.random() * 9)+1);
            numeroGerado += numero;
        }
        numero = Integer.parseInt(numeroGerado);
        return numero;
    }

    public static String gerarNumInteiro(String qtdNumero) {
        int numero;
        int qtd = Integer.parseInt(qtdNumero);
        String numeroGerado = "";
        for (int i = 0; i < qtd; i++) {
            numero = (int) (Math.random() * 10);
            numeroGerado += numero;
        }
        return numeroGerado;
    }

    public static String gerarEmail(String dominio) {
        String emailGerado = gerarNome() + "@" + dominio + ".com.br";
        return emailGerado;
    }

    public static String gerarTelefone() {
        String telefone = "(48)3" + gerarNumInteiro(3) + "-" + gerarNumInteiro(4);

        return telefone;
    }

    public static int criarNumeroAleatorioEntre2Valores(int menor, int maior) {
        int numero = (int) (Math.random() * (maior - menor));
        if (numero == 0) {
            numero++;
        }
        numero += menor;
        return numero;
    }

    public static String gerarLogin() {
        String login = "";
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "x","y", "z"};
        int indice;
        for (int i = 0; i < UtilGerador.criarNumeroAleatorioEntre2Valores(5, 10); i++) {
            indice = (int) (Math.random() * letras.length);
            login += letras[indice];
        }
        return login;
    }

    public static String gerarSenha() {
        String senha = "";
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "z"};
        int indice = 0;
        for (int i = 0; i < UtilGerador.criarNumeroAleatorioEntre2Valores(5, 10); i++) {
            indice = (int) (Math.random() * letras.length);
            senha += letras[indice];
        }
        return senha;
    }
    
      public static String gerarTipoVeiculo() {
        int indice;
        String[] nomes = {"Moto","Automóvel","Caminhão","Ônibus"};
        indice = (int) (Math.random() * nomes.length);
        return nomes[indice];
    }
      
    public static String gerarPlaca() {
        String placa = "";
        int indice;
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z"};
        for (int i = 0; i < 3; i++) {
            indice = (int) (Math.random() * letras.length);
            placa += letras[indice];
        }
        placa += "-"+gerarNumInteiro(4);
        return placa;
    }  
    
    public static String gerarModelo() {
        String modelo = "";
        String[] modelos = {"Meriva", "Spin", "Onix", "Civic", "HRV", "CRV", "FIT", "Tracker", "Eco Sport", "Mustang",
            "Soul", "Cerato", "GLA200"};
        int indice = (int) (Math.random() * modelos.length);
        modelo += modelos[indice];

        return modelo;
    }
    public static String gerarFabricante() {
        String fabricante = "";
        String[] fabricantes = {"FIAT", "MERCEDES", "FORD", "GM", "HONDA", "KIA"};
        int indice = (int) (Math.random() * fabricantes.length);
        fabricante += fabricantes[indice];
        return fabricante;
    }
    
    public static int gerarAnoAutomovel() {
        String ano = "20";
        ano += (int) (Math.random() * 3);
        if (ano.equals("202")){
            ano += (int) (Math.random() * 2);
        } else {
            ano += (int) (Math.random() * 10);
        }
        return Integer.parseInt(ano);
    }
    
    public static String gerarCidade() {
        String cidade = "";
        String[] cidades = {"Florianópolis", "Lajes", "São Joaquim", "Laguna", "Criciuma", "Curitiba", "Balneariu Camburiu"};
        int indice = (int) (Math.random() * cidades.length);
        cidade += cidades[indice];

        return cidade;
    }
    
    public static String gerarBairro() {
        String bairro = "";
        String[] bairros = {"Capoeiras", "Centro", "Campinas", "Canto", "Forquilhinhas", "São Sebastião", "Aririu"};
        int indice = (int) (Math.random() * bairros.length);
        bairro += bairros[indice];

        return bairro;
    }    

    public static String gerarEstado() {
        String estado = "";
        String[] estados = {"Santa Catarina", "Rio do Sul", "Paraná", "São Paulo"};
        int indice = (int) (Math.random() * estados.length);
        estado += estados[indice];

        return estado;
    }
    
     public static String gerarLogradouro() {
        String logradouro = "";
        String[] logradouros = {"Paula Ramos", "Fermino Costa", "Coronel Joaquim", "Felipe Shimidt", "Rosa Silva", "Jardim Silva", "4 de março", "Sem Saída", "Em construção", "Felicidade e harmonia"};
        int indice = (int) (Math.random() * logradouros.length);
        logradouro += logradouros[indice];

        return logradouro;
    }
}
