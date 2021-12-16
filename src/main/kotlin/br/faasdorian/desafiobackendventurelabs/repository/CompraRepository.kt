package br.faasdorian.desafiobackendventurelabs.repository

import br.faasdorian.desafiobackendventurelabs.model.Compra
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CompraRepository: CrudRepository<Compra, Long> {
}
