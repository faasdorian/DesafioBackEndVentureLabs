package br.faasdorian.desafiobackendventurelabs.repository

import br.faasdorian.desafiobackendventurelabs.model.Voo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface VooRepository: CrudRepository<Voo, Long> {
}
