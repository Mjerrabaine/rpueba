import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.InputStreamReader;

public class Graph{
    public static void main(String[]args) throws Exception{
        Graph instancia = new Graph();
        try(InputStreamReader is = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(is);){
            String line = br.readLine();
            int casos = Integer.parseInt(line);
            line = br.readLine();
            final ArrayList palabras = new ArrayList();
            for (int i =0; i<casos && line != null && line.length()>0;i++){
                palabras.clear();
                String enteros = br.readLine();
                int n = Integer.parseInt(enteros.substring(0,0));
                int m = Integer.parseInt(enteros.substring(1,1));
                line = br.readLine();
                for (int j =0; j<n && line != null && line.length()>0;j++){
                    line= line.substring(1);
                    final ArrayList listalinea = new ArrayList();


                    line = br.readLine();
            }


        }
    }
}
