package com.example.proyectbiknect.Reseña.infrastructure;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectbiknect.Reseña.domain.Reseña;

public interface ReseñaRepository extends JpaRepository<Reseña, Long> {
}