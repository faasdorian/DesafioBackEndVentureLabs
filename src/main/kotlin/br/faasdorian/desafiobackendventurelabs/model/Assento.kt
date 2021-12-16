package br.faasdorian.desafiobackendventurelabs.model

import javax.persistence.*

@Table(name = "ASSENTOS")
@Entity
@SequenceGenerator(name = "ASSENTOS_SEQ", sequenceName = "ASSENTOS_SEQ", initialValue = 1, allocationSize = 1)
class Assento (
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ASSENTOS_SEQ")
        @Column(name = "ID")
        val id: Long,

        @Column(name = "ID_VOO")
        val idVoo: Long,

        @Column(name = "NUMERACAO")
        val numeracao: String,

        @Column(name = "DISPONIVEL")
        var disponivel: Boolean
)