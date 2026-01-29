
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Estadisticas {

        public static double obtenerPromedio() {

            double suma = 0;
            int contador = 0;
            double promedio;

            try {
                Scanner entrada = new Scanner(new File("data/sucursales.txt"));

                while (entrada.hasNext()) {
                    String linea = entrada.nextLine();

                    try {

                        List<String> lista = Arrays.asList(linea.split("\\|"));
                        ArrayList<String> linea_partes = new ArrayList<>(lista);

                        if (linea_partes.size() != 5) {
                            throw new Exception("Columnas incompletas)");
                        }
                        String variable = linea_partes.get(2);

                        double valor = Double.parseDouble(variable);

                        suma = suma + valor;
                        contador = contador + 1;

                    } catch (Exception e) {
                        System.out.println("Registro fallido\n");
                    }
                }

                entrada.close();

            } catch (Exception e) {
                System.out.printf("Error al leer el archivo.\n");
            }
            promedio = suma / contador;
            return promedio;
        }
    }

