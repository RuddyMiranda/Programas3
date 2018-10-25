import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Agregar {
    public void Agregar(){
        FileWriter fwArchTemp;
        try {
            fwArchTemp = new FileWriter("crear.txt");
            BufferedWriter bwArchTemp;
            bwArchTemp = new BufferedWriter(fwArchTemp);
            try (PrintWriter wrArchTemp = new PrintWriter(bwArchTemp)) {
                wrArchTemp.print("Agregar texto\n");
                wrArchTemp.close();
            }
            bwArchTemp.close();
            fwArchTemp.close();
        } catch (IOException ex) {
            System.err.println("Error: "+ex.getMessage());
        }

    }
}
