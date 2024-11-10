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
        frame.setLayout(new BorderLayout());

        /* TOP PANEL */

        JPanel top = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Bem-Vindo ao 5ete!");
        top.add(label);
        
        
        
        frame.add(top, BorderLayout.NORTH);
        
        /* Background Panel */

        class BackPanel extends JPanel
        {
            public BackPanel()
            {
                
            }
        }



        /* Center Panel */
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,5));
        
        JButton[][] buttons = new JButton[7][5];
        for (int i = 0; i < buttons.length; i++)
        {
            for (int j = 0; j < buttons[i].length; j++)
            {
                buttons[i][j] = new JButton(String.valueOf(i +1) + String.valueOf(j + 1));
                panel.add(buttons[i][j]);
            }
        }
        
        frame.add(panel, BorderLayout.CENTER);
        
        /* Bottom Panel */
        
        JPanel bottom = new JPanel(new FlowLayout());
        
        JTextField inputField = new JTextField(5);
        JButton buttonNew = new JButton("New Game");
        JButton buttonExit = new JButton("Exit");
        
        bottom.add(inputField);
        bottom.add(buttonNew);
        bottom.add(buttonExit);
        frame.add(bottom, BorderLayout.SOUTH);


    }
    public void show()
    {
        frame.setVisible(true);
    }
}
