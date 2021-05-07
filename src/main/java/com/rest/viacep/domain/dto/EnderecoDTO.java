package com.rest.viacep.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class EnderecoDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
}
