public class Main {
    public static void main(String[] args) {
        Ayuda ayuda = new Ayuda();

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("1", "123456789",  "Juan", new Fecha(01,01,2000), 3, "juan@example.com", TipoDocumento.CC);
        Estudiante estudiante2 = new Estudiante("2", "987654321", "Maria", new Fecha(02,02,2001), 2, "maria@example.com", TipoDocumento.CC);
        
        // Crear ayudas
        Ayuda ayuda1 = new Ayuda(TipoAyuda.MERCADO, Estado.ASIGNADA, new Fecha());
        Ayuda ayuda2 = new Ayuda(TipoAyuda.COMPUTADOR, Estado.ASIGNADA, new Fecha());

        // Asignar ayudas a estudiantes
        ayuda.asignarAyuda(estudiante1, ayuda1);
        ayuda.asignarAyuda(estudiante2, ayuda2);

        // Actualizar estado de una ayuda
        ayuda.actualizarEstadoAyuda(ayuda1, Estado.ENTREGADA);
        ayuda.actualizarEstadoAyuda(ayuda2, Estado.ENTREGADA);

        // Generar resumen
        ayuda.generarResumen();
    }
}