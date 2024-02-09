package com.codigo.feign.Controller;

import com.codigo.feign.Aggregates.response.BaseResponse;
import com.codigo.feign.Service.EmpresaService;
import com.codigo.feign.Service.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/sunat")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
    @GetMapping("/{numero}")
    public BaseResponse getInfoReniec(@PathVariable String numero){
        return empresaService.getInfoSunat(numero);
    }
}

