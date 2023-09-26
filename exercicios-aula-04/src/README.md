# Exercicios de Java: Orientação a Objetos
  Nessa aula colocamos em prática os estudos de polimorfismo e herança. Também reforçamos vários outros conceitos.


### Exercício 01: Veículo

- 1.1 Crie uma classe abstrata chamada Veiculo com os seguintes atributos e métodos:

Atributos:
- marca (String)
- modelo (String)
- ano (int)

Métodos abstratos:
- calcularCustoViagem(int distancia): Este método deve ser abstrato e calcular o custo de uma viagem com bas e na distância fornecida.

- 1.2 Crie duas classes concretas que herdem de Veiculo: Exercicio01.Carro e Exercicio01.Moto. Implemente o método calcularCustoViagem(int distancia) em cada uma dessas classes:

- Exercicio01.Carro deve ter um custo fixo de R$0.20 por quilômetro.
- Exercicio01.Moto deve ter um custo fixo de R$0.15 por quilômetro.

### Exercício 02: Figuras geométricas

- 2.1 Crie uma classe abstrata chamada Exercicio02.FormaGeometrica com um método abstrato calcularArea();

- 2.2 Crie três classes concretas que herdem de Exercicio02.FormaGeometrica: Exercicio02.Retangulo, Exercicio02.Circulo, Exercicio02.Triangulo, Exercicio02.Quadrado e Losango. Implemente o método calcularArea() em cada uma dessas classes para calcular a área da forma específica.

- 2.3 Na classe Principal, crie uma lista de formas geométricas que inclua retângulos, círculos, triângulos, quadrados e losangos.

- 2.4 Use um loop para calcular e exibir a área de cada forma geométrica na lista, mesmo que sejam tipos diferentes, usando o polimorfismo.

### Exercício 03: Sistema de Tributação para Contas e Bens Financeiros (desafio: Interface + Herança + Polimorfismo)

Nosso banco está empenhado em aplicar tributações aos bens financeiros de nossos clientes, e para alcançar esse objetivo, estamos criando um sistema que gerenciará essa tarefa. Aqui estão as etapas do exercício:

- 3.1 Criação da Interface Exercicio03.Tributavel:
Primeiramente, crie uma interface chamada Exercicio03.Tributavel que contenha o método calculaTributos(), responsável por calcular e retornar um valor em formato double.

- 3.2 Tributação de Diferentes Bens Financeiros:
Alguns bens são tributáveis, enquanto outros não o são. Para exemplificar:

- Exercicio03.Conta Poupança não é tributável, portanto, seu método calculaTributos() retornará 0.
- Exercicio03.Conta Corrente é tributável, com uma taxa de 1% sobre o saldo da conta.
Seguro de Vida tem uma tributação fixa de 42 reais.

- 3.3 Hierarquia de Classes de Contas Financeiras:
As classes Exercicio03.ContaCorrente e Exercicio03.ContaPoupanca herdarão de uma classe-base chamada Exercicio03.Conta. A classe Exercicio03.Conta conterá um saldo e os métodos sacar(double), depositar(double) e obterSaldo(), que retornarão o saldo da conta.

- 3.4 Teste do Sistema de Tributação:
Crie uma classe chamada Exercicio03.TestaTributavel com um método Exercicio04.main para testar o exemplo. Neste método, você pode instanciar diferentes objetos que implementam a interface Exercicio03.Tributavel (como contas correntes e seguros de vida) e calcular seus tributos.

- 3.5 Gerenciador de Imposto de Renda:
Além disso, desenvolva uma classe Exercicio03.GerenciadorDeImpostoDeRenda que receberá todos os objetos tributáveis de uma pessoa e somará seus valores tributários. Essa classe conterá um atributo para calcular a soma total dos tributos e um método adicionar(Exercicio03.Tributavel) que aceita objetos tributáveis como parâmetro e adiciona seus tributos ao total.

Lembre-se de que somente objetos que implementam a interface Exercicio03.Tributavel podem ser passados para o método adicionar, excluindo qualquer tipo de conta que não seja tributável.



* * *
