/*
    Importações necessárias para a interface gráfica Swing e manipulação de layouts e bordas.
    - javax.swing.*: componentes gráficos básicos como JFrame, JPanel, JButton, JTextField, JLabel, JOptionPane.
    - javax.swing.border.*: para bordas personalizadas nos componentes.
    - java.awt.*: layouts e cores para customizar a GUI.
*/
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

/*
    Classe principal que representa a interface gráfica do cadastro e operações de um celular.
    Estende JFrame para criar uma janela.
*/
//public class CelularGUI extends JFrame {

    /*
        Campos de texto para entrada de dados do usuário (modelo, cor, ano, armazenamento, sistema).
    */
    // private JTextField campoModelo, campoCor, campoAno, campoArmazenamento, campoSistema;
    // Comentado pois precisa ser declarado para compilar. Abaixo segue comentado.
    /*
        private JTextField campoModelo;           // Campo para modelo do celular
        private JTextField campoCor;              // Campo para cor do celular
        private JTextField campoAno;              // Campo para ano de fabricação do celular
        private JTextField campoArmazenamento;    // Campo para armazenamento do celular
        private JTextField campoSistema;          // Campo para sistema operacional do celular
    */
    // Para manter a compilação funcionando mesmo comentando, vou usar um bloco de comentário único para tudo:

    /*
        Campos de texto para entrada de dados do usuário (modelo, cor, ano, armazenamento, sistema).
    */
    /*
    private JTextField campoModelo, campoCor, campoAno, campoArmazenamento, campoSistema;
    */

    /*
        Objeto Celular que será criado a partir dos dados inseridos.
    */
    /*
    private Celular celular;
    */

    /*
        Construtor da GUI.
        Configura título, tamanho, operação de fechamento, localização.
        Cria painel principal com GridLayout para organizar os campos e labels.
        Define cores e bordas para uma melhor aparência.
        Adiciona labels e campos de texto correspondentes.
        Cria botões com ícones e textos explicativos.
        Cria painel para botões com FlowLayout.
        Adiciona painel principal e painel de botões ao JFrame.
        Define ações para cada botão através de listeners que chamam métodos específicos.
    */
    /*
    public CelularGUI() {
        setTitle("📱 Cadastro de Celular");                // Título da janela
        setSize(500, 400);                                // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Fecha aplicação ao fechar janela
        setLocationRelativeTo(null);                      // Centraliza janela na tela

        // Painel principal com 6 linhas, 2 colunas, e espaçamento de 5px entre componentes
        JPanel painel = new JPanel(new GridLayout(6, 2, 5, 5));
        painel.setBackground(new Color(230, 240, 250));    // Cor de fundo clara
        painel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Margem interna ao redor do painel

        // Adiciona labels e campos de texto para os dados do celular
        painel.add(new JLabel("📱 Modelo:"));
        campoModelo = new JTextField();
        painel.add(campoModelo);

        painel.add(new JLabel("🎨 Cor:"));
        campoCor = new JTextField();
        painel.add(campoCor);

        painel.add(new JLabel("📅 Ano:"));
        campoAno = new JTextField();
        painel.add(campoAno);

        painel.add(new JLabel("💾 Armazenamento (GB):"));
        campoArmazenamento = new JTextField();
        painel.add(campoArmazenamento);

        painel.add(new JLabel("⚙️ Sistema:"));
        campoSistema = new JTextField();
        painel.add(campoSistema);

        // Criação dos botões principais com texto e emojis para ações do celular
        JButton botaoCadastrar = criarBotao("✅ Cadastrar");
        JButton botaoMostrarInfo = criarBotao("ℹ️ Mostrar Info");
        JButton botaoInstalarApp = criarBotao("⬇️ Instalar App");
        JButton botaoLigar = criarBotao("📞 Fazer Ligação");
        JButton botaoFoto = criarBotao("📷 Tirar Foto");
        JButton botaoReiniciar = criarBotao("🔄 Reiniciar");
        JButton botaoSair = criarBotao("❌ Sair");

        // Painel para colocar os botões em linha
        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.setBackground(new Color(200, 220, 240)); // Cor de fundo dos botões

        // Adiciona todos os botões ao painel de botões
        painelBotoes.add(botaoCadastrar);
        painelBotoes.add(botaoMostrarInfo);
        painelBotoes.add(botaoInstalarApp);
        painelBotoes.add(botaoLigar);
        painelBotoes.add(botaoFoto);
        painelBotoes.add(botaoReiniciar);
        painelBotoes.add(botaoSair);

        // Adiciona o painel principal no centro da janela e painel de botões na parte inferior
        add(painel, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        // Define as ações para cada botão com expressões lambda (Listeners)
        botaoCadastrar.addActionListener(e -> cadastrarCelular());
        botaoMostrarInfo.addActionListener(e -> mostrarInfo());
        botaoInstalarApp.addActionListener(e -> instalarApp());
        botaoLigar.addActionListener(e -> fazerLigacao());
        botaoFoto.addActionListener(e -> tirarFoto());
        botaoReiniciar.addActionListener(e -> reiniciarCelular());
        botaoSair.addActionListener(e -> System.exit(0)); // Sai do programa
    }
    */

    /*
        Método auxiliar para criar botões com estilo personalizado.
        Define cor de fundo e borda arredondada com cor azul clara.
    */
    /*
    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setBackground(new Color(180, 200, 220));
        botao.setBorder(new LineBorder(new Color(100, 150, 200), 2, true));
        return botao;
    }
    */

    /*
        Método para cadastrar um celular.
        - Obtém texto dos campos.
        - Converte ano e armazenamento para inteiros.
        - Cria objeto Celular com esses dados.
        - Exibe mensagem de sucesso.
        - Caso ano ou armazenamento sejam inválidos, mostra alerta de erro.
    */
    /*
    private void cadastrarCelular() {
        try {
            String modelo = campoModelo.getText();
            String cor = campoCor.getText();
            int ano = Integer.parseInt(campoAno.getText());
            int armazenamento = Integer.parseInt(campoArmazenamento.getText());
            String sistema = campoSistema.getText();

            celular = new Celular(modelo, cor, ano, armazenamento, sistema);
            JOptionPane.showMessageDialog(null, "✅ Celular cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "⚠️ Por favor, insira números válidos para ano e armazenamento.");
        }
    }
    */

    /*
        Mostra as informações do celular cadastrado.
        Se não houver celular cadastrado, mostra alerta.
    */
    /*
    private void mostrarInfo() {
        if (celular != null) {
            celular.mostrarInformacoes();
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }
    */

    /*
        Solicita ao usuário o nome de um app para instalar e chama o método instalarApp do objeto celular.
        Caso não haja celular cadastrado, alerta o usuário.
    */
    /*
    private void instalarApp() {
        if (celular != null) {
            String app = JOptionPane.showInputDialog("⬇️ Digite o nome do aplicativo para instalar:");
            if (app != null && !app.isEmpty()) {
                celular.instalarApp(app);
            }
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }
    */

    /*
        Solicita número para ligação e chama o método fazerLigacao do celular.
        Caso não haja celular cadastrado, alerta o usuário.
    */
    /*
    private void fazerLigacao() {
        if (celular != null) {
            String numero = JOptionPane.showInputDialog("📞 Digite o número para ligar:");
            if (numero != null && !numero.isEmpty()) {
                celular.fazerLigacao(numero);
            }
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }
    */

    /*
        Chama o método tirarFoto do celular.
        Caso não haja celular cadastrado, alerta o usuário.
    */
    /*
    private void tirarFoto() {
        if (celular != null) {
            celular.tirarFoto();
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }
    */

    /*
        Chama o método reiniciar do celular.
        Caso não haja celular cadastrado, alerta o usuário.
    */
    /*
    private void reiniciarCelular() {
        if (celular != null) {
            celular.reiniciar();
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }
    */

    /*
        Método main para iniciar a aplicação.
        Usa SwingUtilities.invokeLater para garantir que a GUI seja criada na thread correta.
        Cria uma instância de CelularGUI e torna visível.
    */
    /*
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CelularGUI app = new CelularGUI();
            app.setVisible(true);
        });
    }
    */
}

