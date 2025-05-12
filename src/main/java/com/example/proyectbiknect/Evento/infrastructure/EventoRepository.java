package com.example.proyectbiknect.Evento.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectbiknect.Evento.domain.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}