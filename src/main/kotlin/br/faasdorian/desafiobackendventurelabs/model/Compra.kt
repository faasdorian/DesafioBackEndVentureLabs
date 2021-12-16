package br.faasdorian.desafiobackendventurelabs.model

import javax.persistence.*

@Table(name = "COMPRAS")
@Entity
@SequenceGenerator(name = "COMPRAS_SEQ", sequenceName = "COMPRAS_SEQ", initialValue = 1, allocationSize = 1)
class Compra (

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMPRAS_SEQ")
        @Column(name = "ID")
        val id: Long = 0,

        @Column(name = "ID_VOO")
        val idVoo: Long,

        @Column(name = "VALOR_PAGO")
        val valorPago: Double
)