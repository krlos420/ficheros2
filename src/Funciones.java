import java.io.File;
import java.io.IOException;
import java.util.Random;
public class Funciones {
    public static void generarFicheroEnteros(File f, int cantidad) throws IOException {
        Random numRandom = new Random();
        int num;
        try {
            for (int i = 0; i < cantidad; i++) {
                num = numRandom.nextInt();

            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
