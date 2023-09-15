
# Criação das entidades e sistemas de persistência

OBJETIVO: IMPLEMENTAÇÃO DE UM CADASTRO DE CLIENTES EM MODO TEXTO, COM PERSISTÊNCIA EM ARQUIVOS, BASEADO NA TECNOLOGIA JAVA.


##Conteúdo

    Estrutura do Projeto
    Instruções de Uso
    Análise e Conclusão

    

## O projeto é composto por várias classes que desempenham papéis específicos:

    Pessoa: Classe base que contém informações comuns a todas as pessoas, como ID e nome.
    PessoaFisica: Subclasse de Pessoa que adiciona informações específicas de pessoas físicas, como CPF e idade.
    PessoaFisicaRepo: Classe que gerencia o armazenamento e a recuperação de pessoas físicas em um arquivo.
    PessoaJuridica: Subclasse de Pessoa que adiciona informações específicas de pessoas jurídicas, como CNPJ.
    PessoaJuridicaRepo: Classe que gerencia o armazenamento e a recuperação de pessoas jurídicas em um arquivo.
    CadastroPOO: Classe principal que demonstra como usar todas as outras classes para realizar operações de cadastro.


## Instruções de Uso

Siga estas instruções para executar e utilizar o sistema de cadastro de pessoas:

    Clone o Repositório: Clone este repositório para a sua máquina local.

    Compile o Código: Certifique-se de que você tenha uma IDE Java instalada, como o NetBeans ou o Eclipse, e importe o projeto. Compile o código para garantir que não haja erros de compilação.

    Execute a Classe CadastroPOO: Esta é a classe principal do projeto. Execute-a a partir da sua IDE.

    Interaja com o Sistema: Após a execução, o sistema exibirá um menu de opções no console. Você pode escolher entre inserir, alterar, excluir, buscar, exibir todos os registros, persistir dados em arquivos e recuperar dados de arquivos.

    Persistência em Arquivos: O sistema permite que você persista os dados em arquivos para que possam ser recuperados posteriormente. Certifique-se de usar as opções apropriadas para persistir e recuperar dados conforme necessário.

    Finalize o Programa: Quando terminar de usar o sistema, escolha a opção para finalizar o programa no menu.


## Análise e Conclusão

O sistema de cadastro de pessoas em Java demonstra a utilização de classes, herança, persistência de dados em arquivos e interação com o usuário por meio do console. Ele organiza eficientemente as operações de cadastro e separa a lógica de armazenamento da lógica de negócios, facilitando a manutenção e a expansão do código.

Além disso, a utilização de classes de repositório (PessoaFisicaRepo e PessoaJuridicaRepo) contribui para a organização do código, promovendo a reutilização de código e a abstração da camada de armazenamento.

Este projeto pode ser um ponto de partida para sistemas mais complexos de gerenciamento de dados em Java, com a possibilidade de adicionar mais funcionalidades e melhorias.

Divirta-se explorando e personalizando este exemplo de cadastro de pessoas em Java!

