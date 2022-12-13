package com.pcm.promsace.registrounico.service;

import com.pcm.promsace.registrounico.model.GastoModel;

import java.util.List;

public interface GastoService {
    GastoModel saveGasto(GastoModel gastoModel);

    void deleteGasto(Long gastoId);

    List<GastoModel> findAllGasto();
}
