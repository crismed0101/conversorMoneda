package igu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JFrame{
    private JPanel panel1;
    private JTextField txt1;
    private JTextField txt2;
    private JButton btn;
    private JButton btn1;

    public Pantalla(){

        super("hola perros");
        setContentPane(panel1);
        setSize(300,300);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txt1.getText();
                txt2.setText(texto);
                txt1.setText("");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
            }
        });
    }
}
