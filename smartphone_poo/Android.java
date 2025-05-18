public class Android extends Smartphone {
    // Atributo exclusivo da subclasse Android
    private boolean temPlayStore;

    // Construtor do Android que também chama o construtor da superclasse
    public Android(String marca, String modelo, int armazenamento, boolean temPlayStore) {
        // 'super' chama o construtor da superclasse Smartphone
        super(marca, modelo, armazenamento);
        this.temPlayStore = temPlayStore;
    }

    // Método para simular a instalação de um aplicativo
    public void instalarApp(String app) {
        // equalsIgnoreCase compara sem diferenciar maiúsculas de minúsculas
        if (app.equalsIgnoreCase("instagram")) {
            System.out.println("📲 Instalando Instagram...");
            System.out.println("📸 Tirando a primeira selfie...");
            System.out.println("✨ Publicando sua primeira foto!");
        } else if (app.equalsIgnoreCase("whatsapp")) {
            System.out.println("📲 Instalando WhatsApp...");
            System.out.println("💬 Enviando a primeira mensagem...");
        } else {
            System.out.println("📦 Instalando " + app + " via PlayStore...");
        }
    }
}
