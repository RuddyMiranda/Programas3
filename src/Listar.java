import java.io.File;

public class Listar {
    public void Listar(){
        File dir = new File("G:\\");
        String[] ficheros = dir.list();
        if (ficheros == null)
            System.out.println("No hay ficheros en el directorio especificado");
        else {
            for (int x=0;x<ficheros.length;x++)
                System.out.println(ficheros[x]);
        }
    }
}
