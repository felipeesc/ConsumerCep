package com.rest.viacep.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;


}
