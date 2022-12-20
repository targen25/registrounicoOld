package com.pcm.promsace.registrounico.repository;

import com.pcm.promsace.registrounico.model.GastoDiarioModel;
import com.pcm.promsace.registrounico.model.ResultadoGastoDiarioModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GastoDiarioRepository extends JpaRepository<GastoDiarioModel, Long> {
    @Query("SELECT new com.pcm.promsace.registrounico.model.ResultadoGastoDiarioModel (" +
            "anoEje,mesEje,nivelGobiernoNombre,sectorNombre,pliegoNombre,departamentoEjecutoraNombre,provinciaEjecutoraNombre," +
            "distritoEjecutoraNombre,programaPptoNombre,especificaDetNombre,montoCertificado,montoComprometidoAnual,montoGirado) " +
            "FROM GastoDiarioModel g WHERE g.anoEje = :anoEje and g.mesEje = :mesEje ")
    Page<ResultadoGastoDiarioModel> findByYearMonth(@Param("anoEje") Integer anoEje, @Param("mesEje") Integer mesEje, Pageable pageable);
}
