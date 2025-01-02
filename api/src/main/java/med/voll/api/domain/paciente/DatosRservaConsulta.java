package med.voll.api.domain.paciente;

public record DatosRservaConsulta(Long id, String nombre, String email, String documento) {

    public DatosRservaConsulta(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getDocumento());
    }
}
