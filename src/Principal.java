import java.io.IOException;
import java.util.Scanner;
public class Principal {
    public static void main (String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        String red="\033[31m";
        String reset="\u001B[0m";
        System.out.println("----------------------------------------------");
        System.out.println("        Seleccione la opcion deseada\n");
        System.out.println("1.- Leer el contenido de un directorio");
        System.out.println("2.- Leer un archivo especificado");
        System.out.println("3.- Crear un archivo");
        System.out.println("4.- Agregar texto a un archivo especificado");
        System.out.println("5.- Copiar (duplicar archivo)");
        System.out.println("6.- Salir del programa");
        System.out.println("----------------------------------------------");
        n = sc.nextInt();
        switch(n) {
            case 1:
            {
                System.out.println(red+"------[Lista de archivos en el directorio]------"+reset);
                Listar list = new Listar();
                list.Listar();
                System.out.println(red+"----------------------------------------------"+reset);
                System.out.println("Tarea realizada!");
            }
            break;
            case 2:
                System.out.println(red+"------------[El archivo contiene:]------------"+reset);
                Leer ler = new Leer();
                ler.Leer();
                System.out.println(red+"----------------------------------------------"+reset);
                System.out.println("Tarea realizada!");
                break;
            case 3:
                Crear cre = new Crear();
                cre.Crear();
                System.out.println("Tarea realizada!");
                break;
            case 4:
                Agregar arr = new Agregar();
                arr.Agregar();
                System.out.println("Tarea realizada!");
                break;
            case 5:
                Duplicar dup = new Duplicar();
                dup.Duplicar();;
                System.out.println("Tarea realizada!");
                break;
            case 6:
                return;
        }
    }
}
//String black="\033[30m";
//String red="\033[31m";
//String green="\033[32m";
//String yellow="\033[33m";
//String blue="\033[34m"; 
//String purple="\033[35m";
//String cyan="\033[36m";
// String white="\033[37m";
//String reset="\u001B[0m";