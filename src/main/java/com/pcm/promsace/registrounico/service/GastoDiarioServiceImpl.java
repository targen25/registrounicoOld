package com.pcm.promsace.registrounico.service;

import com.pcm.promsace.registrounico.model.ResultadoGastoDiarioModel;
import com.pcm.promsace.registrounico.repository.GastoDiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoDiarioServiceImpl implements  GastoDiarioService{
    @Autowired
    private GastoDiarioRepository gastoDiarioRepository;
    @Override
    public List<ResultadoGastoDiarioModel> findByYearMonth(Integer anoEje, Integer mesEje){
        return  gastoDiarioRepository.findByYearMonth(anoEje, mesEje);
    }
}
