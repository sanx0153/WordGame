package src.resources;

import javax.swing.*;
import java.awt.*;

public class Resources
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Manipulação de Imagens"); 
        frame.setSize(400, 300); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new FlowLayout()); 
        // Carregar e redimensionar a imagem 
        ImageIcon icon = new ImageIcon("caminho/para/sua/imagem.jpg"); 
        Image img = icon.getImage(); 
        Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); 
        ImageIcon newIcon = new ImageIcon(newImg); 
        // Exibir a imagem em um JLabel 
        JLabel label = new JLabel(newIcon); frame.add(label); 
        frame.setVisible(true);
    }
}