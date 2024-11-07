package src.core;
import javax.swing.*;
import java.awt.*;

public class Output
{
    private JFrame frame;

    public Output()
    {
        frame = new JFrame("Main Window");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Bem-Vindo!");
        JButton button = new JButton("Clique Aqui");
        JTextField inputField = new JTextField(5);

        
    }
}
