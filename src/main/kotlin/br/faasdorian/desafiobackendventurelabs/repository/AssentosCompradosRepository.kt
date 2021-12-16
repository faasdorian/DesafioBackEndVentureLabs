package br.faasdorian.desafiobackendventurelabs.repository

import br.faasdorian.desafiobackendventurelabs.model.AssentosComprados
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AssentosCompradosRepository: CrudRepository<AssentosComprados, Long> {

}
