package sixthQuestion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SixthQuestion {
    public static void main(String[] args) {

    }

    public static void imprimirEstados() {
        try {
            File myFile = new File("estados.txt");
            if (myFile.createNewFile()) {
                System.out.println("Archivo creado: " + myFile.getName());
                FileWriter myWriter = new FileWriter("estados.txt");
                myWriter.write("");
                myWriter.close();
            } else {
                System.out.println("Archivo creado: " + myFile.getName());
                FileWriter myWriter = new FileWriter("estados.txt");
                myWriter.write("");
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Conneccion() {
    }

}
/*
 * Genere una conexión a la base de datos mydb, lea la tabla"state" lea todos
 * sus registros e imprimirlos en un archivo .txt llamado estados.txt
 * 
 * Ejemplo de salida:
 * 
 * 1 Aguascalientes CT 2 Baja California NW 3 Baja California Sur NW 4 Campeche
 * SE Etc.... //
 */
