package com.example.proyectbiknect.Usuario.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectbiknect.Usuario.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}