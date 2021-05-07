package com.rest.viacep.controller.representation;

import com.rest.viacep.controller.representation.response.EnderecoResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@Api(value = "Api responsavel por manter consultas ao VIA CEP", consumes = MediaType.APPLICATION_JSON_VALUE)
public interface ViaCepAPI {
    @ApiOperation(value = "Consulta")
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "Consultando Cep",
                    response = EnderecoRepresentation.class),
            @ApiResponse(code = 403, message = " Não autorizado!")
    })
    ResponseEntity<EnderecoResponse> obtemCep(String cep);
}
