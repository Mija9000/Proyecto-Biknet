package com.example.proyectbiknect.Participacion.domain;

import com.example.proyectbiknect.Evento.domain.Evento;
import com.example.proyectbiknect.Usuario.domain.Usuario;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
//@IdClass(ParticipacionId.class)  tdv no estoy seguro que es
public class Participacion {
    @Id
    private Long usuarioId;

    @Id
    private Long eventoId;

    @ManyToOne
    @JoinColumn(name = "usuarioId", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "eventoId", insertable = false, updatable = false)
    private Evento evento;
}