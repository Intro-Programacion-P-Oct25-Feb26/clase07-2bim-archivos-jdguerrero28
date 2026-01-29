
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
                    ArrayList<String> partes = 
                            new ArrayList<>(Arrays.asList(linea.split("\\|")));

                    if (partes.size() < 3) {
                        throw new Exception("Faltan datos");
                    }
                    int empleados = Integer.parseInt(partes.get(2));

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
