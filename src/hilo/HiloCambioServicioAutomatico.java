package hilo;

import app.RegistrosServicios;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.ws.CambioServicioSW;

/**
 *
 * @author Santo Tomás
 */
public class HiloCambioServicioAutomatico extends Thread {

    String servicio;
    CambioServicioSW cssw;
    JLabel lblNombreservicio;
    JButton btnImprimirBoucher;
    JButton btnLimpiar;
    JTextField txtRut;
    int idServicio;
    
    public HiloCambioServicioAutomatico(JLabel lblNombreservicio, JButton btnImprimirBoucher, JButton btnLimpiar, JTextField txtRut) {
        this.lblNombreservicio = lblNombreservicio;
        this.btnImprimirBoucher = btnImprimirBoucher;
        this.btnLimpiar = btnLimpiar;
        this.txtRut = txtRut;
    }

    @Override
    public void run() {
        cssw = new CambioServicioSW();
        while (true) {
            try {
                idServicio = cssw.cambioServicioAutomatico();
                
                if (idServicio == 1) {
                    servicio = "DESAYUNO";
                    lblNombreservicio.setText("SERVICIO: " + servicio);
                    btnImprimirBoucher.setEnabled(true);
                    btnLimpiar.setEnabled(true);
                    txtRut.setEnabled(true);

                } else if (idServicio == 2) {
                    servicio = "ALMUERZO";
                    lblNombreservicio.setText("SERVICIO: " + servicio);
                    btnImprimirBoucher.setEnabled(true);
                    btnLimpiar.setEnabled(true);
                    txtRut.setEnabled(true);

                } else if (idServicio == 3) {
                    servicio = "CENA";
                    lblNombreservicio.setText("SERVICIO: " + servicio);
                    btnImprimirBoucher.setEnabled(true);
                    btnLimpiar.setEnabled(true);
                    txtRut.setEnabled(true);

                } else if (idServicio == 4) {
                    servicio = "DESCTIVO";
                    lblNombreservicio.setText("SERVICIO: " + servicio);
                    btnImprimirBoucher.setEnabled(false);
                    btnLimpiar.setEnabled(false);
                    txtRut.setEnabled(false);
                }

                System.out.println(servicio + " servicio actual");

                sleep(59000);
            } catch (Exception ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }
    }

    public int getIdServicio() {
        return idServicio;
    }

}
