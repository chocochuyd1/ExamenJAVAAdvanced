package ninethQuestion;

public class NinethQuestion {
    public static void main(String[] args) {

    }
}
/*
 * Crear un programa que realice operaciones CRUD (Create, Read, Update, Delete)
 * sobre la tabla CITY. Usar DB mydb. Usar conexión tipo DataSource. Deberás
 * definir el objeto City.java con las propiedades de la tabla city.
 * 
 * Definir una interfaz e implementarla tomando en cuenta los siguientes
 * métodos:
 * 
 * 1.-crear el método "public boolean addCity(City city)" el cual creará un
 * nuevo registro en la tabla 2.-crear el método "public City getCity(int id)"
 * donde obtenga el objeto City 3.-crear el método "public List<City>
 * getAllCities() obtiene lista de todos los City; 4.-crear el método
 * "public boolean updateCity(City city)" el cual actualizara el registro
 * 5.-crear el método "public void deleteCity(int id)" el cual eliminara el
 * registro en la tabla
 * 
 * Implementar la interfaz y agregar la funcionalidad para que cumpla con el
 * CRUD para la tabla city
 * 
 * El programa primero solicitara una nueva ciudad (CREATE) con un metodo
 * addCity(CITY).
 * 
 * El programa enseguida leera esta nueva ciudad con un metodo getById(CITY_ID)
 * (READ), y desplegara el contenido regresado con el metodo toString().
 * 
 * NOTA: CITY_ID es un ID auto generado, por lo que no se puede conocer hasta
 * que se inserta el registro. Hay maneras de obtener este ID generado dentro
 * del código, pero por lo pronto pueden consultar la tabla en MySQL y ver que
 * ID se generó para usarlo en sus pruebas.
 * 
 * El programa enseguida leera todas las ciudades con un método getAllCities()
 * (READ), que regresara un ArrayList de este objeto. Inmediatamente se
 * despliega el ArrayList de CITY usando el metodo toString().
 * 
 * El programa enseguida solicitara información de un CITY para actualizar
 * usando un método updateCity(CITY). Se captura la misma información que en la
 * operación CREATE, y adicionalmente el CITY_ID de la ciudad a actualizar.
 * 
 * Inmediatamente se despliega el CITY actualizado usando el metodo toString().
 * 
 * Finalmente, el programa solicitara un CITY_ID a borrar usando un metodo
 * deleteById(CITY_ID)
 * 
 * TIPS: 1. Definir primero los entities. 2. Definir la interfaz del
 * repositorio. 3. Definir los queries usando MySQL workbench o command line,
 * para cada una de las operaciones CRUD solicitados. (que columnas necesito
 * regresar? que parámetros de busqueda debo de proporcionar?) 4. Implementar
 * los repositorios con dichos queries. 5. Finalmente, escribir lógica de
 * negocio.
 */