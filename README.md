## Simulador de corrida

Este código é um simulador de corrida entre dois carros, representados pela classe `carro`. Cada carro tem um nome e uma velocidade inicial de zero. Eles competem em uma corrida até atingirem uma determinada velocidade de chegada.

A classe `carro` possui métodos para acelerar e obter informações como a velocidade atual e o nome do carro. O método `acelerar` incrementa a velocidade do carro de forma aleatória em um valor entre 1 e 3 a cada chamada.

A classe `corrida` contém o método `main`, onde a lógica da corrida é implementada. Os carros competem até que um deles atinja a velocidade de chegada definida. Durante a corrida, a função `pista` é chamada para visualizar graficamente o progresso dos carros na pista.

Ao final da corrida, o método `vencedor` é chamado para determinar e exibir o resultado da corrida com base na velocidade alcançada por cada carro.

É um exemplo de simulação de corrida que usa conceitos de orientação a objetos, laços de repetição e geração de números aleatórios.
