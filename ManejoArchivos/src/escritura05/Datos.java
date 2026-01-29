/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Formatter;

/**
 *
 * @author jdieg
 */
public class Datos {
        public static void agregarRegistros(String cadena, String placa) {
        String ruta = String.format("data/%s.txt", placa);
        try {
            Formatter salida = new Formatter(ruta);
            salida.format("%s", cadena);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    }

}
    
}
