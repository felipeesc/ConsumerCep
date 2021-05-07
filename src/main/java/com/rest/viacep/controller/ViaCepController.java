package com.rest.viacep.controller;

import com.rest.viacep.controller.representation.ViaCepAPI;
import com.rest.viacep.controller.representation.response.EnderecoResponse;
import com.rest.viacep.services.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.rest.viacep.mapper.ViaCepMapper.toRepresentation;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/consulta/")
public class ViaCepController implements ViaCepAPI {

    private final ViaCepService cepService;

    @GetMapping(value = "/getCep/{cep}")
    public ResponseEntity<EnderecoResponse> obtemCep(@PathVariable(name = "cep") String cep) {
        EnderecoResponse enderecoDTO = toRepresentation(cepService.obtemCep(cep));
        return new ResponseEntity<>(enderecoDTO, HttpStatus.OK);
    }

}
