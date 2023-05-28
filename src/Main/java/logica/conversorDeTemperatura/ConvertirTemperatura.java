package logica.conversorDeTemperatura;

import javax.swing.*;

public class ConvertirTemperatura {
    public void CelFA(double temperatura){

        double Mitemperatura = (temperatura * 1.8)+32;
        JOptionPane.showMessageDialog(null,"La temperatura de celsius a faranje es "+ Mitemperatura );
    }
    public void FaCel(double temperatura){

        double Mitemperatura = (temperatura -32)/1.8;
        JOptionPane.showMessageDialog(null,"La temperatura de faranje a celsius es "+ Mitemperatura );
    }
}
