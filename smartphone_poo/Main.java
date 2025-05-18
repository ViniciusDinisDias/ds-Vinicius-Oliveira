import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando objetos das subclasses com seus respectivos dados
        Android meuAndroid = new Android("Samsung", "S23", 256, true);
        IPhone meuIphone = new IPhone("Apple", "iPhone 14", 128, true);
        Samsung samsungAlarm = new Samsung("Samsung", "S23 Ultra", 512, true);

        System.out.println("---- Informações do Android ----");
        meuAndroid.exibirInfo();
        System.out.print("Digite o nome de um app para instalar no Android: ");
        String appAndroid = input.nextLine();
        meuAndroid.instalarApp(appAndroid); // Agora o app é o que o usuário digitar

        System.out.println("\n---- Informações do iPhone ----");
        meuIphone.exibirInfo();
        meuIphone.chamarSiri("Abrir câmera");

        System.out.println("\n---- Função Alarme no Samsung ----");
        samsungAlarm.exibirInfo();
        samsungAlarm.programarAlarme(6);

        input.close();
    }
}
