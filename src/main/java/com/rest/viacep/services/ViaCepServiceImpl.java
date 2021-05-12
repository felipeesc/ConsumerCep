package com.rest.viacep.services;

import com.rest.viacep.config.RestConfiguration;
import com.rest.viacep.domain.dto.EnderecoDTO;
import com.rest.viacep.domain.exception.ViaCepNotFoundException;
import com.rest.viacep.services.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiredArgsConstructor
@Service
public class ViaCepServiceImpl implements ViaCepService {

    @Autowired
    private RestConfiguration rest;
    private final String uri = "http://viacep.com.br/ws/{cep}/json/";

    @Override
    public EnderecoDTO obtemCep(String cep) {
        Map<String, String> params = getStringStringMap(cep);
        EnderecoDTO enderecoDTO = callCep(params);
        return enderecoDTO;
    }

    private EnderecoDTO callCep(Map<String, String> params) {
        if(isValid(params.get("cep"))) {
            return rest.restTemplate().getForObject(uri, EnderecoDTO.class, params);
        }

         throw new ViaCepNotFoundException("Cep inválido!");
    }

    private Map<String, String> getStringStringMap(String cep) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("cep", cep);
        return params;
    }

    public boolean isValid(String cep) {
        boolean result = false;
        if ( cep == null || "".equals(cep) ) {
            result = true;
        } else {
            Pattern pattern = Pattern.compile("^(([0-9]{2}\\.[0-9]{3}-[0-9]{3})|([0-9]{2}[0-9]{3}-[0-9]{3})|([0-9]{8}))$");
            Matcher matcher = pattern.matcher(cep);
            result = matcher.find();
        }
        return result;
    }
}
