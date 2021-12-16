package br.faasdorian.desafiobackendventurelabs.model

import javax.persistence.*

@Table(name = "ASSENTOS_COMPRADOS")
@Entity
@SequenceGenerator(name = "ASSENTOS_COMPRADOS_SEQ", sequenceName = "ASSENTOS_COMPRADOS_SEQ", initialValue = 1, allocationSize = 1)
class AssentosComprados (
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ASSENTOS_COMPRADOS_SEQ")
        @Column(name = "ID")
        val id: Long = 0,

        @Column(name = "ID_COMPRA")
        val idCompra: Long,

        @Column(name = "ID_ASSENTO")
        val idAssento: Long
)