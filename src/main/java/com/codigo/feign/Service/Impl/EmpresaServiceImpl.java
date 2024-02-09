package com.codigo.feign.Service.Impl;

import com.codigo.feign.Aggregates.constants.Constants;
import com.codigo.feign.Aggregates.request.EmpresaRequest;
import com.codigo.feign.Aggregates.response.BaseResponse;
import com.codigo.feign.Aggregates.response.ReniecResponse;
import com.codigo.feign.Aggregates.response.SunatResponse;
import com.codigo.feign.Repository.EmpresaRepository;
import com.codigo.feign.Service.EmpresaService;
import com.codigo.feign.feignClient.SunatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    private EmpresaRepository empresaRepository;

    private final SunatClient sunatClient;
    public EmpresaServiceImpl(EmpresaRepository empresaRepository, SunatClient sunatClient) {
        this.empresaRepository = empresaRepository;
        this.sunatClient = sunatClient;
    }

    @Value("${token.api}")
    private String tokenApi;

    @Override
    public BaseResponse crearEmpresa(EmpresaRequest empresaRequest) {
        return null;
    }

    @Override
    public BaseResponse getInfoSunat(String numero) {
        SunatResponse response = getExecution(numero);
        if (response != null){
            return new BaseResponse(Constants.CODE_SUCCESS,Constants.MESS_SUCCESS, Optional.of(response));
        }else {
            return new BaseResponse(Constants.CODE_ERROR,Constants.MESS_ERROR, Optional.empty());
        }
    }
    private SunatResponse getExecution(String numero){
        String authorization = "Bearer "+tokenApi;
        return sunatClient.getInfo(numero,authorization);
    }
}
