package com.codigo.feign.Service.Impl;

import com.codigo.feign.Aggregates.constants.Constants;
import com.codigo.feign.Aggregates.request.PersonaRequest;
import com.codigo.feign.Aggregates.response.BaseResponse;
import com.codigo.feign.Aggregates.response.ReniecResponse;
import com.codigo.feign.Repository.PersonaRepository;
import com.codigo.feign.Service.PersonaService;
import com.codigo.feign.feignClient.ReniecClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private PersonaRepository personaRepository;

    private final ReniecClient reniecClient;
    public PersonaServiceImpl(ReniecClient reniecClient, PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
        this.reniecClient = reniecClient;
    }

    @Value("${token.api}")
    private String tokenApi;
    @Override
    public BaseResponse crearPersona(PersonaRequest personaRequest) {
        return null;
    }

    @Override
    public BaseResponse getInfoReniec(String numero) {
        ReniecResponse response = getExecution(numero);
        if (response != null){
            return new BaseResponse(Constants.CODE_SUCCESS,Constants.MESS_SUCCESS, Optional.of(response));
        }else {
            return new BaseResponse(Constants.CODE_ERROR,Constants.MESS_ERROR, Optional.empty());
        }
    }
    //este metodo ejecutara directamente
    private ReniecResponse getExecution(String numero){
        String authorization = "Bearer "+tokenApi;
        return reniecClient.getInfo(numero,authorization);
    }
}