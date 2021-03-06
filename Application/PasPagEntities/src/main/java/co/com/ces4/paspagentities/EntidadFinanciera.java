package co.com.ces4.paspagentities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TPP_ENTIDAD_FINANCIERA")
public class EntidadFinanciera extends Persona implements Serializable{
    @Column(name = "DSCIUDAD_CONSTITUCION")
    private String ciudadConstitucion;
    @Column(name = "DSPAIS_CONSTITUCION")
    private String PaisConstitucion;
    @Column(name = "FECONSTITUCION")
    @Temporal(TemporalType.DATE)
    private Date fechaConstitucion;
    
    public EntidadFinanciera() {
    }

     public EntidadFinanciera(String ciudadConstitucion, String PaisConstitucion, Date fechaConstitucion, String documento, TipoDocumento tipoDocumento, String nombre, String contacto, String correo, String direccion, String usuario, String contrasena) {
        super(documento, tipoDocumento, nombre, contacto, correo, direccion, usuario, contrasena);
        this.ciudadConstitucion = ciudadConstitucion;
        this.PaisConstitucion = PaisConstitucion;
        this.fechaConstitucion = fechaConstitucion;
    }
   
    

    public String getCiudadConstitucion() {
        return ciudadConstitucion;
    }

    public void setCiudadConstitucion(String ciudadConstitucion) {
        this.ciudadConstitucion = ciudadConstitucion;
    }

    public String getPaisConstitucion() {
        return PaisConstitucion;
    }

    public void setPaisConstitucion(String PaisConstitucion) {
        this.PaisConstitucion = PaisConstitucion;
    }

    public Date getFechaConstitucion() {
        return fechaConstitucion;
    }

    public void setFechaConstitucion(Date fechaConstitucion) {
        this.fechaConstitucion = fechaConstitucion;
    }
}
