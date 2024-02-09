package com.codigo.feign.Repository;

import com.codigo.feign.Entity.TipoDocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoRepository extends JpaRepository <TipoDocumentoEntity, Long> {
}
