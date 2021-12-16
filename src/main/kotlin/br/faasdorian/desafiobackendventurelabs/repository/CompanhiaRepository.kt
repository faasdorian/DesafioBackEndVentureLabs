package br.faasdorian.desafiobackendventurelabs.repository

import br.faasdorian.desafiobackendventurelabs.model.Companhia
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanhiaRepository: CrudRepository<Companhia, Long> {
}