import java.io.*;

class Main {

    public static void main(String[]args){
        String mensaje = "The first man who stepped on the moon.";
        String archivo="\\Users\\Rail\\Desktop\\texto.txt";
        leer(archivo);
        añadir(archivo,mensaje);
        leer(archivo);
        //añadir("\\Users\\Rail\\Desktop\\NoExiste.txt","mensaje");
    }

    /**
     * Metodo que llama a leer_Archivo o captura una excpeción.
     * @param ruta string con la ruta del archivo.
     */
    private static void leer(String ruta){

        try{
            leer_Archivo(ruta);
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }

    /**
     * Metodo que llama a leer_Archivo y captura la excepción.
     * @param ruta string con la ruta del archivo.
     * @param mensaje string con el texto a añadir.
     */
    public static void añadir(String ruta, String mensaje){
        File archivo = new File(ruta);
        if (archivo.exists()) {
            try {
                añadir_Linea(ruta, mensaje);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("El archivo no fue encontrado en este directorio!!");
        }
    }

    /**
     * Metodo que lee un archivo o lanza una excpecion.
     * @param ruta string con la ruta del archivo.
     * @throws IOException en caso que la ruta noe existiera o hubiera un error de lectura.
     */
    public static void leer_Archivo(String ruta) throws IOException {
        String texto;
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        while((texto = br.readLine())!=null) {
            System.out.println(texto);
        }

        br.close();
    }

    /**
     * Metodo que escribe el texto al final del archivo.
     * @param ruta string con la ruta del archivo.
     * @param mensaje string con el texto a añadir.
     * @throws Exception pueden ser lanzadas durante la ejecución.
     */
    private static void añadir_Linea(String ruta, String mensaje) throws Exception{
        FileWriter fichero = new FileWriter(ruta, true);
        PrintWriter pw = new PrintWriter(fichero);
        pw.println(mensaje);
        fichero.close();

    }

}
