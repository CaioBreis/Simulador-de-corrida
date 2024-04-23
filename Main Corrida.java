package teste;

import enti.carro;


public class corrida {
    public static void main(String[] args) {



        int chegada = 50;
        carro c1 = new carro("n1");
        carro c2 = new carro("n2");


        while (c1.getVelocidade() < chegada && c2.getVelocidade() < chegada) {
            c1.acelerar();
            c2.acelerar();

            pista(c1,c2,chegada);
        }


        vencedor(c1,c2,chegada);


    }

        public static void vencedor(carro c1, carro c2, int l_chegada ) {
            if (c1.getVelocidade() == l_chegada && c2.getVelocidade() == l_chegada) {
                System.out.println(c1.getNome() + " e " + c2.getNome() + " empataram a corrida!");
            } else if(c1.getVelocidade() == c2.getVelocidade()) {
                System.out.println(c1.getNome() + " e " + c2.getNome() + " empataram a corrida!");
            } else if (c1.getVelocidade() >= l_chegada && c1.getVelocidade() > c2.getVelocidade()) {
                System.out.println(c1.getNome() + " venceu a corrida!");
            } else {
                System.out.println(c2.getNome() + " venceu a corrida!");
            }

        }

        public static void pista (carro c1, carro c2, int l_chegada ) {

            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (int h = 0; h < c1.getVelocidade(); h++) {
                System.out.print(" ");

            }
            System.out.println("#");

            for (int y = 0; y < c2.getVelocidade(); y++) {
                System.out.print(" ");
            }
            System.out.println("#");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
            try {
                Thread.sleep(1000); // Aguarda 1 segundo para simular a passagem do tempo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }



