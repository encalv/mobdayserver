package com.octo.rdo.enzo.mobday.controllers.rendezVous

import com.fasterxml.jackson.annotation.JsonProperty

data class RendezVousRequestJson(
    @JsonProperty("userId")
    val userId: String,

    @JsonProperty("consultantId")
    val consultantId: String,

    @JsonProperty("duree")
    val duree: String,

    @JsonProperty("date")
    val date: String,
)
