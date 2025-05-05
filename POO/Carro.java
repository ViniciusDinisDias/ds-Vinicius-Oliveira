public class Carro {
        String modelo;
        int ano;
        String cor;
        int velocidade;

        void acelerar() {
            velocidade += 10;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        }

        void frear() {
            if (velocidade >= 10) {
                velocidade -= 10;
            } else {
                velocidade = 0;
            }
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        }

        void exibirInformacoes() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + cor);
            System.out.println("Velocidade: " + velocidade + " km/h");
        }
}
