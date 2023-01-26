# language: pt

Funcionalidade: Buscar por localidade ou logradouro
  Como um usuário dos Correios
  Eu quero realizar uma busca por localidade ou logradouro
  Para que eu possa saber o CEP corretamente

Contexto:
  Dado que estou acessando a página de busca por localidade ou logradouro

#Esquema do Cenário: Deve realizar busca por localidade ou logradouro com sucesso

Cenário: Deve realizar nova busca por localidade ou logradouro com sucesso
  Quando realizo uma busca por localidade ou logradouro
  E clico em Nova Busca
  Então posso realizar uma nova busca por localidade ou logradouro

Cenário: Não deve exibir resultados para busca inválida
  Quando informo a UF "MA"
  E informo a localidade "abc"
  E informo o tipo "Todos"
  E informo o logradouro "abc"
  E clico em Buscar
  Então recebo o aviso informativo "Não há dados a serem exibidos"

Esquema do Cenário: Deve validar regras de busca e não deve exibir resultados para busca inválida
  Quando informo a UF "<uf>"
  E informo a localidade "<localidade>"
  E informo o tipo "<tipo>"
  E informo o logradouro "<logradouro>"
  E informo o número ou lote ou apto ou casa "<numero>"
  E clico em Buscar
  Então recebo a mensagem informativa "<mensagem>"

Exemplos:
  | uf | localidade | tipo | logradouro | numero |                           mensagem                            |
  |    |            |      |            |        |                        Selecione a UF!                        |
  | CE |            |      |            |        | Informe o nome completo da Cidade/Município/Distrito/Povoado! |
  | AC |   Jordão   |      |            |        |                 Informe o nome do Logradouro!                 |