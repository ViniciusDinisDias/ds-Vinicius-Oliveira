public class Samsung extends Smartphone {
    private boolean temAlarme;

    public Samsung(String marca, String modelo, int armazenamento, boolean temAlarme) {
        super(marca, modelo, armazenamento);
        this.temAlarme = temAlarme;
    }

    // Simulando o alarme com mensagens
    public void programarAlarme(int hora) {
        System.out.println("⏰ Alarme programado para as " + hora + "h da manhã.");
        System.out.println("🔔 Alarme tocando... Acorda meu companheiro, sede de ser campeão!");
        // Aqui poderia tocar um som com uma lib externa (explico abaixo)
    }
}
