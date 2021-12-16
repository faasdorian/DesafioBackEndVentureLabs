package br.faasdorian.desafiobackendventurelabs.model

import javax.persistence.*

@Table(name = "COMPANHIAS")
@Entity
@SequenceGenerator(name = "COMPANHIAS_SEQ", sequenceName = "COMPANHIAS_SEQ", initialValue = 1, allocationSize = 1)
class Companhia (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMPANHIAS_SEQ")
    @Column(name = "ID")
    val id: Long,

    @Column(name = "NOME")
    val nome: String
)