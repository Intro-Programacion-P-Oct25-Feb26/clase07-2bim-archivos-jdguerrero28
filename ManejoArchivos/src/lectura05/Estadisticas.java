/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.Scanner;

public class Estadisticas {

    public static void obtenerEstadisticas() {
        double sumaEmpleados = 0;
        int contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                try {
                    if (linea == null || linea.trim().isEmpty()) {
                        throw new Exception("Línea vacía");
                    }

                    String[] partes = linea.split("\\|");

                    if (partes.length < 3) {
                        throw new Exception("Faltan datos o "
                                + "formato incorrecto");
                    }

                    int empleados = Integer.parseInt(partes[2]);

                    sumaEmpleados = sumaEmpleados + empleados;
                    contador = contador + 1;

                } catch (Exception e) {
                }
            }

            entrada.close();

        } catch (Exception e) {
            System.err.println("Error general");
        }

        sumaEmpleados = sumaEmpleados / contador;
        System.out.printf("Promedio es: %.2f\n", sumaEmpleados);
    }

}
