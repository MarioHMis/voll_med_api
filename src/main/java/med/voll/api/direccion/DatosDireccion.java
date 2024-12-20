package med.voll.api.direccion;

import lombok.Getter;

@Getter

public record DatosDireccion(String calle,
                             String distrito,
                             String ciudad,
                             String numero,
                             String complemento
) {}
