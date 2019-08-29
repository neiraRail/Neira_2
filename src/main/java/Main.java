import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

class Main {

    public static void main(String[]args){
        String archivo="/home/dci/Escritorio/texto.txt";
        leer(archivo);
    }

    public static void leer(String ruta){

        try{
            leer_Archivo(ruta);
        }
        catch(IOException ioe){
            System.out.println(ioe);
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



    public static void añadir_Linea(){

    }

}
