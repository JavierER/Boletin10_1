package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Adivina {

    private static int intentos;
    private static int numero;
    private static int re;
    private static String repeticiones;

    public static void darValores() {
        do {
            String numero = JOptionPane.showInputDialog("Elige un numero a adivinar entre 1 y 50:");
            Adivina.numero = Integer.parseInt(numero);
        } while (numero < 1 || numero > 50);
        do {
            String intentar = JOptionPane.showInputDialog("Numero de Intentos:");
            intentos = Integer.parseInt(intentar);
        } while (intentos <= 0);
    }

    public static void acertar() {
        String respuesta = JOptionPane.showInputDialog("Adivina el numero:");
        re = Integer.parseInt(respuesta);
        for (int i = 1; i < intentos; i++) {
            if (numero < re) {
                re = Integer.parseInt(JOptionPane.showInputDialog("numero es menor a " + re));
            } else if (numero > re) {
                re = Integer.parseInt(JOptionPane.showInputDialog("numero es mayor a " + re));
            }
        }
    }

    public static void bucle() {
        if (numero == re) {
            repeticiones = JOptionPane.showInputDialog("¡HAS ACERTADO!\nRepetir?");
        } else {
            repeticiones = JOptionPane.showInputDialog("HAS FALLADO :(\n Again?");
        }
        while (repeticiones.equalsIgnoreCase("Si")) {
            Adivina.darValores();
            Adivina.acertar();
        }
    }
}
