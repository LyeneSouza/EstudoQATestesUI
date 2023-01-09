# DESAFIO DO MÓDULO 4 #

Testes funcionais utilizando Selenium Webdriver

### Desafio ###

O impulsionando deverá construir os testes funcionais para o site de buscas de CEP dos correios conforme as funcionalidades descritas nos requisitos.

### Descrição ###

Deverá ser entregue um projeto com os testes automatizados com Selenium Webdriver a partir das funcionalidades descritas. 
Para construir os testes utilize o site : https://buscacepinter.correios.com.br/app/endereco/index.php

### Requisitos e Funcionalidades Esperadas ###

- [ ] Construir os testes automatizados conforme as funcionalidades listadas.
	- [ ] 1. **Funcionalidade 1**: Busca por endereço ou CEP 
		* Deverá ser permitido buscar por endereço OU Cep 
		* O cep ou endereço é um campo obrigatório
    	* Após apresentar o resultado deverá permitir fazer Nova busca 
	- [ ] 2. **Funcionalidade 2** : Fazer a busca Por Localidade / Logradouro
		* A busca deverá retornar o cep da combinação inserida nos filtros 
		* Deverá permitir fazer nova busca 
		* Validar o preenchimento dos campos obrigatórios  
		* O campo localidade deve possuir um "?" E listar as localidades , considerando a localidade como cidade 
		* O campo logradouro corresponde ao endereço como por exemplo Rua/ Avenida  que estão listadas na combo tipo

- [ ] Criar todos os cenários para as funcionalidades solicitadas.
- [ ] Utilizar BDD(Gerkin) com Cucumber nas escritas dos cenários.
- [ ] O teste deverá ser desenvolvido usando Selenium Webdriver – Java – Junit;
- [ ] Usar padrões de mercado como PageObject 
- [ ] Criar um README.md contendo as orientações para rodar a aplicação e suas dependências pela linha de comando.

### Bônus ###

- [ ] Criar a esteira de integração CI/CD dos testes, entregue o arquivo do Jenkinsfile junto ao projeto.

### Instruções para Realização do Desafio ###
1. Faça um *fork* desse repositório para a sua conta
2. Implemente a sua solução conforme solicitado
3. Compartilhe o link do projeto com o seu mentor 

***
## Critérios de Avaliação ##
* Todos os testes estão passando?
* Os testes foram implementados conforme o que foi solicitado no desafio?
* Pode ser claramente entendido e o que o código faz?
* A estrutura do código é modular o suficiente?
* O código da aplicação está com nomes intuitivos de funções, variáveis ou classes?
* O escopo das variáveis de classes estão sendo utilizados de forma adequada?
* Existe alguma variável não inicializada?
* Foi realizado algum tratamento de exceções?
* O projeto possui design patterns  PageObject e está implementado conforme?
* No mapeamento dos elementos está considerando os melhores locators?
* Os cenários foram bem descritos em BDD e utilizando Cucumber?
* Existem pré condições descritas como contextos no BDD?
* Os cenários possuem Esquema de cenário para executar exemplos N vezes descrito em seu escopo?
* [Bônus] Foi entregue o arquivo de Jenkinsfile junto com o projeto?
* [Bônus] Os testes estão executando corretamente na Pipe?
* Existe um readme contendo instruções de como rodar a aplicação?
      
      
