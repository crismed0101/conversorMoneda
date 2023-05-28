package logica.conversorDeMoneda;

import javax.swing.*;

public class FunctionMonedas {
    ConvertirMonedas monedas = new ConvertirMonedas();

    public void ConvertirMonedas(double Minput){
        String opcion =(JOptionPane.showInputDialog(null,
                "elije la moneda a la que deseas convertir tu dinero ,",
                        "modenas",JOptionPane.PLAIN_MESSAGE,null ,new Object[]{
                                "De pesos a dolar"," De pesos a euro" },"seleccion")).toString();


        switch (opcion){
            case "De pesos a dolar":
                monedas.ConvertirPesosDolares(Minput);
                break;
            case "De pesos a euros" :
                monedas.ConvertirPesosEuros(Minput);
                break;
        }

    }
}
