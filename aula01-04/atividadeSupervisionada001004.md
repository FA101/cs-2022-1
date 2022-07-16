### Semana 1 - Dia 25/05/2022 - Aulas 001a004 - Atividade Supervisionada


1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

# **UNIVERSIDADE FEDERAL DE GOIÁS**
## Construção de Software 2022-1 por Gilmar Ferreira Arantes
### Aluno: Fillipe Mendonça Albuquerque 202107677

Premissas:
* Pesquisa sobre Rest API
* Texto de uma página, ou seja, cerca de 30 linhas
* Incluir definições dos conceitos envolvidos
* Incluir pelo menos cinco características dos conceitos citados

Dos vários resultados de pesquisa das palavras-chaves _Rest API_, a fonte que 
mais chama a atenção é a _International Business Machines_ (IBM). Segundo a IBM, 
trata-se da ponte mais leve e flexível para integração de aplicações. 

Ao fatiar os termos, tem-se a _Application Programming Interface_ (API) para 
definir todas as regras de conexão, ou seja, como cada aplicação deve se comportar 
para que possa haver a ponte. A união de API + REST entrega essa conexão com 
princípios _Representational State Transfer_ (REST), em miúdos, padrões para se 
estabelecer conexões entre aplicações, comumente conhecido como RESTful API.

Os padrões, ou princípios, obedecem ao modelo cliente-servidor conforme a regra 
de quem solicita e quem envia uma informação, como em qualquer sistema de rede. 
A liberdade, porém, e não estar restrito ao regimento de um framework, podendo ser 
desenvolvida em qualquer linguagem, desde que obedeçam aos princípios REST, como:

1.	Interface uniforme: padronização de formato na solicitação de informação de 
uma fonte, ou seja, obedecer ao mesmo _Uniform Resource Identifier_ (URI).

2.	Desacoplamento cliente-servidor: independência na relação cliente-servidor, 
cabendo ao cliente saber apenas a URI do que quer solicitar ao servidor, e nada mais, 
e vice-versa.

3.	Sem estado: não devem existir etapas, sessões ou parcelas no armazenamento de 
informações entre o cliente e o servidor para funcionar, ou seja, cada informação 
solicitada é processada de uma vez.

4.	Capacidade de armazenamento: apenas quando for realmente necessário tanto o 
cliente como o servidor devem armazenar recursos para melhorar desempenho do cliente 
e escalabilidade do servidor.

5.	Arquitetura em camadas: o cliente e o servidor utilizam uma rede intermediária 
para conversar, sem que nunca saibam se a aplicação que estão conectados é 
intermediária ou fim.

6.	Regra opcional – conforme demanda: o padrão é que trabalhem estaticamente, 
reagindo conforme solicitações. Existem casos de exceção.

**Referência**
REST API. IBM Cloud Learn Hub, disponível em: 
<https://www.ibm.com/cloud/learn/rest-apis>, acessado em: 25/05/2022.


