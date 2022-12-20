package com.pcm.promsace.registrounico.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoGastoDiarioPageModel {
    private Integer anoEje;
    private Integer mesEje;
    private String nivelGobiernoNombre;
    private String sectorNombre;
    private String pliegoNombre;
    private String departamentoEjecutoraNombre;
    private String provinciaEjecutoraNombre;
    private String distritoEjecutoraNombre;
    private String programaPptoNombre;
    private String especificaDetNombre;
    private BigDecimal montoCertificado  ;
    private BigDecimal montoComprometidoAnual  ;
    private BigDecimal montoGirado  ;
    private Long pageTotalSize  ;
}
