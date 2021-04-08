package model.ws;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import model.clases.CambioServicio;
import model.clases.Pasajero;

/**
 *
 * @author Santo Tomás
 */
public class CambioServicioSW {
    private String urlWS;

    public CambioServicioSW() {
        this.urlWS = "http://localhost:8080";
    }
    
    public int cambioServicioAutomatico() throws MalformedURLException, IOException{
        CambioServicio cs = null;
        
        String rutaCompleta = urlWS + "/getCambioServicioActualizado";
        System.out.println("------------------------");
        System.out.println(rutaCompleta);
        System.out.println("------------------------");
        HttpURLConnection conn = (HttpURLConnection) new URL(rutaCompleta).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : "
                    + conn.getResponseCode());
        }

        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;

        while ((output = br.readLine()) != null) {
            System.out.println(output);
            
            cs = new CambioServicio(Integer.parseInt(output));
            
        }

        return cs.getEstado();
    }
    
    
}
