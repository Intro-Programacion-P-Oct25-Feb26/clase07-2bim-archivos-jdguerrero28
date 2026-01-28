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
        int contador = 0;
        ArrayList<Double> valores = new ArrayList<>();
        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                double dato = Double.parseDouble(linea_partes.get(3));
                valores.add(dato);
            }
            entrada.close();
            for (int i = 0; i < valores.size(); i++) {
                suma = suma + valores.get(i);
                contador = contador + 1;
            }
            double promedio = suma / contador;
            System.out.printf("Promedio: %.2f\n", promedio);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    }

}
