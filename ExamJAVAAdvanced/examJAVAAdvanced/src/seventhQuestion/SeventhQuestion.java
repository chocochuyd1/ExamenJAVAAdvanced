package seventhQuestion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeventhQuestion {
    static Map map = new HashMap();

    public static void main(String[] args) {
        map.put("a1234", "Steve Jobs");
        map.put("a1235", "Scott McNealy");
        map.put("a1236", "Jeff Bezos");
        map.put("a1237", "Larry Ellison");
        map.put("a1238", "Bill Gates");
        System.out.println("Ingrese el ID del usuario que desea llamar");
        Scanner scan = new Scanner(System.in);
        String llave = scan.nextLine();
        scan.close();
        obtenerPersonaje(llave);
    }

    public static void obtenerPersonaje(String llave) {
        String personaje;
        personaje = map.get(llave).toString();
        try {
            File myFile = new File("personaje.txt");
            if (myFile.createNewFile()) {
                System.out.println("Archivo creado: " + myFile.getName());
                FileWriter myWriter = new FileWriter("personaje.txt");
                myWriter.write(llave + " " + personaje);
                myWriter.close();
            } else {
                System.out.println("Archivo creado: " + myFile.getName());
                FileWriter myWriter = new FileWriter("personaje.txt");
                myWriter.write(llave + " " + personaje);
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
 * Crea un mapa que asocie las siguientes ID de empleados con nombre, tanto la
 * llave como el valor serían String,
 * 
 * ID Name a1234 Steve Jobs a1235 Scott McNealy a1236 Jeff Bezos a1237 Larry
 * Ellison a1238 Bill Gates
 * 
 * después programe un método "obtenerPersonaje(String llave)" que lea el mapa
 * por su valor y lo escriba en un archivo de texto llamado personaje.txt
 * 
 * Ejemplo de salida:
 * 
 * a1236 Jeff Bezos
 */