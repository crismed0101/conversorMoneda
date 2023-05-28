package logica.conversorDeTemperatura;

import javax.swing.*;

public class FunctionTemperatura {
    ConvertirTemperatura temperatura = new ConvertirTemperatura();


    public void ConvertirTemperatura(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "elige a que temperatura deseas convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                "Grados centrigados -> grados faranje", "grados faranje -> grados centrigados"}, "seleccion"
        )).toString();

        switch (opcion) {
            case "Grados centrigados -> grados faranje":
                temperatura.CelFA(Minput);
                break;
            case "grados faranje -> grados centrigados":
                temperatura.FaCel(Minput);
                break;
        }

    }
}
