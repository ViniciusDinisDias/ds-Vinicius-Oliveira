public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;
        meuCarro.cor = "Preto";
        meuCarro.velocidade = 0;

        meuCarro.exibirInformacoes();
        meuCarro.acelerar();
        meuCarro.frear();
    }
}
