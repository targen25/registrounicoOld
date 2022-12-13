package com.pcm.promsace.registrounico.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="gasto")
public class GastoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ano_eje")
    private Integer anoEje;

    @Column(name = "mes_eje")
    private Integer mesEje;

    @Column(name = "nivel_gobierno", length = 4)
    private String nivelGobierno;

    @Column(name = "nivel_gobierno_nombre",length = 200)
    private String nivelGobiernoNombre;

}
