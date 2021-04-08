package model.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author Santo Tomás
 */
public class ImpresoraWS {
    private String urlWS;

    public ImpresoraWS() {
        this.urlWS = "http://localhost:8080";
    }
    
    public boolean printVoucher(String servicio, String nombrePasajero,String apellidoP, String rutPasajero, String fecha) throws MalformedURLException, IOException{
        
        String rutaCompleta = urlWS + "/print?idServicio=" + servicio + "&nombrePasajero=" +URLEncoder.encode(nombrePasajero, "UTF-8")+"&apellidoP="+apellidoP+"&rutPasajero=" + rutPasajero+"&fecha="+URLEncoder.encode(fecha, "UTF-8");
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
            //System.out.println(output);

            boolean ok = Boolean.parseBoolean(output);
            System.out.println(ok);
            return ok;

        }

        return false;
    }
    
}
