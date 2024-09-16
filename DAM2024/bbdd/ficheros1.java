import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ficheros1 {
    public static void main(String[] args) {
        // Nombre del archivo
        String nombreArchivo = "miArchivo.txt";

        try {
            // Crear un objeto File
            File archivo = new File(nombreArchivo);

            // Verificar si el archivo ya existe
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else {
                // Crear el archivo
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + archivo.getName());

                    // Escribir contenido en el archivo
                    FileWriter escritor = new FileWriter(archivo);
                    escritor.write("Este es un ejemplo de texto escrito en el archivo.\n");
                    escritor.write("¡Puedes añadir más líneas si quieres!");
                    escritor.close();

                    System.out.println("Se ha escrito en el archivo con éxito.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
