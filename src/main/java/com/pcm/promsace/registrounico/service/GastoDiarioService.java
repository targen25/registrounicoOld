package com.pcm.promsace.registrounico.service;

import com.pcm.promsace.registrounico.model.ResultadoGastoDiarioModel;

import java.util.List;

public interface GastoDiarioService {
    List<ResultadoGastoDiarioModel> findByYearMonth(Integer anoEje, Integer mesEje);
}
