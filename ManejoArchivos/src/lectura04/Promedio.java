/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Promedio {

    public static void obtenerPromedio() {
        double suma = 0;
        ArrayList<Double> variable = new ArrayList<>();
        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                double dato = Double.parseDouble(linea_partes.get(3));
                variable.add(dato);
            }
            entrada.close();
            for (int i = 0; i < variable.size(); i++) {
                suma = suma + variable.get(i);
            }
            double promedio = suma / 2;
            System.out.printf("Promedio: %.2f\n", promedio);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    }

}
