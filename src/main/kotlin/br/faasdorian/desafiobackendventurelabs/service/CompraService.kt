package br.faasdorian.desafiobackendventurelabs.service

import br.faasdorian.desafiobackendventurelabs.model.*
import br.faasdorian.desafiobackendventurelabs.repository.AssentoRepository
import br.faasdorian.desafiobackendventurelabs.repository.AssentosCompradosRepository
import br.faasdorian.desafiobackendventurelabs.repository.CompraRepository
import br.faasdorian.desafiobackendventurelabs.repository.VooRepository
import org.springframework.stereotype.Service
import java.time.temporal.ChronoUnit
import java.util.*

@Service
class CompraService(private val vooRepository: VooRepository, private val assentoRepository: AssentoRepository, private val compraRepository: CompraRepository, private val assentosCompradosRepository: AssentosCompradosRepository) {

    fun comprarPassagem(compraRequest: CompraRequest): CompraResponse {

        val voo = vooRepository.findById(compraRequest.idVoo).get()

        if (compra1HoraAntesDoVoo(voo.horarioSaida)) {
            val assentos = getAssentos(compraRequest.assentosComprados, voo.id)

            if (assentos.size == compraRequest.assentosComprados.size && todosAssentosDisponiveis(assentos)) {

                efetuarCompra(compraRequest, assentos)
                return CompraResponse(true, "Compra efetuada com sucesso!")

            } else return CompraResponse(false, "Assentos requisitados indisponíveis.")

        } else return CompraResponse(false, "Compra uma hora antes do voo.")

    }

    private fun todosAssentosDisponiveis(assentos: List<Assento>): Boolean {
        assentos.forEach { index ->
            if (!index.disponivel) {
                return false
            }
        }

        return true
    }

    private fun efetuarCompra(compraRequest: CompraRequest, assentosDaCompraDisponiveis: List<Assento>) {
        val compra: Compra = compraRepository.save( Compra(idVoo = compraRequest.idVoo, valorPago = compraRequest.valorPago) )

        assentosDaCompraDisponiveis.forEach { index ->
            index.disponivel = false
            assentoRepository.save(index)
            assentosCompradosRepository.save( AssentosComprados( idCompra = compra.id, idAssento = index.id ) )
        }
    }

    private fun getAssentos(numeracoesAssentos: List<String>, idVoo: Long): List<Assento> {
        val assentosComprados: MutableList<Assento> = mutableListOf()

        numeracoesAssentos.forEach { index ->
            val assento: Assento = assentoRepository.findByNumeracaoAndIdVoo(index, idVoo)
            if (assento != null) {
                assentosComprados.add(assento)
            }
        }

        return assentosComprados
    }

    private fun compra1HoraAntesDoVoo(horarioSaida: Date): Boolean {
        val instantSaida = horarioSaida.toInstant()
        val instantAtual = Date().toInstant()
        return instantSaida.isBefore( instantAtual.minus( 1, ChronoUnit.HOURS) )
    }

}
