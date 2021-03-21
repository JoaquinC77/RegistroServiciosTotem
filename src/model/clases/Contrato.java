package model.clases;

/**
 *
 * @author Santo Tomás
 */
public class Contrato {
    private String id;
    private String codigo;
    private String idEmpresa;
    private String nombre;
    private String idAdmin;
    private String fechaInicio;
    private String fechaFin;
    private String contrato;

    public Contrato() {
    }

    public Contrato(String id, String codigo, String idEmpresa, String nombre, String idAdmin, String fechaInicio, String fechaFin, String contrato) {
        this.id = id;
        this.codigo = codigo;
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.idAdmin = idAdmin;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.contrato = contrato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    

    
    
    
    
}
