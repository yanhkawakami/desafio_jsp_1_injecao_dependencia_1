# Desafio: Componentes e Injeção de Dependência

## Descrição

Crie um sistema para calcular o **valor total de um pedido**, considerando uma **porcentagem de desconto** e o **frete**.  
O cálculo do valor total consiste em aplicar o desconto ao valor básico do pedido e adicionar o valor do frete.

### Regras de cálculo do frete

| Valor básico do pedido | Frete |
|------------------------:|:------|
| Abaixo de R$ 100.00     | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 (exclusive) | R$ 12.00 |
| R$ 200.00 ou mais | Grátis |

---

## Exemplo 1

**Entrada (dados do pedido: código, valor básico, porcentagem de desconto):**

```
1034
150.00
20.0
```

**Saída:**

```
Pedido código 1034
Valor total: R$ 132.00
```

---

## Exemplo 2

**Entrada:**

```
2282
800.00
10.0
```

**Saída:**

```
Pedido código 2282
Valor total: R$ 720.00
```

---

## Exemplo 3

**Entrada:**

```
1309
95.90
0.0
```

**Saída:**

```
Pedido código 1309
Valor total: R$ 115.90
```

---

## Especificações do Projeto

Um pedido deve ser representado por um objeto conforme o modelo abaixo:

- **Classe `Order`**
  - `code` (Integer): código do pedido  
  - `basic` (Double): valor básico do pedido  
  - `discount` (Double): porcentagem de desconto  

A lógica do cálculo do valor total deve ser dividida em **componentes (serviços)**, cada um com sua própria responsabilidade:

---

### Serviços

#### `OrderService`
Responsável por operações relacionadas a pedidos.  
- Deve calcular o valor total do pedido com base no desconto e no frete.

#### `ShippingService`
Responsável por operações relacionadas ao cálculo do frete.  
- Deve retornar o valor do frete conforme as regras descritas acima.

---

## Implementação

A solução deve ser implementada em **Java** com **Spring Boot**.  
A saída deve ser exibida no **log do terminal da aplicação**.  
Cada serviço deve ser registrado como um componente Spring usando a anotação:

```java
@Service
```

---

## Forma de Entrega

O projeto deve ser disponibilizado em um **repositório público do GitHub**, contendo:

- Código-fonte completo do projeto Spring Boot  
- Arquivo `README.md` explicativo  
- Exemplos de execução do programa no terminal

---
