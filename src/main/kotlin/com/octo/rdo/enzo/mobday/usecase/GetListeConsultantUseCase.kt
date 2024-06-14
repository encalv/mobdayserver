package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.domain.Consultant
import com.octo.rdo.enzo.mobday.repository.liste.ConsultantRepository
import org.springframework.stereotype.Component

@Component
class GetListeConsultantUseCase(private val consultantRepository: ConsultantRepository) {
    fun execute(): List<Consultant> {
        return consultantRepository.getListeConsultant()
    }
}
