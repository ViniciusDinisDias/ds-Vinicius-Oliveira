import javax.swing.JOptionPane;

public class Celular {
    String modelo;
    String cor;
    int ano;
    int armazenamento;
    String sistema;


    public Celular (String modelo, String cor, int ano, int armazenamento, String sistema) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.armazenamento = armazenamento;
        this.sistema = sistema;
    }

    public void mostrarInformacoes() {
        String info = "Modelo: " + modelo + "\n"
                    + "Cor: " + cor + "\n"
                    + "Ano: " + ano + "\n"
                    + "Armazenamento: " + armazenamento + "\n"
                    + "Sistema: " + sistema;
        JOptionPane.showMessageDialog(null, info, "Informações do Celular", JOptionPane.INFORMATION_MESSAGE);
    }

    public void instalarApp(String app) {
        JOptionPane.showMessageDialog(null, "Iniciando Instalação do app: " + app + "... ✨");
        JOptionPane.showMessageDialog(null, "Baixando o app: " + app + "... ");
        JOptionPane.showMessageDialog(null, "Instalando o app: " + app + "... ❤");
        JOptionPane.showMessageDialog(null, app + " instalado com sucesso! ✅");
    }

        public static void main (String[]args){
            String modelo = JOptionPane.showInputDialog("Digite o moidelo do celular: ");
            String cor = JOptionPane.showInputDialog("Digite a cor do celular: ");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento: "));
            int armazenamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o armazenamento (em GB): "));
            String sistema = JOptionPane.showInputDialog("Digite o sistema operacional:");

        Celular meuCelular = new Celular(modelo, cor, ano, armazenamento, sistema);
        meuCelular.mostrarInformacoes();

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja instalar um aplicativo?", "Instalação de App", JOptionPane.YES_NO_OPTION);

        if (escolha == JOptionPane.YES_OPTION) {
            String app = JOptionPane.showInputDialog("Qual app você deseja instalar?");
            meuCelular.instalarApp(app);
        } else {
            JOptionPane.showMessageDialog(null, "Tudo bem, nenhum app será instalado.");
        }
    }
}
// Commits necessários
//showCondirmDialog: exibe uma mensagem e dois botoes: yes ou no ;
//YES_OPTION: Serve para verificar quando o usuario cliclou em yes;
//NO_OPTION; serve paraa verificar se o usuário clicou em no;
//YES_NO_OPTION: mostra dois botoes : sim e não;
//showInputDialog: receber informaçoes, strings, numbers e etc.
//showMessageDialog: exibe uma simples mensagem para o usuário;
//INFORMATION_MESSAGE: mostra uma mensagem com um icone de informação "i";