package com.codigo.feign.Service;

import com.codigo.feign.Aggregates.request.PersonaRequest;
import com.codigo.feign.Aggregates.response.BaseResponse;

public interface PersonaService {
    BaseResponse crearPersona(PersonaRequest personaRequest);

    BaseResponse getInfoReniec(String numero);
}
