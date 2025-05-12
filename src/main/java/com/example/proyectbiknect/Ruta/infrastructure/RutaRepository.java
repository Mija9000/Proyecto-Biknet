package com.example.proyectbiknect.Ruta.infrastructure;

import com.example.proyectbiknect.Ruta.domain.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RutaRepository extends JpaRepository<Ruta, Long> {
}