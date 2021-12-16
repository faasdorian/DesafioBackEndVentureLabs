package br.faasdorian.desafiobackendventurelabs.controller

import br.faasdorian.desafiobackendventurelabs.model.CompraRequest
import br.faasdorian.desafiobackendventurelabs.model.CompraResponse
import br.faasdorian.desafiobackendventurelabs.service.CompraService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class CompraController(private val compraService: CompraService) {

    @PostMapping("/comprar")
    fun comprarPassagem( @RequestBody compraRequest: CompraRequest): ResponseEntity<CompraResponse> {

        val compraResponse: CompraResponse = compraService.comprarPassagem(compraRequest)

        if (compraResponse.sucesso) {
            return ResponseEntity(compraResponse, HttpStatus.OK)
        } else {
            return ResponseEntity(compraResponse, HttpStatus.NOT_ACCEPTABLE)
        }
    }

}