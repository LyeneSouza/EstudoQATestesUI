# language: pt

Funcionalidade: Buscar por endereço ou CEP
  Como um usuário dos Correios
  Eu quero realizar uma busca por endereço ou CEP
  Para que eu possa preencher os dados de envio corretamente

Contexto:
  Dado que estou acessando a aplicação

Esquema do Cenário: Deve realizar busca por CEP ou endereço com sucesso
  Quando informo o CEP ou o endereço "<cepOuEnd>"
  E informo o tipo do CEP "<tipo>"
  E seleciono Buscar
  Então recebo o resultado "<nomeOuCEP>"

Exemplos:
  |            cepOuEnd           |           tipo           |                                           nomeOuCEP                                                   |
  |           80020-270           |           Todos          |                                   Rua Treze de Maio - até 469/470                                     |
  |           80020-270           |   Localidade/Logradouro  |                                   Rua Treze de Maio - até 469/470                                     |
  |           05909-960           |      CEP Promocional     |                                     Baú da Felicidade da Jequiti                                      |
  |           30666-990           | Caixa Postal Comunitária |                   Rua Duzentos e Oitenta e Um CPC Conselho Regional de Apoio Social                   |
  |           80020-959           |      Grande Usuário      | Rua Emiliano Perneta, 288 Lojas 06 e 07 Clique e Retire Correios AGF Emiliano Perneta Clique e Retire |
  |           88870-970           |   Unidade Operacional    |                             Rua Quinze de Novembro, 305 Sala 03 AC Orleans                            |
  |       Rua Generis Calvo       |           Todos          |                                               82800-070                                               |
  |       Rua Generis Calvo       |   Localidade/Logradouro  |                                               82800-070                                               |
  | Baú da Felicidade da Jequiti  |      CEP Promocional     |                                               05909-960                                               |
  |  Rua Duzentos e Oitenta e Um  | Caixa Postal Comunitária |                                               30666-990                                               |
  | Correios AGF Emiliano Perneta |      Grande Usuário      |                                               80020-959                                               |
  |           AC Orleans          |   Unidade Operacional    |                                               88870-970                                               |

Esquema do Cenário: Não deve exibir resultados para busca inválida
  Quando informo o CEP ou o endereço "<cep>"
  E informo o tipo do CEP "<tipo>"
  E seleciono Buscar
  Então recebo o aviso "Não há dados a serem exibidos"

Exemplos:
  |    cep    |           tipo           |
  | 00000-000 |           Todos          |
  | 80020-959 |   Localidade/Logradouro  |
  | 80020-270 |      CEP Promocional     |
  | 80020-270 | Caixa Postal Comunitária |
  | 80020-270 |      Grande Usuário      |
  | 80020-270 |   Unidade Operacional    |

Esquema do Cenário: Deve validar regras de busca
  Quando informo o CEP ou o endereço "<cep>"
  E informo o tipo do CEP "<tipo>"
  E seleciono Buscar
  Então recebo a mensagem "Informe o Endereço com no mínimo 2(dois) caracteres!"

Exemplos:
  |    cep    |           tipo           |
  |           |           Todos          |
  |           |   Localidade/Logradouro  |
  |           |      CEP Promocional     |
  |           | Caixa Postal Comunitária |
  |           |      Grande Usuário      |
  |           |   Unidade Operacional    |
  |    a      |           Todos          |
  |    a      |   Localidade/Logradouro  |
  |    a      |      CEP Promocional     |
  |    a      | Caixa Postal Comunitária |
  |    a      |      Grande Usuário      |
  |    a      |   Unidade Operacional    |