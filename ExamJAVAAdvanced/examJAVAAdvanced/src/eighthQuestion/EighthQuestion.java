package eighthQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EighthQuestion {
    static List<String> paises = new ArrayList<>();
    static List<String> paises2 = new ArrayList<>();

    public static void main(String[] args) {
        paises.add("Sudafrica");
        paises.add("Egipto");
        paises.add("Turquia");
        paises.add("Rusia");
        paises.add("China");
        paises.add("India");
        paises2.add("Francia");
        paises2.add("México");
        paises2.add("Australia");
        paises2.add("Italia");
        paises2.add("Argentina");
        paises2.add("Brasil");
        juntarYordenar();
    }

    public static void juntarYordenar() {
        int i = 1;
        List<String> paises3 = new ArrayList<String>();
        paises3.addAll(paises);
        paises3.addAll(paises2);
        Collections.sort(paises3);
        for (String string : paises3) {
            System.out.println(i + " " + string);
            i++;
        }
    }
}
/*
 * .Teniendo como base la lista a :
 * 
 * List<String> paises= new ArrayList<>(); paises.add("Sudafrica");
 * paises.add("Egipto"); paises.add("Turquia"); paises.add("Rusia");
 * paises.add("China"); paises.add("India");
 * 
 * y la lista b:
 * 
 * List<String> paises2 = new ArrayList<>(); paises2.add("Francia");
 * paises2.add("México"); paises2.add("Australia"); paises2.add("Italia");
 * paises2.add("Argentina"); paises2.add("Brasil");
 * 
 * genere una lista c donde se unen los elementos de cada lista imprimir en
 * consola el resultado de la lista 'c' en ordenado alfabeticamente:
 * 
 * Ejemplo de salida:
 * 
 * 1 Argentina 2 Australia ... etc.
 */