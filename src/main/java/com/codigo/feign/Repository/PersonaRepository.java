package com.codigo.feign.Repository;

import com.codigo.feign.Entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <PersonaEntity, Long> {
}
