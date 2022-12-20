package com.pcm.promsace.registrounico.service;

import com.pcm.promsace.registrounico.model.ResultadoGastoDiarioPageModel;

import java.util.List;

public interface GastoDiarioService {
    List<ResultadoGastoDiarioPageModel> findByYearMonth(Integer anoEje, Integer mesEje, Integer page, Integer size);
}
