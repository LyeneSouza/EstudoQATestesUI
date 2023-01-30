# DESAFIO DO MÓDULO 4 #

Testes funcionais utilizando Selenium Webdriver.

### Desafio ###

Trata-se de um projeto contendo os testes funcionais para o site de buscas de CEP dos Correios.

### Descrição ###

Foram utilizadas as páginas: 
```shell
https://buscacepinter.correios.com.br/app/endereco/index.php
```
```shell
https://buscacepinter.correios.com.br/app/localidade_logradouro/index.php
```

## Projeto Selenium Webdriver ##

### O que você precisa ter instalado para rodar a aplicação `versões utilizadas no desenvolvimento` ###
- Java JDK 1.8 `Java version: 1.8.0_202`
- Maven `Apache Maven 3.8.6`
- Google Chrome `Versão 109.0.5414.120`
- ChromeDriver `109.0.5414.74`
> É necessário adicionar o executável do Maven e do ChromeDriver nas variáveis de ambiente do Sistema Operacional.

### Como rodar o projeto via linha de comando ###
- Fazer o clone do projeto e entrar na respectiva pasta
```shell
cd "diretório de sua preferência"
git clone https://LyeneS@bitbucket.org/lyenes/desafio-qa-modulo4.git
cd desafio-qa-modulo4/Desafio4/
```
- Compilar
```shell
mvn clean compile
```
- Executar os testes
```shell
mvn test
```

## Bônus ##

### Como rodar utilizando o Jenkins ###
- Ter o Jenkins instalado
- Criar uma pipeline
- Configurar a pipeline para acessar este repositório e ter acesso ao Jenkinsfile
- Rodar o build da pipeline