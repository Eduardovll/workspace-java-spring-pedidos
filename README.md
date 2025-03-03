🚀 Desafio: Componentes e Injeção de Dependência
Este projeto faz parte do módulo Back-End da formação Desenvolvedor Moderno. O objetivo é criar um sistema para calcular o valor total de um pedido, considerando desconto e frete, utilizando Java com Spring Boot e aplicando o conceito de injeção de dependência.

📌 Regras de Negócio
O cálculo do valor total do pedido segue a seguinte fórmula:

Valor Total = (Valor Básico - Desconto) + Frete

A regra de cálculo do frete é:

Valor Básico do Pedido	Valor do Frete
Abaixo de R$ 100,00	R$ 20,00
De R$ 100,00 até R$ 200,00 (exclusive)	R$ 12,00
R$ 200,00 ou mais	Grátis
📖 Exemplos de Entrada e Saída
Exemplo 1:
Entrada:

Código do Pedido: 1034
Valor Básico: R$ 150,00
Desconto: 20%
Saída no terminal:

yaml
Copiar
Editar
Pedido código 1034  
Valor total: R$ 132,00  
Exemplo 2:
Entrada:

Código do Pedido: 2282
Valor Básico: R$ 800,00
Desconto: 10%
Saída no terminal:

yaml
Copiar
Editar
Pedido código 2282  
Valor total: R$ 720,00  
🏗 Estrutura do Projeto
O projeto é dividido em dois serviços principais:

OrderService: Responsável pelo cálculo do valor total do pedido.
ShippingService: Responsável pelo cálculo do valor do frete.
Cada serviço é implementado como um componente Spring usando @Service.

🛠 Tecnologias Utilizadas
☕ Java 17+
🌱 Spring Boot
🏗 Injeção de Dependência
📝 Maven
🖥 Log no terminal
🚀 Como Executar o Projeto
Clone o repositório

sh
Copiar
Editar
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
Compilar e rodar a aplicação

sh
Copiar
Editar
mvn spring-boot:run
Testar os exemplos no terminal
A saída será exibida diretamente no terminal.

📜 Licença
Este projeto é apenas para fins educacionais.
