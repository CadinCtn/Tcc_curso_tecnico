import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testes extends JFrame {
    private JButton chooseColorButton;

    public Testes() {
        setTitle("Exemplo JColorChooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chooseColorButton = new JButton("Escolher Cor");
        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escolherCor();
            }
        });

        JPanel panel = new JPanel();
        panel.add(chooseColorButton);

        add(panel);
        setSize(300, 200);
        setLocationRelativeTo(null);
    }

    private void escolherCor() {
        // Abre o JColorChooser
        Color cor = JColorChooser.showDialog(this, "Escolher Cor", Color.BLACK);
            String corEscolhida = String.valueOf(cor);
        // Exibe a cor escolhida (pode ser null se o usuário cancelar)
        if (corEscolhida != null) {
           System.out.print(stringParaCor(corEscolhida));
        }
    }

     private static Color stringParaCor(String corString) {
        try {
            // Remove os caracteres não numéricos da string
            corString = corString.replaceAll("\\D+", "");

            // Divide os valores R, G e B
            int r = Integer.parseInt(corString.substring(0, 3));
            int g = Integer.parseInt(corString.substring(3, 6));
            int b = Integer.parseInt(corString.substring(6, 9));

            // Cria e retorna o objeto Color
            return new Color(r, g, b);
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            // Trata erros de formatação ou índices inválidos
            return null;
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Testes().setVisible(true);
            }
        });
    }
}
