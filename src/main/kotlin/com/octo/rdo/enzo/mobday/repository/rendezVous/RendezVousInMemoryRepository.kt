package com.octo.rdo.enzo.mobday.repository.rendezVous

import com.octo.rdo.enzo.mobday.domain.RendezVous
import org.springframework.stereotype.Component

@Component
class RendezVousInMemoryRepository : RendezVousRepository {

    val rendezVousList = mutableListOf<RendezVous>()

    override fun addRdv(rendezVous: RendezVous): Boolean {
        println("In Memory Repository: Rendez-vous ajouté avec succès")
        addRdvToList(rendezVous)
        for (rdv in rendezVousList) {
            println("${rdv.userId}, ${rdv.consultantId}, ${rdv.duree}, ${rdv.date}")
        }
        return true
    }

    override fun getRdv(userId: String): List<RendezVous> {
        return rendezVousList.filter { it.userId == userId }
    }

    private fun addRdvToList(rendezVous: RendezVous) {
        rendezVousList.add(rendezVous)
    }
}
