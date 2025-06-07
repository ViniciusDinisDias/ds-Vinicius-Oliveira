import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CelularGUI extends JFrame {

    private JTextField campoModelo, campoCor, campoAno, campoArmazenamento, campoSistema;
    private Celular celular;

    public CelularGUI() {
        setTitle("📱 Cadastro de Celular");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(6, 2, 5, 5));
        painel.setBackground(new Color(230, 240, 250));
        painel.setBorder(new EmptyBorder(10, 10, 10, 10));

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

        JButton botaoCadastrar = criarBotao("✅ Cadastrar");
        JButton botaoMostrarInfo = criarBotao("ℹ️ Mostrar Info");
        JButton botaoInstalarApp = criarBotao("⬇️ Instalar App");
        JButton botaoLigar = criarBotao("📞 Fazer Ligação");
        JButton botaoFoto = criarBotao("📷 Tirar Foto");
        JButton botaoReiniciar = criarBotao("🔄 Reiniciar");
        JButton botaoSair = criarBotao("❌ Sair");

        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.setBackground(new Color(200, 220, 240));

        painelBotoes.add(botaoCadastrar);
        painelBotoes.add(botaoMostrarInfo);
        painelBotoes.add(botaoInstalarApp);
        painelBotoes.add(botaoLigar);
        painelBotoes.add(botaoFoto);
        painelBotoes.add(botaoReiniciar);
        painelBotoes.add(botaoSair);

        add(painel, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        botaoCadastrar.addActionListener(e -> cadastrarCelular());
        botaoMostrarInfo.addActionListener(e -> mostrarInfo());
        botaoInstalarApp.addActionListener(e -> instalarApp());
        botaoLigar.addActionListener(e -> fazerLigacao());
        botaoFoto.addActionListener(e -> tirarFoto());
        botaoReiniciar.addActionListener(e -> reiniciarCelular());
        botaoSair.addActionListener(e -> System.exit(0));
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setBackground(new Color(180, 200, 220)); // vermelho, verde, azul
        botao.setBorder(new LineBorder(new Color(100, 150, 200), 2, true));
        return botao;
    }

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

    private void mostrarInfo() {
        if (celular != null) {
            celular.mostrarInformacoes();
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }

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

    private void tirarFoto() {
        if (celular != null) {
            celular.tirarFoto();
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }

    private void reiniciarCelular() {
        if (celular != null) {
            celular.reiniciar();
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Nenhum celular cadastrado.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CelularGUI app = new CelularGUI();
            app.setVisible(true);
        });
    }
}

class Celular {
    private String modelo;
    private String cor;
    private int ano;
    private int armazenamento;
    private String sistema;

    public Celular(String modelo, String cor, int ano, int armazenamento, String sistema) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.armazenamento = armazenamento;
        this.sistema = sistema;
    }

    public void mostrarInformacoes() {
        String info = "📱 Modelo: " + modelo + "\n"
                + "🎨 Cor: " + cor + "\n"
                + "📅 Ano: " + ano + "\n"
                + "💾 Armazenamento: " + armazenamento + " GB\n"
                + "⚙️ Sistema: " + sistema;
        JOptionPane.showMessageDialog(null, info, "ℹ️ Informações do Celular", JOptionPane.INFORMATION_MESSAGE);
    }

    public void instalarApp(String app) {
        JOptionPane.showMessageDialog(null, "⬇️ Instalando " + app + "...");
        JOptionPane.showMessageDialog(null, "✅ " + app + " instalado com sucesso!");
    }

    public void fazerLigacao(String numero) {
        JOptionPane.showMessageDialog(null, "📞 Ligando para " + numero + "...");
    }

    public void tirarFoto() {
        JOptionPane.showMessageDialog(null, "📷 Abrindo câmera...");
        JOptionPane.showMessageDialog(null, "✅ Foto tirada com sucesso!");
    }

    public void reiniciar() {
        JOptionPane.showMessageDialog(null, "🔄 Reiniciando o celular...");
        JOptionPane.showMessageDialog(null, "✅ Celular reiniciado!");
    }
}

/*
==================== COMENTÁRIOS FINAIS ====================

📝 GUI PRINCIPAL (CelularGUI):
- campoModelo, campoCor, campoAno, campoArmazenamento, campoSistema:
  Campos de texto para o usuário digitar informações sobre o celular.

- JButton criarBotao(String texto):
  Cria um botão com cor suave e borda arredondada.

🎯 AÇÕES (métodos):
- cadastrarCelular():
  Cria um objeto Celular com os dados digitados e mostra mensagem de sucesso.

- mostrarInfo():
  Mostra uma janela com as informações do celular cadastrado.

- instalarApp():
  Simula a instalação de um app digitado pelo usuário.

- fazerLigacao():
  Simula fazer uma ligação para o número digitado.

- tirarFoto():
  Simula tirar uma foto.

- reiniciarCelular():
  Simula reiniciar o celular.

🖼️ INTERFACE:
- Emojis foram adicionados para dar mais vida aos botões e mensagens:
  📱 celular
  🎨 cor
  📅 ano
  💾 armazenamento
  ⚙️ sistema
  ⬇️ instalar app
  📞 ligação
  📷 foto
  🔄 reiniciar
  ✅ sucesso
  ⚠️ alerta
  ❌ sair

🚀 Para executar:
- Compile o código e execute a classe principal (CelularGUI).
- Digite os dados, cadastre o celular e use os botões para simular ações.

============================================================
*/

