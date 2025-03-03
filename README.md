# Desafio: Componentes e Injeção de Dependência

## Sobre o projeto

Este repositório contém a implementação do desafio proposto no curso "Formação Desenvolvedor Moderno" do [DevSuperior](https://devsuperior.com.br). O objetivo é criar um sistema para calcular o valor total de um pedido, considerando um desconto percentual e o valor do frete.

## Requisitos do sistema

O sistema deve seguir as seguintes regras de negócio:

- O valor total do pedido é calculado aplicando o desconto ao valor básico e adicionando o valor do frete.
- O frete é calculado conforme a tabela abaixo:
  | Valor Básico do Pedido                   | Frete     |
  | ---------------------------------------- | --------- |
  | Abaixo de R\$ 100,00                     | R\$ 20,00 |
  | De R\$ 100,00 até R\$ 200,00 (exclusive) | R\$ 12,00 |
  | R\$ 200,00 ou mais                       | Grátis    |

### Exemplo de Entrada e Saída

#### Exemplo 1

**Entrada:**

- Código: `1034`
- Valor básico: `150.00`
- Porcentagem de desconto: `20.0%`

**Saída:**

```
Pedido código 1034
Valor total: R$ 132.00
```

#### Exemplo 2

**Entrada:**

- Código: `2282`
- Valor básico: `800.00`
- Porcentagem de desconto: `10.0%`

**Saída:**

```
Pedido código 2282
Valor total: R$ 720.00
```
#### Exemplo 3

**Entrada:**

- Código: `1309`
- Valor básico: `95.90`
- Porcentagem de desconto: `00.0%`

**Saída:**

```
Pedido código 1309
Valor total: R$ 115.90
```
## Estrutura do Projeto

A solução segue o princípio de separação de responsabilidades, utilizando componentes Spring Boot:

- `Order`: Classe que representa um pedido.
- `OrderService`: Responsável por operações relacionadas a pedidos.
- `ShippingService`: Responsável pelo cálculo do frete.
- `EventCalculateService`: Responsável pelo cálculo do evento(desconto).

Todos os serviços são registrados como componentes com `@Service`.

## Tecnologias utilizadas

- ☕ Java 21
- 🌱 Spring Boot
- 🏗 Injeção de Dependência

## Como executar o projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/Eduardovll/workspace-java-spring-pedidos.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd seu-repositorio
   ```
3. Execute a aplicação com Maven ou outro gerenciador de dependências:
   ```bash
   mvn spring-boot:run
   ```
4. As saídas serão exibidas no console.

## Autor

[Eduardo Valle](https://github.com/Eduardovll)

---

Esse projeto foi desenvolvido como parte do curso da DevSuperior.

