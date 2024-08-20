import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame quadro = new JFrame("Aula01");
        quadro.setContentPane(new calculadora().painel);
        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quadro.pack();
        quadro.setVisible(true);
        //
    }
}
