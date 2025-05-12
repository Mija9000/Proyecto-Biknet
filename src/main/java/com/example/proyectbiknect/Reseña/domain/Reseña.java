package com.example.proyectbiknect.Reseña.domain;

import com.example.proyectbiknect.Ruta.domain.Ruta;
import com.example.proyectbiknect.Usuario.domain.Usuario;
import jakarta.persistence.*;

@Entity
public class Reseña {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ruta_id")
    private Ruta ruta;
}