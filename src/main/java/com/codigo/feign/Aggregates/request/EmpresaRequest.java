package com.codigo.feign.Aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaRequest {
    private String TipoDoc;
    private String numDoc;
}
