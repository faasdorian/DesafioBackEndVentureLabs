package br.faasdorian.desafiobackendventurelabs.model

class CompraRequest (

    val idVoo: Long,
    val assentosComprados: List<String>,
    val valorPago: Double

)
