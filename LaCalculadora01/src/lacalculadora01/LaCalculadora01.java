package lacalculadora01;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Roa Campos
 */
public class LaCalculadora01 {

    public static void main(String[] args) {

        LaCalculadora01 cal = new LaCalculadora01();
        int op = 1, seleccion = 7;

        do {
            String resp = JOptionPane.showInputDialog("SELECCIONE OPERACION:  \n 1.- Sumar \n 2.- Restar \n 3.- Multiplicar \n 4.- Dividir \n 5.- Mayor entre dos números \n 6.- Porcentaje de un número \n 7.- Salir");
            while (!isNum(resp)) {
                resp = JOptionPane.showInputDialog("SELECCION INVALIDA \n SELECCIONE OPERACION:  \n 1.- Sumar \n 2.- Restar \n 3.- Multiplicar \n 4.- Dividir \n 5.- Mayor entre dos números \n 6.- Porcentaje de un número \n 7.- Salir");
            }
            int respuesta = Integer.parseInt(resp);

            switch (respuesta) {
                case 1:
                    String n21 = JOptionPane.showInputDialog(null, "Ingrese el primer número: ");
                    while (!isNum(n21)) {
                        n21 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n1 = Integer.parseInt(n21);

                    String n22 = JOptionPane.showInputDialog(null, "Ingrese el segundo número: ");
                    while (!isNum(n22)) {
                        n22 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");

                    }
                    int n2 = Integer.parseInt(n22);

                    cal.suma(n1, n2);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + cal.suma(n1, n2));

                    break;

                case 2:

                    String n23 = JOptionPane.showInputDialog(null, "Ingrese el primer número: ");
                    while (!isNum(n23)) {
                        n23 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n3 = Integer.parseInt(n23);

                    String n24 = JOptionPane.showInputDialog(null, "Ingrese el segundo número: ");
                    while (!isNum(n24)) {
                        n24 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n4 = Integer.parseInt(n24);
                    cal.resta(n3, n4);
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + cal.resta(n3, n4));

                    break;

                case 3:

                    String n25 = JOptionPane.showInputDialog(null, "Ingrese el primer número: ");
                    while (!isNum(n25)) {
                        n25 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n5 = Integer.parseInt(n25);

                    String n26 = JOptionPane.showInputDialog(null, "Ingrese el segundo número: ");
                    while (!isNum(n26)) {
                        n26 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n6 = Integer.parseInt(n26);
                    cal.multiplicacion(n5, n6);
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + cal.multiplicacion(n5, n6));

                    break;
                case 4:

                    String n27 = JOptionPane.showInputDialog(null, "Ingrese el primer número: ");
                    while (!isNum(n27)) {
                        n27 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n7 = Integer.parseInt(n27);

                    String n28 = JOptionPane.showInputDialog(null, "Ingrese el segundo número: ");
                    while (!isNum(n28)) {
                        n28 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n8 = Integer.parseInt(n28);
                    cal.division(n7, n8);
                    JOptionPane.showMessageDialog(null, "El resultado de la division es: " + cal.division(n7, n8));

                    break;
                case 5:

                    String n29 = JOptionPane.showInputDialog(null, "Ingrese el primero número:");
                    while (!isNum(n29)) {
                        n29 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n9 = Integer.parseInt(n29);

                    String n30 = JOptionPane.showInputDialog(null, "Ingrese el segundo número: ");
                    while (!isNum(n30)) {
                        n30 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n10 = Integer.parseInt(n30);

                    if (n9 == n10) {
                        JOptionPane.showMessageDialog(null, "L0S NUMEROS SON IGUALES!!");
                    } else if (n9 > n10) {
                        JOptionPane.showMessageDialog(null, "El número mayor es: " + n9);
                    } else {
                        JOptionPane.showMessageDialog(null, "El número mayor es: " + n10);
                    }

                    break;
                case 6:

                    String n31 = JOptionPane.showInputDialog(null, "Ingrese un número");
                    while (!isNum(n31)) {
                        n31 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n11 = Integer.parseInt(n31);

                    String n32 = JOptionPane.showInputDialog(null, "Ingrese el porcentaje(%)");
                    while (!isNum(n32)) {
                        n32 = JOptionPane.showInputDialog(null, "INVALIDO \n Ingrese un número");
                    }
                    int n12 = Integer.parseInt(n32);
                    cal.porcentaje(n11, n12);
                    JOptionPane.showMessageDialog(null, "El " + n12 + "% de " + n11 + " es: " + cal.porcentaje(n11, n12));

                    break;
                case 7:
                    seleccion = JOptionPane.showOptionDialog(null,
                            "Desea abandonar la aplicacion", "Calculadora",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null,
                            new Object[]{"Si", "No"},
                            "Si");

                default:

                    break;

            }

        } while ((op == 1 || op == 2 || op == 3 || op == 4)
                && seleccion == 1);
        JOptionPane.showMessageDialog(null, "Hasta luego");
    }

    public int suma(int n1, int n2) {
        int op;
        op = n1 + n2;
        return op;

    }

    public int resta(int n1, int n2) {
        int op;
        op = n1 - n2;
        return op;
    }

    public int multiplicacion(int n1, int n2) {
        int op;
        op = n1 * n2;
        return op;
    }

    public double division(double n1, double n2) {
        double op;
        op = (n1 / n2);
        return op;
    }

    public double porcentaje(double n1, double n2) {
        double op;
        op = n1 * n2 / 100.0;
        return op;
    }

    public static boolean isNum(String n) {
        int a;
        try {
            a = Integer.parseInt(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
