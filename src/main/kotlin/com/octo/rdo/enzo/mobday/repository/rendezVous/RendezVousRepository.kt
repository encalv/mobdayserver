package com.octo.rdo.enzo.mobday.repository.rendezVous

import com.octo.rdo.enzo.mobday.domain.RendezVous

interface RendezVousRepository {
    fun addRdv(rendezVous: RendezVous): Boolean
    fun getRdv(userId: String): List<RendezVous>
}
