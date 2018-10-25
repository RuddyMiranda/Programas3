import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public void Leer() throws IOException {
        String texto;
        FileReader f = new FileReader("Hola.txt");
        BufferedReader b = new BufferedReader(f);
        while((texto = b.readLine())!=null) {
            System.out.println(texto);
        }
        b.close();

        }
    }
