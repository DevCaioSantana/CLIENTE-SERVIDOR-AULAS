import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame {

    public JPanel painel;
    public JButton calcular;
    public JTextField valor1;
    public JTextField valor2;
    public JLabel labValor1;
    public JLabel labValor2;
    public JRadioButton btnSomar;
    public JRadioButton btnSub;
    public JRadioButton btnMult;
    public JRadioButton btnDiv;
    public ButtonGroup btnConfig;
    public double resultadoFinal = 0,valorprimeiro = 0, valorsegundo=0;

    public calculadora() {

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorprimeiro = Double.parseDouble(valor1.getText());
                valorsegundo = Double.parseDouble(valor2.getText());
                resultadoFinal = valorprimeiro + valorsegundo;
            }

        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorprimeiro = Double.parseDouble(valor1.getText());
                valorsegundo = Double.parseDouble(valor2.getText());
                resultadoFinal = valorprimeiro - valorsegundo;

            }
        });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorprimeiro = Double.parseDouble(valor1.getText());
                valorsegundo = Double.parseDouble(valor2.getText());
                resultadoFinal = valorprimeiro * valorsegundo;
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorprimeiro = Double.parseDouble(valor1.getText());
                valorsegundo = Double.parseDouble(valor2.getText());
                resultadoFinal = valorprimeiro / valorsegundo;
            }
        });

        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, resultadoFinal);
            }
        });
    }

}
