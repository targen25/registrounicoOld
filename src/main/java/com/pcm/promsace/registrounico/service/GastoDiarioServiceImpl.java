package com.pcm.promsace.registrounico.service;

import com.pcm.promsace.registrounico.model.ResultadoGastoDiarioModel;
import com.pcm.promsace.registrounico.model.ResultadoGastoDiarioPageModel;
import com.pcm.promsace.registrounico.repository.GastoDiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GastoDiarioServiceImpl implements  GastoDiarioService{
    @Autowired
    private GastoDiarioRepository gastoDiarioRepository;
    @Override
    public List<ResultadoGastoDiarioPageModel> findByYearMonth(Integer anoEje, Integer mesEje,Integer page, Integer size){
        Pageable pageable = PageRequest.of(page, size);
        Page<ResultadoGastoDiarioModel> gastoDiariolist = gastoDiarioRepository.findByYearMonth(anoEje, mesEje,pageable);
        List<ResultadoGastoDiarioPageModel> gastoDiarioPageList = new ArrayList();
        ResultadoGastoDiarioPageModel objectTemp = null;
        long totalSize = gastoDiariolist.getTotalElements();
        for (ResultadoGastoDiarioModel item: gastoDiariolist.getContent()) {
            objectTemp = new ResultadoGastoDiarioPageModel();
            objectTemp.setAnoEje(item.getAnoEje());
            objectTemp.setMesEje(item.getMesEje());
            objectTemp.setNivelGobiernoNombre(item.getNivelGobiernoNombre());
            objectTemp.setSectorNombre(item.getSectorNombre());
            objectTemp.setPliegoNombre(item.getPliegoNombre());
            objectTemp.setDepartamentoEjecutoraNombre(item.getDepartamentoEjecutoraNombre());
            objectTemp.setProvinciaEjecutoraNombre(item.getProvinciaEjecutoraNombre());
            objectTemp.setDistritoEjecutoraNombre(item.getDistritoEjecutoraNombre());
            objectTemp.setProgramaPptoNombre(item.getProgramaPptoNombre());
            objectTemp.setEspecificaDetNombre(item.getEspecificaDetNombre());
            objectTemp.setMontoCertificado(item.getMontoCertificado());
            objectTemp.setMontoComprometidoAnual(item.getMontoComprometidoAnual());
            objectTemp.setMontoGirado(item.getMontoGirado());
            objectTemp.setPageTotalSize(totalSize);
            gastoDiarioPageList.add(objectTemp);
        }
        return  gastoDiarioPageList;
    }
}
