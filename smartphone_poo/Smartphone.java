public class Smartphone {
    // Atributos comuns a todos os smartphones
    protected String marca;
    protected String modelo;
    protected int armazenamento;

    // Construtor da classe Smartphone
    // Ele é chamado quando criamos um novo smartphone (superclasse)
    public Smartphone(String marca, String modelo, int armazenamento) {
        // 'this' serve para referenciar o atributo da classe
        // Isso evita confusão entre o nome do parâmetro e o atributo da classe
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    // Método para exibir as informações básicas do smartphone
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Armazenamento: " + armazenamento + "GB");
    }
}
