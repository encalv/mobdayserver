package com.octo.rdo.enzo.mobday.domain

data class Consultant(
    val id: String,
    val nom: String,
    val prenom: String,
    val niveau: String,
    val email: String,
    val tjm: Int,
    val photo: String,
    val competences: List<String>
)
