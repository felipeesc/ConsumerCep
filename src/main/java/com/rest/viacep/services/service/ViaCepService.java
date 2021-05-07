package com.rest.viacep.services.service;

import com.rest.viacep.domain.dto.EnderecoDTO;

public interface ViaCepService {
    EnderecoDTO obtemCep(String cep);
}
