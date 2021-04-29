package com.arv.personas.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arv.personas.backend.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
