package logica.principal;

import logica.conversorDeMoneda.FunctionMonedas;
import logica.conversorDeTemperatura.FunctionTemperatura;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        FunctionMonedas monedas = new FunctionMonedas();
        FunctionTemperatura temperatura = new FunctionTemperatura();
        boolean flag = true;

        while (flag) {
            String opciones = (JOptionPane.showInputDialog(null, "seleccione una opcion de convercion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de monedas", "conversor de temperatura"}, "seleccion")).toString();

            switch (opciones) {


                case "Conversor de monedas":
                    String input = JOptionPane.showInputDialog("ingrese la cantidad de dinero que desea convertir");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);

                        monedas.ConvertirMonedas(Minput);
                        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("seleccione opcion afirmada");
                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "programa termido");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "valor invalido");
                    }
                    break;

                case "conversor de temperatura":

                    input = JOptionPane.showInputDialog("Ingrese el valor de temperatura que desea convertir");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);
                        int respuesta = 0;

                        respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar");
                        if (respuesta == 0 && ValidarNumero(input) == true) {
                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "programa terminado");

                        }
                    }else {
                        JOptionPane.showMessageDialog(null, "valor invalido");
                    }
                    break;



            }
        }

    }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0)
                return true;

        } catch (NumberFormatException e) {


            return false;


        }
        return false;
    }
}
