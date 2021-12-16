# Desafio Back-End VentureLabs

### Objetivo

Construir um sistema de compra de passagens aéreas. Esse sistema possui os seguintes requisitos:</br>
  1) Suportar múltiplas companhias.</br>
  2) Cada companhia possui múltiplos voos.</br>
  3) Cada voo possui um horário de saída, de chegada, o aeroporto de origem, o aeroporto de</br>
destino, a quantidade de assentos disponíveis e o preço da passagem.</br>
  4) Os assentos são numerados.</br>
  5) Não é possível comprar passagens quando:</br>
    a) O voo selecionado está com os assentos esgotados.</br>
    b) O horário de saída está definido há menos de 1h do horário atual.</br>
    c) O assento escolhido já está ocupado.</br>
  6) Toda a comunicação deve acontecer via APIs REST.</br>
  7) Os dados devem ser persistidos utilizando MySQL.</br>

Pense num sistema para ser utilizado num balcão de vendas. Logo, não é necessário lidar com criação de
usuário, autenticação etc. Além disso, não é necessário criar uma interface gráfica para o sistema.
Apenas as APIs. Utilizar Kotlin e Framework Spring.


### Estrutura de dados

![Estrutura de dados](/estrutura_dados.png)

### Notas

Achei interessante adicionar também a persistência das compras, com as informações: valor total pago, voo e os assentos comprados. Embora esse projeto não tenha funcionalidades que utilizem esse recurso, faz sentido em um sistema de compras de passagens aéreas que as compras sejam registradas no banco.</br>
Além disso, utilizei banco de dados Oracle, já que é o único que tenho acesso.


### Happy coding!
![:)](https://media.giphy.com/media/1ZkMDj88mQ1rO/giphy.gif)
