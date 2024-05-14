import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
public class Funciones {
    public static void generarFicheroEnteros(File f, int cantidad) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(f,"rw");
        Random random = new Random();
        for (int i = 0; i < cantidad; i++){
            raf.writeInt(random.nextInt(100));
        }
    }
    public static void mostrarFicheroEnteros(File f) throws IOException {
        RandomAccessFile raf2 = new RandomAccessFile(f, "r");
        for (int i = 0; i<f.length();i+=4){
            System.out.println(raf2.readInt()+"\t");
        }
    }
    public static void añadirFicheroEnteros(File f, int cantidad2) throws IOException {
        RandomAccessFile raf3 = new RandomAccessFile(f, "rw");
        Random random = new Random();
        raf3.seek(f.length());
        for(int i = 0; i<cantidad2; i++){
            raf3.writeInt(random.nextInt(100));
        }
    }
}
