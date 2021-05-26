package com.rest.viacep.controller.representation.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class EnderecoResponse {

    @ApiModelProperty(example = "0000-000", position = 1)
    private String cep;

    @ApiModelProperty(example = "Quadra", position = 2)
    private String logradouro;

    @ApiModelProperty(example = "Proximo da rua", position = 3)
    private String complemento;

    @ApiModelProperty(example = "Sobradinho", position = 4)
    private String bairro;

    @ApiModelProperty(example = "Brasilia", position = 5)
    private String localidade;

    @ApiModelProperty(example = "DF", position = 6)
    private String uf;

    @ApiModelProperty(example = "3550308", position = 7)
    private String ibge;


}