/*
    Classe que representa um celular com suas propriedades e comportamentos.
*/
//class Celular {
    /*
        Atributos do celular.
    */
    /*
    private String modelo;
    private String cor;
    private int ano;
    private int armazenamento;
    private String sistema;
    */

    /*
        Construtor que inicializa os atributos do celular com os dados recebidos.
    */
    /*
    public Celular(String modelo, String cor, int ano, int armazenamento, String sistema) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.armazenamento = armazenamento;
        this.sistema = sistema;
    }
    */

    /*
        Método que exibe as informações do celular em uma janela de diálogo.
        Formata uma string com emojis e valores formatados.
    */
    /*
    public void mostrarInformacoes() {
        String info = "📱 Modelo: " + modelo + "\n"
                + "🎨 Cor: " + cor + "\n"
                + "📅 Ano: " + ano + "\n"
                + "💾 Armazenamento: " + armazenamento + " GB\n"
                + "⚙️ Sistema: " + sistema;
        JOptionPane.showMessageDialog(null, info, "ℹ️ Informações do Celular", JOptionPane.INFORMATION_MESSAGE);
    }
    */

    /*
        Simula a instalação de um aplicativo.
        Exibe mensagens indicando instalação e sucesso.
    */
    /*
    public void instalarApp(String app) {
        JOptionPane.showMessageDialog(null, "⬇️ Instalando " + app + "...");
        JOptionPane.showMessageDialog(null, "✅ " + app + " instalado com sucesso!");
    }
    */

    /*
        Simula uma ligação para o número informado.
    */
    /*
    public void fazerLigacao(String numero) {
        JOptionPane.showMessageDialog(null, "📞 Ligando para " + numero + "...");
        JOptionPane.showMessageDialog(null, "✅ Ligação realizada com sucesso!");
    }
    */

    /*
        Simula a ação de tirar uma foto.
    */
    /*
    public void tirarFoto() {
        JOptionPane.showMessageDialog(null, "📷 Foto tirada com sucesso!");
    }
    */

    /*
        Simula a ação de reiniciar o celular.
    */
    /*
    public void reiniciar() {
        JOptionPane.showMessageDialog(null, "🔄 Reiniciando celular...");
        JOptionPane.showMessageDialog(null, "✅ Celular reiniciado com sucesso!");
    }
    */
}
