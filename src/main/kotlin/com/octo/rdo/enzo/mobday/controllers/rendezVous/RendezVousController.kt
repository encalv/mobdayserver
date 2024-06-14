package com.octo.rdo.enzo.mobday.controllers.rendezVous

import com.octo.rdo.enzo.mobday.domain.DureeEnum
import com.octo.rdo.enzo.mobday.domain.RendezVous
import com.octo.rdo.enzo.mobday.usecase.AjoutRendezVousUseCase
import com.octo.rdo.enzo.mobday.usecase.GetListeRendezVousUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@Suppress("unused")
class RendezVousController(
    private val ajoutRendezVousUseCase: AjoutRendezVousUseCase,
    private val getListeRendezVousUseCase: GetListeRendezVousUseCase,
) {
    @RequestMapping("/rendezVous", method = [RequestMethod.POST])
    fun addRdv(@RequestBody rendezVousRequest: RendezVousRequestJson) {
        ajoutRendezVousUseCase.execute(rendezVousRequest.toRendezVous())
    }

    @RequestMapping("/rendezVous/{userId}", method = [RequestMethod.GET])
    fun getRdv(@PathVariable userId: String): ResponseEntity<*> {
        getListeRendezVousUseCase.execute(userId)
            .let { return ResponseEntity.ok(it) }
    }
}

fun RendezVousRequestJson.toRendezVous(): RendezVous {
    return RendezVous(
        userId = this.userId,
        consultantId = this.consultantId,
        duree = DureeEnum.valueOf(this.duree),
        date = LocalDate.parse(this.date)
    )
}
