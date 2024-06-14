package com.octo.rdo.enzo.mobday.domain

data class Conversation(
    val userId: String,
    val consultantId: String,
    val messages: MutableList<Message>
)
