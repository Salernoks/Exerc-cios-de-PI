package exercicio1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exercicio1 {
    public static void main(String[] args) {
        Runnable t = new Runnable () {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(t);
    }
    public static void criarGUI(){
    JFrame tela = new JFrame ();
    Dimension d = new Dimension(400,600);
    tela.setMinimumSize(d);
    
    tela.setMaximumSize(d);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tela.setTitle("Cadastro");
    
    JPanel panel = new JPanel();
    tela.getContentPane().add(panel);
    
    
    
    JLabel label = new JLabel ("Nome: ");
    panel.add(label);
    
    
    final JTextField field = new JTextField(10);
    panel.add(field);
    
    JLabel label01 = new JLabel ("Endereço: ");
    panel.add(label01);
    
    final JTextField field01 = new JTextField(10);
    panel.add(field01);
    
    JLabel label02 = new JLabel ("Telefone: ");
    panel.add(label02);
    
    final JTextField field02 = new JTextField(10);
    panel.add(field02);
    
    JButton button = new JButton ("Salvar");
    panel.add(button);
    
    JButton button02 = new JButton ("Exibir dados");
    panel.add(button02);
    
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
         JOptionPane.showMessageDialog(tela, "Itens salvos com sucesso");
        }
    });
         
    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(tela, "Dados Sslvos");
        }
    });
        
    
    tela.pack();
    tela.setVisible(true);
   }
}
