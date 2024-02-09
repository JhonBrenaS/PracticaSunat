package com.codigo.feign.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "empresa")
public class EmpresaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "num_docu", nullable = false)
    private String numeroDocumento;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;

    @Column(name = "nom_comercial", nullable = false)
    private String nombreComercial;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    @Column(name = "usua_crea")
    private String usuarioCrea;

    @Column(name = "date_create")
    private Timestamp fechaCreacion;

    @Column(name = "usua_modif")
    private String usuarioModifica;

    @Column(name = "date_modif")
    private Timestamp fechaModificacion;

    @Column(name = "usua_delet")
    private String usuarioElimina;

    @Column(name = "date_delet")
    private Timestamp fechaEliminacion;

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id", referencedColumnName = "id_tipo_documento")
    private TipoDocumentoEntity tipoDocumento;
}