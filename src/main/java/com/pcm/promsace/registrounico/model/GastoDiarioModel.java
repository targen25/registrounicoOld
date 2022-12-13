package com.pcm.promsace.registrounico.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="gasto_diario")
public class GastoDiarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name="primer_nivel")
    private Integer primerNivel;
    @Column(name="segundo_nivel")
    private Integer segundoNivel;
    @Column(name="tercer_nivel")
    private Integer tercerNivel;
    @Column(name = "ano_eje")
    private Integer anoEje;
    @Column(name = "mes_eje")
    private Integer mesEje;
    @Column(name = "nivel_gobierno")
    private String nivelGobierno;
    @Column(name = "nivel_gobierno_nombre")
    private String nivelGobiernoNombre;
    @Column(name = "sector")
    private Integer sector ;
    @Column(name = "sector_nombre")
    private String sectorNombre;
    @Column(name = "pliego")
    private Integer pliego  ;
    @Column(name = "pliego_nombre")
    private String pliegoNombre;
    @Column(name = "sec_ejec")
    private Integer secEjec  ;
    @Column(name = "ejecutora")
    private String ejecutora;
    @Column(name = "ejecutora_nombre")
    private String ejecutoraNombre;
    @Column(name = "departamento_ejecutora")
    private String departamentoEjecutora;
    @Column(name = "departamento_ejecutora_nombre")
    private String departamentoEjecutoraNombre;
    @Column(name = "provincia_ejecutora")
    private String provinciaEjecutora;
    @Column(name = "provincia_ejecutora_nombre")
    private String provinciaEjecutoraNombre;
    @Column(name = "distrito_ejecutora")
    private String distritoEjecutora;
    @Column(name = "distrito_ejecutora_nombre")
    private String distritoEjecutoraNombre;
    @Column(name = "sec_func")
    private Integer secFunc  ;
    @Column(name = "programa_ppto")
    private Integer programaPpto  ;
    @Column(name = "programa_ppto_nombre")
    private String programaPptoNombre;
    @Column(name = "tipo_act_proy")
    private Integer tipoActProy  ;
    @Column(name = "producto_proyecto")
    private Integer productoProyecto  ;
    @Column(name = "producto_proyecto_nombre")
    private String productoProyectoNombre;
    @Column(name = "actividad_accion_obra")
    private Integer actividadAccionObra  ;
    @Column(name = "actividad_accion_obra_nombre")
    private String actividadAccionObraNombre;
    @Column(name = "funcion")
    private String funcion;
    @Column(name = "funcion_nombre")
    private String funcionNombre;
    @Column(name = "division_funcional")
    private String divisionFuncional;
    @Column(name = "division_funcional_nombre")
    private String divisionFuncionalNombre;
    @Column(name = "grupo_funcional")
    private String grupoFuncional;
    @Column(name = "grupo_funcional_nombre")
    private String grupoFuncionalNombre;
    @Column(name = "meta")
    private String meta;
    @Column(name = "finalidad")
    private String finalidad;
    @Column(name = "meta_nombre")
    private String metaNombre;
    @Column(name = "departamento_meta")
    private String departamentoMeta;
    @Column(name = "departamento_meta_nombre")
    private String departamentoMetaNombre;
    @Column(name = "fuente_financ")
    private Integer fuenteFinanc  ;
    @Column(name = "fuente_financ_nombre")
    private String fuenteFinancNombre;
    @Column(name = "rubro")
    private String rubro;
    @Column(name = "rubro_nombre")
    private String rubroNombre;
    @Column(name = "tipo_recurso")
    private Integer tipoRecurso  ;
    @Column(name = "tipo_recurso_nombre")
    private String tipoRecursoNombre;
    @Column(name = "categ_gasto")
    private Integer categGasto  ;
    @Column(name = "categ_gasto_nombre")
    private String categGastoNombre;
    @Column(name = "tipo_transaccion")
    private Integer tipoTransaccion  ;
    @Column(name = "generica")
    private Integer generica  ;
    @Column(name = "generica_nombre")
    private String genericaNombre;
    @Column(name = "subgenerica")
    private Integer subgenerica  ;
    @Column(name = "subgenerica_nombre")
    private String subgenericaNombre;
    @Column(name = "subgenerica_det")
    private Integer subgenericaDet  ;
    @Column(name = "subgenerica_det_nombre")
    private String subgenericaDetNombre;
    @Column(name = "especifica")
    private String especifica  ;
    @Column(name = "especifica_nombre")
    private String especificaNombre;
    @Column(name = "especifica_det")
    private Integer especificaDet  ;
    @Column(name = "especifica_det_nombre")
    private String especificaDetNombre;
    @Column(name = "monto_pia", precision = 15, scale = 2)
    private BigDecimal montoPia  ;
    @Column(name = "monto_pim", precision = 15, scale = 2)
    private BigDecimal montoPim  ;
    @Column(name = "monto_certificado", precision = 15, scale = 2)
    private BigDecimal montoCertificado  ;
    @Column(name = "monto_comprometido_anual", precision = 15, scale = 2)
    private BigDecimal montoComprometidoAnual  ;
    @Column(name = "monto_comprometido", precision = 15, scale = 2)
    private BigDecimal montoComprometido  ;
    @Column(name = "monto_devengado", precision = 15, scale = 2)
    private BigDecimal montoDevengado  ;
    @Column(name = "monto_girado", precision = 15, scale = 2)
    private BigDecimal montoGirado  ;
}
