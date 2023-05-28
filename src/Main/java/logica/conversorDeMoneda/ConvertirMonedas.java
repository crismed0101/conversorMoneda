package logica.conversorDeMoneda;

import javax.swing.*;

public class ConvertirMonedas {
    public void ConvertirPesosDolares(double valor){

        double monedaDolar = (double) valor*6.97;
        JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaDolar+ " dolares");
    }


    public void ConvertirPesosEuros(double valor){

        double monedaEuro = (double) valor* 7.42;

        JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaEuro+" euros");
    }
}
