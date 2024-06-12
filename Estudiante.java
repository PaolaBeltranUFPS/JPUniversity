public class Estudiante
{
    private String codigo;
    private String documento;
    private String nombre;
    private Fecha fechaNacimiento;
    private Integer estrato;
    private String email;
    private TipoDocumento tipoDocumento;

    public Estudiante(String codigo, String documento, String nombre, Fecha fechaNacimiento, Integer estrato, String email, TipoDocumento tipoDocumento){
        this.codigo = codigo;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento= fechaNacimiento;
        this.estrato = estrato;
        this.email = email;
        this.tipoDocumento = tipoDocumento;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public String getDocumento() {
        return documento;
    }
    public String getNombre() {
        return nombre;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public Integer getEstrato() {
        return estrato;
    }
    public String getEmail() {
        return email;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
