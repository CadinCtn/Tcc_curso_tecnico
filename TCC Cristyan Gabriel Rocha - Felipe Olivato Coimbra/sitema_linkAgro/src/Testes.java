import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Testes extends JFrame {

    public Testes() {
        setTitle("Tabela com Cores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um modelo de tabela editável
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
                        {"1", "John Doe", "30"},
                        {"2", "Jane Doe", "25"},
                        {"3", "Bob Smith", "40"},
                        {"4", "Alice Johnson", "35"}
                },
                new String[]{"ID", "Nome", "Idade"}
        );

        // Cria a tabela com o modelo
        JTable table = new JTable(model);

        // Define o renderizador de célula personalizado
        table.getColumnModel().getColumn(2).setCellRenderer(new IdadeCellRenderer());

        // Adiciona a tabela a um painel de rolagem e adiciona o painel ao quadro
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    // Renderizador de célula personalizado para a coluna de Idade
    private class IdadeCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Obtém o valor da célula na coluna de Idade
            String idadeStr = table.getValueAt(row, column).toString();
            int idade = Integer.parseInt(idadeStr);

            // Define a cor da célula com base na idade
            if (idade > 35) {
                //component.setBackground(Color.RED);
                component.setForeground(Color.GREEN);
            } else {
                // Restaura as cores padrão se necessário
                component.setBackground(table.getBackground());
                component.setForeground(table.getForeground());
            }

            return component;
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
