# language: pt

Funcionalidade: Buscar por endereço ou CEP
  Como um usuário dos Correios
  Eu quero realizar uma busca por endereço ou CEP
  Para que eu possa preencher os dados de envio corretamente

Contexto:
  Dado que estou acessando a aplicação

#Cenário: Deve realizar busca por CEP com sucesso
#  Quando informo o CEP "80020270"
#  E informo o tipo do CEP "Todos"
#  E seleciono Buscar
#  Então recebo o resultado da busca

Cenário: Não deve exibir resultados para busca inválida
  Quando informo o CEP "80020270"
  E informo o tipo do CEP "Todos"
  E seleciono Buscar
  Então recebo o aviso

Cenário: Deve validar regras de busca
  Quando informo o tipo do CEP "Todos"
  E seleciono Buscar
  Então recebo a mensagem

#Contexto:
#  Dado que estou acessando a aplicação
#  Quando informo o usuário "lyene@souza"
#  E a senha "1234"
#  E seleciono entrar
#  Então visualizo a página inicial
#  Quando seleciono Contas
#  E seleciono Adicionar
#
#Esquema do Cenário: Deve validar regras de cadastro de contas
#  Quando informo a conta "<conta>"
#  E seleciono Salvar
#  Então recebo a mensagem <mensagem>
#
#Exemplos:
#  |        conta       |               mensagem               |
#  |   Conta de Teste   |    "Conta adicionada com sucesso!"   |
#  |                    |       "Informe o nome da conta"      |
#  |  Conta mesmo nome  | "Já existe uma conta com esse nome!" |