package com.example.proyectbiknect.SocialProfile.domain;

import com.example.proyectbiknect.Usuario.domain.Usuario;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class PerfilSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
            name = "perfil_seguidor",
            joinColumns = @JoinColumn(name = "perfil_id"),
            inverseJoinColumns = @JoinColumn(name = "seguidor_id")
    )
    private Set<PerfilSocial> seguidores;
}