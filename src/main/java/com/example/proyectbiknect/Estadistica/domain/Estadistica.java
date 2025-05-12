package com.example.proyectbiknect.Estadistica.domain;

import com.example.proyectbiknect.Usuario.domain.Usuario;
import jakarta.persistence.*;

@Entity
public class Estadistica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private int nivelExp;
    private int cantRutasRecorridas;
}