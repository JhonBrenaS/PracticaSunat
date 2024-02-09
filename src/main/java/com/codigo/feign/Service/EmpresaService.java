package com.codigo.feign.Service;

import com.codigo.feign.Aggregates.request.EmpresaRequest;
import com.codigo.feign.Aggregates.response.BaseResponse;

public interface EmpresaService {
    BaseResponse crearEmpresa(EmpresaRequest empresaRequest);

    BaseResponse getInfoSunat(String numero);
}
