import java.util.ArrayList;

public class Ayuda
{
    private Fecha fechaAsignacion;
    private Fecha fechaEntrega;
    private TipoAyuda tipoAyuda;
    private Estado estado;
    private Estudiante estudiante;
    ArrayList <Ayuda> ayudas = new ArrayList();
    ArrayList <Estudiante> estudiantesFavorecidos = new ArrayList();

    public Ayuda(){
    }

    public Ayuda(TipoAyuda tipoAyuda, Estado estado, Fecha fechaAsignacion){
        this.tipoAyuda = tipoAyuda;
        this.estado = estado;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = null;
    }

    public Fecha getFechaAsignacion(){
        return fechaAsignacion;
    }

    public Fecha getFechaEntrega(){
        return fechaEntrega;
    }

    public TipoAyuda getTipoAyuda() {
        return tipoAyuda;
    }

    public Estado getEstado() {
        return estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }


    public ArrayList<Ayuda> getAyudas() {
        return ayudas;
    }

    public void setFechaAsignacion(Fecha fechaAsignacion){
        this.fechaAsignacion = fechaAsignacion;
    }

    public void setFechaEntrega(Fecha fechaEntrega){
        this.fechaEntrega = fechaEntrega;
    }

    public void setTipoAyuda(TipoAyuda tipoAyuda) {
        this.tipoAyuda = tipoAyuda;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }


    public void setAyudas(ArrayList<Ayuda> ayudas) {
        this.ayudas = ayudas;
    }

    public void asignarAyuda(Estudiante estudiante, Ayuda ayuda) {
        ayudas.add(ayuda);
    }
    
    public void entregar() {
        this.fechaEntrega = new Fecha();
        this.estado = Estado.ENTREGADA;
    }

    public void rechazar() {
        this.fechaEntrega = new Fecha();
        this.estado = Estado.RECHAZADA;
    }

    public void actualizarEstadoAyuda(Ayuda ayuda, Estado nuevoEstado) {
        ayuda.setEstado(nuevoEstado);
        if (nuevoEstado == Estado.ENTREGADA || nuevoEstado == Estado.RECHAZADA) {
            ayuda.setFechaEntrega(new Fecha()); // Actualizar la fecha de entrega al momento de entregar o rechazar la ayuda
        }
    }

    public void generarResumen() {
        int ayudasEntregadas = 0;
        ArrayList <Estudiante> estudiantesFavorecidos = new ArrayList(); 

        for (Ayuda ayuda : ayudas) {
            if (ayuda.getEstado() == Estado.ENTREGADA) {
                ayudasEntregadas++;   
                estudiantesFavorecidos.add(ayuda.getEstudiante());
            }
        }

        System.out.println("Resumen de Ayudas:");
        System.out.println("Total de ayudas entregadas: " + ayudasEntregadas);
        System.out.println("Total de estudiantes favorecidos: " + estudiantesFavorecidos.size());
    }
}
