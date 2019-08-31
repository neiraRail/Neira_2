import java.io.*;

class Main {

    public static void main(String[]args){
        String mensaje = "The first man who stepped on the moon.";
        String archivo="\\Users\\Rail\\Desktop\\texto.txt";
        //leer(archivo);
        //añadir(archivo,mensaje);
        //leer(archivo);
        añadir("\\Users\\Rail\\Desktop\\NoExiste.txt","mensaje");
    }

    public static void leer(String ruta){

        try{
            leer_Archivo(ruta);
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }

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

    public static void leer_Archivo(String ruta) throws IOException {
        String texto;
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        while((texto = br.readLine())!=null) {
            System.out.println(texto);
        }

        br.close();
    }

    public static void añadir_Linea(String ruta ,String mensaje) throws Exception{

        FileWriter fichero = null;
        PrintWriter pw = null;
        fichero = new FileWriter(ruta, true);
        pw = new PrintWriter(fichero);
        pw.println(mensaje);
        fichero.close();

    }

}
