package br.faasdorian.desafiobackendventurelabs.repository

import br.faasdorian.desafiobackendventurelabs.model.Assento
import org.springframework.data.repository.CrudRepository
import org.springframework.lang.Nullable
import org.springframework.stereotype.Repository

@Repository
interface AssentoRepository: CrudRepository<Assento, Long> {

    @Nullable
    fun findByNumeracaoAndIdVoo(numeracao: String, idVoo: Long): Assento

}
