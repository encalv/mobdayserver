package com.octo.rdo.enzo.mobday.repository.liste

import com.octo.rdo.enzo.mobday.domain.Consultant

interface ConsultantRepository {
    fun getListeConsultant(): List<Consultant>
    fun getConsultantById(id: String): Consultant?
}
