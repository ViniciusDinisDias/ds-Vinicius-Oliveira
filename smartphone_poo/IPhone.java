public class IPhone extends Smartphone {
    private boolean temSiri;

    public IPhone(String marca, String modelo, int armazenamento, boolean temSiri) {
        // super chama o construtor da superclasse
        super(marca, modelo, armazenamento);
        this.temSiri = temSiri;
    }

    // Método para simular interação com a Siri
    public void chamarSiri(String comando) {
        System.out.println("🗣️ Você: " + comando);
        System.out.println("🎤 Siri: Claro, aqui está o que encontrei para \"" + comando + "\".");
    }
}
