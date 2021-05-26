package com.rest.viacep.mapper;

import com.rest.viacep.controller.representation.response.EnderecoResponse;
import com.rest.viacep.domain.dto.EnderecoDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ViaCepMapper {

    public static EnderecoResponse toRepresentation(EnderecoDTO dto){
        return EnderecoResponse.builder()
                .cep(dto.getCep())
                .bairro(dto.getBairro())
                .localidade(dto.getLocalidade())
                .logradouro(dto.getLogradouro())
                .complemento(dto.getComplemento())
                .uf(dto.getUf())
                .ibge(dto.getIbge())
                .alex(dto.getAlex())
                .build();
    }
}
