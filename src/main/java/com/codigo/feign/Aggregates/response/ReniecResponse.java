package com.codigo.feign.Aggregates.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReniecResponse {
    private String nombres;
    private String apellidoPaterno;
    private String ApellidoMaterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private String digitoVerificador;
}
