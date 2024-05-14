import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;
public class Main4 {
    public static void main(String[] args) throws IOException {
        String ruta = Leer.leerTexto("Escribe la ruta del archivo: ");
        int cantidad = Leer.leerEntero("Introduce un numero entero: ");
        File f = new File(ruta);
        Funciones.generarFicheroEnteros(f, cantidad);
        Funciones.mostrarFicheroEnteros(f);
        int cantidad2 = Leer.leerEntero("Cuantos numeros mas quieres añadir? ");
        Funciones.añadirFicheroEnteros(f, cantidad2);
    }
}