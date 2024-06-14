package com.octo.rdo.enzo.mobday.controllers.liste

import com.octo.rdo.enzo.mobday.usecase.GetListeConsultantUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Suppress("unused")
class ListeConsultantController(private val getListeConsultantUseCase: GetListeConsultantUseCase) {
    @RequestMapping("/listeDesGens", method = [RequestMethod.GET])
    fun getListeConsultant(): ResponseEntity<*> {
        getListeConsultantUseCase.execute()
            .let { return ResponseEntity.ok(it) }
    }
}


