package com.codigo.feign.Aggregates.response;

import lombok.*;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
    private int codigo;
    private String mensaje;
    private Optional data;
}
