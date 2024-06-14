package com.octo.rdo.enzo.mobday.domain

import java.time.LocalDate

data class RendezVous(
    val userId: String,
    val consultantId: String,
    val duree: DureeEnum,
    val date: LocalDate,
)

enum class DureeEnum {
    HEURE,
    DEMI_JOURNEE,
    JOURNEE,
}
