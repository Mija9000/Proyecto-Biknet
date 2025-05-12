package com.example.proyectbiknect.Lista_usuarios_evento.infrastructure;

import com.example.proyectbiknect.Lista_usuarios_evento.domain.Lista_usuarios_evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Lista_usuarios_eventoRepository extends JpaRepository<Lista_usuarios_evento, Long> {
}
