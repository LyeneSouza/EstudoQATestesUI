# language: pt

Funcionalidade: Buscar por endereço ou CEP
  Como um usuário dos Correios
  Eu quero realizar uma busca por endereço ou CEP
  Para que eu possa preencher os dados de envio corretamente

Contexto:
  Dado que estou acessando a aplicação

#Cenário: Deve realizar busca por todos os tipos de CEP com sucesso
#  Quando informo o CEP "80020270"
#  E informo o tipo do CEP "Todos"
#  E seleciono Buscar
#  Então recebo, como resultado, o nome "Rua Treze de Maio - até 469/470"
#
#Cenário: Deve realizar busca por CEP do tipo "Localidade/Logradouro" com sucesso
#  Quando informo o CEP "80020270"
#  E informo o tipo do CEP "Localidade/Logradouro"
#  E seleciono Buscar
#  Então recebo, como resultado, o nome "Rua Treze de Maio - até 469/470"
#
#Cenário: Deve realizar busca por CEP do tipo "CEP Promocional" com sucesso
#  Quando informo o CEP "05909960"
#  E informo o tipo do CEP "CEP Promocional"
#  E seleciono Buscar
#  Então recebo, como resultado, o nome "Baú da Felicidade da Jequiti"
#
#Cenário: Deve realizar busca por CEP do tipo "Caixa Postal Comunitária" com sucesso
#  Quando informo o CEP "30666990"
#  E informo o tipo do CEP "Caixa Postal Comunitária"
#  E seleciono Buscar
#  Então recebo, como resultado, o nome "Rua Duzentos e Oitenta e Um CPC Conselho Regional de Apoio Social"
#
#Cenário: Deve realizar busca por CEP do tipo "Grande Usuário" com sucesso
#  Quando informo o CEP ""
#  E informo o tipo do CEP "Grande Usuário"
#  E seleciono Buscar
#  Então recebo, como resultado, o nome ""
#
#Cenário: Não deve exibir resultados para busca inválida
#  Quando informo o CEP "80020270"
#  E informo o tipo do CEP "CEP Promocional"
#  E seleciono Buscar
#  Então recebo o aviso "Não há dados a serem exibidos"
#
#Cenário: Deve validar regras de busca
#  Quando informo o CEP ""
#  E informo o tipo do CEP "Todos"
#  E seleciono Buscar
#  Então recebo a mensagem "Informe o Endereço com no mínimo 2(dois) caracteres!"

Cenário: Deve validar regras de busca
  Quando informo o CEP "80020270"
  E informo o tipo do CEP "Todos"
  E seleciono Buscar
  Então recebo o resultado da busca




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