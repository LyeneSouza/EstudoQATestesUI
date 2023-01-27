# language: pt

Funcionalidade: Buscar por localidade ou logradouro
  Como um usuário dos Correios
  Eu quero realizar uma busca por localidade ou logradouro
  Para que eu possa saber o CEP corretamente

Contexto:
  Dado que estou acessando a página de busca por localidade ou logradouro

Esquema do Cenário: Deve realizar busca por localidade ou logradouro com sucesso
  Quando informo a UF "<uf>"
  E informo a localidade "<localidade>"
  E informo o tipo "<tipo>"
  E informo o logradouro "<logradouro>"
  E informo o numero "<numero>"
  E clico em Buscar
  Então recebo o CEP "<cep>"

Exemplos:
  | uf |      localidade      |     tipo   |         logradouro        | numero |    cep    |
  | SP |      São Paulo       |  Aeroporto |         Guarulhos         |        | 03707-005 |
  | PR |       Curitiba       |  Alameda   | Doutor Carlos de Carvalho |   55   | 80410-981 |
  | BA |       Salvador       |    Todos   |         Raul Seixas       |   150  | 41510-134 |
  | RJ |    Rio de Janeiro    |    Área    |           Rural           |        | 23799-899 |
  | MG |    Belo Horizonte    |   Avenida  |         Barbacena         |  200   | 30190-130 |
  | PR |   União da Vitória   |   Chácara  |         Castelli          |        | 84605-244 |
  | PR | São José dos Pinhais |   Colônia  |           Murici          |        | 83085-310 |
  | PR |       Londrina       |   Distrito |       Espírito Santo      |        | 86010-510 |
  | DF |       Brasília       |  Esplanada |       dos Ministérios     |        | 70050-000 |
  | PR |       Curitiba       |  Estrada   |          Graciosa         |        | 82840-360 |
  | RJ |    Rio de Janeiro    |   Favela   |          Rocinha          |        | 22451-340 |
  | ES |       Linhares       |   Ladeira  |      Vapor Juparanã       |        | 29900-088 |
  | SP |      São Paulo       |  Travessa  |         Comercial         |        | 02409-090 |
  | PR |       Curitiba       |   Parque   |          Barigui          |        | 82010-700 |
  | PR |       Curitiba       |     Rua    |       Treze de Maio       |  220   | 80020-270 |
  | PR |       Curitiba       |    Praça   |           Japão           |        | 80240-180 |

Esquema do Cenário: Deve retornar as cidades da UF selecionada
  Quando informo a UF "<uf>"
  E clico em ?
  E seleciono a letra "<letra>"
  E seleciono a cidade "<cidade>"
  Então o campo localidade é preenchido com "<localidade>"

Exemplos:
  | uf | letra |    cidade    |  localidade  |
  | BA |   P   |   Palmeiras  |   Palmeiras  |
  | MT |   D   |    Denise    |    Denise    |
  | SC |   C   | Cocal do SUl | Cocal do Sul |

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

Esquema do Cenário: Deve validar regras de busca
  Quando informo a UF "<uf>"
  E informo a localidade "<localidade>"
  E informo o logradouro "<logradouro>"
  E clico em Buscar
  Então recebo a mensagem informativa "<mensagem>"

Exemplos:
  |    uf     | localidade | logradouro |                           mensagem                            |
  | Selecione |            |            |                        Selecione a UF!                        |
  |    CE     |            |            | Informe o nome completo da Cidade/Município/Distrito/Povoado! |
  |    AC     |   Jordão   |            |                 Informe o nome do Logradouro!                 |