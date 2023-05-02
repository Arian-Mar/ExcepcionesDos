import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leer (String ruta) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(ruta));
        String linea = "";
        while ((linea = reader.readLine()) != null) {
            System.out.println("Info:" + linea);
        }

    }

    public void metodoUno(String ruta) throws IOException{
        this.metodoDos(ruta);
    }

    public void metodoDos(String ruta) throws IOException{
        this.leer(ruta);
    }
}
