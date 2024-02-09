package com.codigo.feign.Repository;

import com.codigo.feign.Entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository <EmpresaEntity, Long> {
}
