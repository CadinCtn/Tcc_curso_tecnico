import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testes extends JDialog {
    public Testes(Frame owner, String title, boolean modal) {
        super(owner, title, modal);

        JButton fecharBotao = new JButton("Fechar JDialog");
        fecharBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha o JDialog quando o botão é clicado
            }
        });

        JPanel panel = new JPanel();
        panel.add(fecharBotao);
        getContentPane().add(panel);

        setSize(300, 200);
        setLocationRelativeTo(owner);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Principal");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton abrirDialogBotao = new JButton("Abrir JDialog");
        abrirDialogBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Testes dialog = new Testes(frame, "JDialog Modal", true);
                dialog.setVisible(true);
            }
        });

        JPanel panel = new JPanel();
        panel.add(abrirDialogBotao);
        frame.getContentPane().add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
