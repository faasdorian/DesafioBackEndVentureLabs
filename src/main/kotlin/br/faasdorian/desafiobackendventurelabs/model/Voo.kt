package br.faasdorian.desafiobackendventurelabs.model

import java.util.*
import javax.persistence.*

@Table(name = "VOOS")
@Entity
@SequenceGenerator(name = "VOOS_SEQ", sequenceName = "VOOS_SEQ", initialValue = 1, allocationSize = 1)
class Voo (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOOS_SEQ")
    @Column(name = "ID")
    val id: Long,

    @Column(name = "ID_COMPANHIA")
    val idCompanhia: Long,

    @Column(name = "HORARIO_SAIDA")
    val horarioSaida: Date,

    @Column(name = "HORARIO_CHEGADA")
    val horarioChegada: Date,

    @Column(name = "AEROPORTO_ORIGEM")
    val aeroportoOrigem: String,

    @Column(name = "AEROPORTO_DESTINO")
    val aeroportoDestino: String,

    @Column(name = "PRECO_PASSAGEM")
    val precoPassagem: Double
)