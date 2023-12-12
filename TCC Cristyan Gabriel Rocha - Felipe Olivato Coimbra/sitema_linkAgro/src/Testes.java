import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Testes extends JFrame {
    private JTable table;

    public Testes() {
        setTitle("Selecionar Linha por Idade");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um modelo de tabela simples com dados de exemplo
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
        table = new JTable(model);

        
        
        
        
        
        // Seleciona automaticamente a linha com idade superior a 37
        selecionarLinhaPorIdade(25);

        
        // Adiciona a tabela a um painel de rolagem e adiciona o painel ao quadro
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void selecionarLinhaPorIdade(int id) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        for (int i = 0; i < model.getRowCount(); i++) {
            int idade = Integer.parseInt((String) model.getValueAt(i, 2)); // Coluna de idade

            if (idade == id) {
                table.getSelectionModel().setSelectionInterval(i, i);
                break;
            }
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
