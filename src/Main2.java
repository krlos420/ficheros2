import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String frase = "";
        try{
            fw = new FileWriter("hola.txt");
            bw = new BufferedWriter(fw);
            do {
                frase = Leer.leerTexto("Di la frase: ");
                    if (!frase.equalsIgnoreCase("fin")) {
                        bw.write(frase);
                        bw.newLine();
                }
            }while (!frase.equalsIgnoreCase("Fin"));
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}