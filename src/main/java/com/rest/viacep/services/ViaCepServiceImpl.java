package com.rest.viacep.services;

import com.rest.viacep.config.RestConfiguration;
import com.rest.viacep.domain.dto.EnderecoDTO;
import com.rest.viacep.services.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class ViaCepServiceImpl implements ViaCepService {

    @Autowired
    private RestConfiguration rest;
    private final String uri = "http://viacep.com.br/ws/{cep}/json/";

    @Override
    public EnderecoDTO obtemCep(String cep) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("cep", cep);
        EnderecoDTO enderecoDTO = rest.restTemplate().getForObject(uri, EnderecoDTO.class, params);
        return enderecoDTO;
    }
}
