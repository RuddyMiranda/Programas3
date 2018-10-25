import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class Crear {
    public void Crear(){
        try {
            String direccion = "G:\\Programas3\\crear.txt";
            String texto = "Archivo creado";
            File archivo = new File(direccion);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}