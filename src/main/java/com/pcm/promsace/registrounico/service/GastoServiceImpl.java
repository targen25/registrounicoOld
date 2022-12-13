package com.pcm.promsace.registrounico.service;

import com.pcm.promsace.registrounico.model.GastoModel;
import com.pcm.promsace.registrounico.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoServiceImpl implements GastoService {
    @Autowired
    private GastoRepository gastoRepository;

    @Override
    public GastoModel saveGasto(GastoModel gastoModel)
    {
        return gastoRepository.save(gastoModel);
    }
    @Override
    public void deleteGasto(Long gastoId)
    {
        gastoRepository.deleteById(gastoId);
    }
    @Override
    public List<GastoModel> findAllGasto()
    {
        return  gastoRepository.findAll();
    }
}
