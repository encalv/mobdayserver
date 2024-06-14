package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.domain.RendezVous
import com.octo.rdo.enzo.mobday.repository.rendezVous.RendezVousRepository
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class RecupererListeRendezVousUseCase(private val repository: RendezVousRepository) {
    fun recupererListeRendezVous(userId: String): List<RendezVous> = repository.getRdv(userId)
}
